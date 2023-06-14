package com.kulahin.vss.service;


import java.util.*;

import com.fasterxml.jackson.databind.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


import com.kulahin.vss.domain.Market;
import com.kulahin.vss.domain.Stock;
import com.kulahin.vss.domain.ValueStock;



public class StockServiceImpl implements StockService {

	private static Market[] companiesFromMarket;
	
	private static String marketURL 
	= "https://fmpcloud.io/api/v3/stock-screener?marketCapMoreThan=100000000&limit=7&apikey=b3c56aa926ebfdaa10615f1ab67cf0fe";

	private static String stockURL 
	= "https://financialmodelingprep.com/api/v3/ratios/TICKER?limit=1&apikey=573feb5d28f6f81fa721ea2b4b46dd69";

	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<ValueStock> getValueStocks(double maxPriceEarningsRatio, double maxPriceToBookRatio, double minReturnOnAssets,
			double maxDebtRatio, double minCashPerShare, double minDividendYield, double realPriceFairValue)   {
		
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		 try {
			companiesFromMarket = mapper.readValue(Market[].class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		List<ValueStock> valueStockList = new ArrayList<>();
		
		
		if(companiesFromMarket != null & companiesFromMarket.length >0) {
			
			String url = "";
			ValueStock valueStock = null;
			Stock stock = null;
			int counter = 0;
			
			
			for(Market market : companiesFromMarket) {
				url = stockURL.replaceAll("TICKER", market.getTicker());
				counter++;
				System.out.println(counter + " " + market.getTicker() + " | ");
			
			
			try {
				stock = restTemplate.getForObject(url, Stock.class);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (stock.getTicker() != null) {
				valueStock = getValueStock ( stock,  market.getTicker(),
						 maxPriceEarningsRatio,  maxPriceToBookRatio,  minReturnOnAssets,
						 maxDebtRatio,  minCashPerShare,  minDividendYield,  realPriceFairValue);
			}
			if (valueStock!=null) valueStockList.add(valueStock);
			} finally {}}}
			
			
		
		
		
		
		
			Collections.sort(valueStockList);
			return valueStockList;
	
		
		}	
		
	

	private ValueStock getValueStock(Stock stock, String ticker, double maxPriceEarningsRatio,
			double maxPriceToBookRatio, double minReturnOnAssets, double maxDebtRatio, double minCashPerShare,
			double minDividendYield, double realPriceFairValue) {
		if(stock != null) {
		double priceEarningsRatio = stock.getPriceEarningsRatio() != null ? stock.getPriceEarningsRatio() :0;
		double priceToBookRatio = stock.getPriceToBookRatio() != null ? stock.getPriceToBookRatio() :0;
		double returnOnAssets = stock.getReturnOnAssets() != null ? stock.getReturnOnAssets() :0;
		double debtRatio = stock.getDebtRatio() != null ? stock.getDebtRatio() :0;
		double cashPerShare = stock.getCashPerShare() != null ? stock.getCashPerShare() :0;
		double dividendYield = stock.getDividendYield() != null ? stock.getDividendYield() :0;
		double priceFairValue = stock.getPriceFairValue() != null ? stock.getPriceFairValue() :0;
		
		
		if(priceEarningsRatio < maxPriceEarningsRatio && priceToBookRatio < maxPriceToBookRatio &&
				returnOnAssets > minReturnOnAssets &&  debtRatio < maxDebtRatio &&
				cashPerShare>minCashPerShare &&  dividendYield> minDividendYield 
				&& realPriceFairValue> priceFairValue) {
		
		var valueStock = new ValueStock(ticker, priceEarningsRatio, priceToBookRatio, returnOnAssets *100, debtRatio * 100, 
				cashPerShare, dividendYield * 100, priceFairValue);
		
		return valueStock;
			}
		}
	return null;
	}

}

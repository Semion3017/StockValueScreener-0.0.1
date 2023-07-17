package com.kulahin.vss.service;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.core.exc.StreamReadException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


import com.kulahin.vss.domain.Market;
import com.kulahin.vss.domain.Stock;
import com.kulahin.vss.domain.ValueStock;



public class StockServiceImpl implements StockService  {

	private static String marketURL 
	= "https://fmpcloud.io/api/v3/stock-screener?marketCapMoreThan=100000000&limit=7&apikey=b3c56aa926ebfdaa10615f1ab67cf0fe";

	private static String stockURL 
	= "https://financialmodelingprep.com/api/v3/ratios/TICKER?limit=1&apikey=573feb5d28f6f81fa721ea2b4b46dd69";

	private String url;
	
	
	

	@Override
	public List<ValueStock> getValueStocks(double maxPriceEarningsRatio,
			double maxPriceToBookRatio, double minReturnOnAssets,
			double maxDebtRatio, double minCashPerShare, 
			double minDividendYield, double realPriceFairValue) throws StreamReadException, DatabindException, MalformedURLException, IOException {

			List<ValueStock> valueStockList = new ArrayList<>();
			
			Market [] firms =
				new ObjectMapper()
				.readValue(new URL("https://fmpcloud.io/api/v3/stock-screener?marketCapMoreThan=100000000&limit=7&apikey=b3c56aa926ebfdaa10615f1ab67cf0fe"),
						Market[].class);
			
			
			for (Market m: firms) {
			url = stockURL.replaceAll("TICKER", m.getTicker());
			
			Stock [] ratios = new ObjectMapper().readValue(new URL(url), Stock[].class);
			
			Stock ratio = ratios[0];

			ValueStock valueStock = getValueStock (ratio,  ratio.getTicker(),  maxPriceEarningsRatio,
					 maxPriceToBookRatio,  minReturnOnAssets,  maxDebtRatio,  minCashPerShare, minDividendYield, realPriceFairValue);
	
			if(valueStock != null) valueStockList.add(valueStock);
			}
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
		
		
		if (priceEarningsRatio < maxPriceEarningsRatio && priceToBookRatio < maxPriceToBookRatio
				&& returnOnAssets > minReturnOnAssets
				&& debtRatio < maxDebtRatio && cashPerShare > minCashPerShare
				&& dividendYield > minDividendYield 
				&& realPriceFairValue > priceFairValue) {
		
		var valueStock = new ValueStock(ticker, priceEarningsRatio, priceToBookRatio, returnOnAssets *100, debtRatio * 100, 
				cashPerShare, dividendYield * 100, priceFairValue);
		
		return valueStock;
			}
		}
	return null;
	}

}

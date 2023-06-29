package com.kulahin.vss.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.kulahin.vss.domain.*;
import com.kulahin.vss.service.*;


@RestController
public class ConsumerController {

	
	@Autowired
	private StockService stockService;
	
	@RequestMapping(value = "/valueStocksScreener", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ValueStock> getvalueStocksScreenerResults 
			(
					
				@RequestParam(name = "maxPriceEarningsRatio", defaultValue = "100000000")	
				double maxPriceEarningsRatio,	
					
				@RequestParam(name = "maxPriceToBookRatio", defaultValue = "100")	
				double maxPriceToBookRatio,
					
				@RequestParam(name = "minReturnOnAssets", defaultValue = "0")	
				double minReturnOnAssets,	
					
				@RequestParam(name = "maxDebtRatio", defaultValue = "100")	
				double maxDebtRatio,
					
				@RequestParam(name = "minCashPerShare", defaultValue = "0")	
				double minCashPerShare,
				
				@RequestParam(name = "minDividendYield", defaultValue = "0")	
				double minDividendYield,
				
				@RequestParam(name = "realPriceFairValue", defaultValue = "0")	
				double realPriceFairValue
					
					
					) throws StreamReadException, DatabindException, MalformedURLException, IOException {


		 return stockService.getValueStocks(maxPriceEarningsRatio, maxPriceToBookRatio, minReturnOnAssets, maxDebtRatio, minCashPerShare, minDividendYield, realPriceFairValue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


//List<ValueStock> res = new ArrayList<>();
//ValueStock ap = new ValueStock("APPL",2.3,5.2,5.1,9.3,8.9,7., 5.3);
//res.add(0, ap);

package com.kulahin.vss.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.kulahin.vss.domain.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

@Service
public interface StockService {
	
	
	public List<ValueStock> getValueStocks (
			
			
			 double maxPriceEarningsRatio,
			 double maxPriceToBookRatio,
			 double minReturnOnAssets,
			 double maxDebtRatio,
			 double minCashPerShare,
			 double minDividendYield,
			 double realPriceFairValue
			 
			) throws StreamReadException, DatabindException, MalformedURLException, IOException;
	
	
	
	
	
	
	
	

}

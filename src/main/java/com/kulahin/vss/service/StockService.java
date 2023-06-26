package com.kulahin.vss.service;

import org.springframework.stereotype.Service;
import com.kulahin.vss.domain.*;
import java.util.*;

@Service
public interface StockService {
	
	
	public List<ValueStock> getValueStocks(
			
			
			 double maxPriceEarningsRatio,
			 double maxPriceToBookRatio,
			 double minReturnOnAssets,
			 double maxDebtRatio,
			 double minCashPerShare,
			 double minDividendYield,
			 double realPriceFairValue
			 
			);
	
	
	
	
	
	
	
	

}

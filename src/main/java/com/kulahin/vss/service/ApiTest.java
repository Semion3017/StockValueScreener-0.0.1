package com.kulahin.vss.service;

import com.fasterxml.jackson.databind.*;
import com.kulahin.vss.domain.Market;
import com.kulahin.vss.domain.Stock;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.core.exc.StreamReadException;

import java.io.*;
import java.net.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.kulahin.vss.service.Inter26;

public class ApiTest implements Inter26{
	

	private static  Inter26 inter26 = new ApiTest();
	
	
	public static void main(String[] args) throws StreamReadException, DatabindException, MalformedURLException, IOException {
		Stock [] response =
				new ObjectMapper()
				.readValue(new URL("https://financialmodelingprep.com/api/v3/ratios/AAPL?limit=1&apikey=573feb5d28f6f81fa721ea2b4b46dd69"), Stock[].class);
//		for(int i=0; i< 3; i++) {
		System.out.println(response[0].getTicker());
		//}
		inter26.twentySix(5);
	
		
	}

	@Override
	public void twentySix(int r) {
		System.out.println(r*r*r);
		
	}

//    public void ts(int r) {
//    	inter26.twentySix(r);
//    }
 

	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

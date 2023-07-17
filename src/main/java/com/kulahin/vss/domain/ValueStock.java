package com.kulahin.vss.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ValueStock implements Comparable<Object>{

	@JsonProperty("symbol")
	private String ticker;
	
	
	@JsonProperty("priceEarningsRatio")
	private double priceEarningsRatio;
	
	@JsonProperty("priceToBookRatio")
	private double priceToBookRatio;
	
	@JsonProperty("returnOnAssets")
	private double returnOnAssets;
	
	@JsonProperty("debtRatio")
	private double debtRatio;
	
	@JsonProperty("cashPerShare")
	private double cashPerShare;
	
	@JsonProperty("dividendYield")
	private double dividendYield;
	
	@JsonProperty("priceFairValue")
	private double priceFairValue;
	
	
	@Override
	public int compareTo(Object o) {
		ValueStock valueStockObj = (ValueStock) o;
		return this.getTicker().compareTo(valueStockObj.getTicker());
	}
	
	
}

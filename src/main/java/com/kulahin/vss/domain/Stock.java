package com.kulahin.vss.domain;

import java.io.Serializable;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

//@JsonAutoDetect(fieldVisibility=Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"symbol",
"date",
"period",
"currentRatio",
"quickRatio",
"cashRatio",
"daysOfSalesOutstanding",
"daysOfInventoryOutstanding",
"operatingCycle",
"daysOfPayablesOutstanding",
"cashConversionCycle",
"grossProfitMargin",
"operatingProfitMargin",
"pretaxProfitMargin",
"netProfitMargin",
"effectiveTaxRate",
"returnOnAssets",
"returnOnEquity",
"returnOnCapitalEmployed",
"netIncomePerEBT",
"ebtPerEbit",
"ebitPerRevenue",
"debtRatio",
"debtEquityRatio",
"longTermDebtToCapitalization",
"totalDebtToCapitalization",
"interestCoverage",
"cashFlowToDebtRatio",
"companyEquityMultiplier",
"receivablesTurnover",
"payablesTurnover",
"inventoryTurnover",
"fixedAssetTurnover",
"assetTurnover",
"operatingCashFlowPerShare",
"freeCashFlowPerShare",
"cashPerShare",
"payoutRatio",
"operatingCashFlowSalesRatio",
"freeCashFlowOperatingCashFlowRatio",
"cashFlowCoverageRatios",
"shortTermCoverageRatios",
"capitalExpenditureCoverageRatio",
"dividendPaidAndCapexCoverageRatio",
"dividendPayoutRatio",
"priceBookValueRatio",
"priceToBookRatio",
"priceToSalesRatio",
"priceEarningsRatio",
"priceToFreeCashFlowsRatio",
"priceToOperatingCashFlowsRatio",
"priceCashFlowRatio",
"priceEarningsToGrowthRatio",
"priceSalesRatio",
"dividendYield",
"enterpriseValueMultiple",
"priceFairValue"
})
@Generated("jsonschema2pojo")
public class Stock implements Serializable
{

@JsonProperty("symbol")
private String ticker;

@JsonProperty("date")
private String date;

@JsonProperty("period")
private String period;

@JsonProperty("currentRatio")
private Double currentRatio;

@JsonProperty("quickRatio")
private Double quickRatio;

@JsonProperty("cashRatio")
private Double cashRatio;

@JsonProperty("daysOfSalesOutstanding")
private Double daysOfSalesOutstanding;

@JsonProperty("daysOfInventoryOutstanding")
private Double daysOfInventoryOutstanding;

@JsonProperty("operatingCycle")
private Double operatingCycle;

@JsonProperty("daysOfPayablesOutstanding")
private Double daysOfPayablesOutstanding;

@JsonProperty("cashConversionCycle")
private Double cashConversionCycle;

@JsonProperty("grossProfitMargin")
private Double grossProfitMargin;

@JsonProperty("operatingProfitMargin")
private Double operatingProfitMargin;

@JsonProperty("pretaxProfitMargin")
private Double pretaxProfitMargin;

@JsonProperty("netProfitMargin")
private Double netProfitMargin;

@JsonProperty("effectiveTaxRate")
private Double effectiveTaxRate;

@JsonProperty("returnOnAssets")
private Double returnOnAssets;

@JsonProperty("returnOnEquity")
private Double returnOnEquity;

@JsonProperty("returnOnCapitalEmployed")
private Double returnOnCapitalEmployed;

@JsonProperty("netIncomePerEBT")
private Double netIncomePerEBT;

@JsonProperty("ebtPerEbit")
private Double ebtPerEbit;

@JsonProperty("ebitPerRevenue")
private Double ebitPerRevenue;

@JsonProperty("debtRatio")
private Double debtRatio;

@JsonProperty("debtEquityRatio")
private Double debtEquityRatio;

@JsonProperty("longTermDebtToCapitalization")
private Double longTermDebtToCapitalization;

@JsonProperty("totalDebtToCapitalization")
private Double totalDebtToCapitalization;

@JsonProperty("interestCoverage")
private Double interestCoverage;

@JsonProperty("cashFlowToDebtRatio")
private Double cashFlowToDebtRatio;


@JsonProperty("companyEquityMultiplier")
private Double companyEquityMultiplier;


@JsonProperty("receivablesTurnover")
private Double receivablesTurnover;


@JsonProperty("payablesTurnover")
private Double payablesTurnover;


@JsonProperty("inventoryTurnover")
private Double inventoryTurnover;


@JsonProperty("fixedAssetTurnover")
private Double fixedAssetTurnover;


@JsonProperty("assetTurnover")
private Double assetTurnover;


@JsonProperty("operatingCashFlowPerShare")
private Double operatingCashFlowPerShare;


@JsonProperty("freeCashFlowPerShare")
private Double freeCashFlowPerShare;


@JsonProperty("cashPerShare")
private Double cashPerShare;


@JsonProperty("payoutRatio")
private Double payoutRatio;


@JsonProperty("operatingCashFlowSalesRatio")
private Double operatingCashFlowSalesRatio;


@JsonProperty("freeCashFlowOperatingCashFlowRatio")
private Double freeCashFlowOperatingCashFlowRatio;


@JsonProperty("cashFlowCoverageRatios")
private Double cashFlowCoverageRatios;


@JsonProperty("shortTermCoverageRatios")
private Double shortTermCoverageRatios;


@JsonProperty("capitalExpenditureCoverageRatio")
private Double capitalExpenditureCoverageRatio;


@JsonProperty("dividendPaidAndCapexCoverageRatio")
private Double dividendPaidAndCapexCoverageRatio;


@JsonProperty("dividendPayoutRatio")
private Double dividendPayoutRatio;


@JsonProperty("priceBookValueRatio")
private Double priceBookValueRatio;


@JsonProperty("priceToBookRatio")
private Double priceToBookRatio;


@JsonProperty("priceToSalesRatio")
private Double priceToSalesRatio;


@JsonProperty("priceEarningsRatio")
private Double priceEarningsRatio;


@JsonProperty("priceToFreeCashFlowsRatio")
private Double priceToFreeCashFlowsRatio;


@JsonProperty("priceToOperatingCashFlowsRatio")
private Double priceToOperatingCashFlowsRatio;


@JsonProperty("priceCashFlowRatio")
private Double priceCashFlowRatio;


@JsonProperty("priceEarningsToGrowthRatio")
private Double priceEarningsToGrowthRatio;


@JsonProperty("priceSalesRatio")
private Double priceSalesRatio;


@JsonProperty("dividendYield")
private Double dividendYield;


@JsonProperty("enterpriseValueMultiple")
private Double enterpriseValueMultiple;


@JsonProperty("priceFairValue")
private Double priceFairValue;



@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
private final static long serialVersionUID = -1552368289403826253L;

@JsonProperty("symbol")
public String getTicker() {
return ticker;
}

@JsonProperty("symbol")
public void setTicker(String ticker) {
this.ticker = ticker;
}

@JsonProperty("date")
public String getDate() {
return date;
}

@JsonProperty("date")
public void setDate(String date) {
this.date = date;
}

@JsonProperty("period")
public String getPeriod() {
return period;
}

@JsonProperty("period")
public void setPeriod(String period) {
this.period = period;
}

@JsonProperty("currentRatio")
public Double getCurrentRatio() {
return currentRatio;
}

@JsonProperty("currentRatio")
public void setCurrentRatio(Double currentRatio) {
this.currentRatio = currentRatio;
}

@JsonProperty("quickRatio")
public Double getQuickRatio() {
return quickRatio;
}

@JsonProperty("quickRatio")
public void setQuickRatio(Double quickRatio) {
this.quickRatio = quickRatio;
}

@JsonProperty("cashRatio")
public Double getCashRatio() {
return cashRatio;
}

@JsonProperty("cashRatio")
public void setCashRatio(Double cashRatio) {
this.cashRatio = cashRatio;
}

@JsonProperty("daysOfSalesOutstanding")
public Double getDaysOfSalesOutstanding() {
return daysOfSalesOutstanding;
}

@JsonProperty("daysOfSalesOutstanding")
public void setDaysOfSalesOutstanding(Double daysOfSalesOutstanding) {
this.daysOfSalesOutstanding = daysOfSalesOutstanding;
}

@JsonProperty("daysOfInventoryOutstanding")
public Double getDaysOfInventoryOutstanding() {
return daysOfInventoryOutstanding;
}

@JsonProperty("daysOfInventoryOutstanding")
public void setDaysOfInventoryOutstanding(Double daysOfInventoryOutstanding) {
this.daysOfInventoryOutstanding = daysOfInventoryOutstanding;
}

@JsonProperty("operatingCycle")
public Double getOperatingCycle() {
return operatingCycle;
}

@JsonProperty("operatingCycle")
public void setOperatingCycle(Double operatingCycle) {
this.operatingCycle = operatingCycle;
}

@JsonProperty("daysOfPayablesOutstanding")
public Double getDaysOfPayablesOutstanding() {
return daysOfPayablesOutstanding;
}

@JsonProperty("daysOfPayablesOutstanding")
public void setDaysOfPayablesOutstanding(Double daysOfPayablesOutstanding) {
this.daysOfPayablesOutstanding = daysOfPayablesOutstanding;
}

@JsonProperty("cashConversionCycle")
public Double getCashConversionCycle() {
return cashConversionCycle;
}

@JsonProperty("cashConversionCycle")
public void setCashConversionCycle(Double cashConversionCycle) {
this.cashConversionCycle = cashConversionCycle;
}

@JsonProperty("grossProfitMargin")
public Double getGrossProfitMargin() {
return grossProfitMargin;
}

@JsonProperty("grossProfitMargin")
public void setGrossProfitMargin(Double grossProfitMargin) {
this.grossProfitMargin = grossProfitMargin;
}

@JsonProperty("operatingProfitMargin")
public Double getOperatingProfitMargin() {
return operatingProfitMargin;
}

@JsonProperty("operatingProfitMargin")
public void setOperatingProfitMargin(Double operatingProfitMargin) {
this.operatingProfitMargin = operatingProfitMargin;
}

@JsonProperty("pretaxProfitMargin")
public Double getPretaxProfitMargin() {
return pretaxProfitMargin;
}

@JsonProperty("pretaxProfitMargin")
public void setPretaxProfitMargin(Double pretaxProfitMargin) {
this.pretaxProfitMargin = pretaxProfitMargin;
}

@JsonProperty("netProfitMargin")
public Double getNetProfitMargin() {
return netProfitMargin;
}

@JsonProperty("netProfitMargin")
public void setNetProfitMargin(Double netProfitMargin) {
this.netProfitMargin = netProfitMargin;
}

@JsonProperty("effectiveTaxRate")
public Double getEffectiveTaxRate() {
return effectiveTaxRate;
}

@JsonProperty("effectiveTaxRate")
public void setEffectiveTaxRate(Double effectiveTaxRate) {
this.effectiveTaxRate = effectiveTaxRate;
}

@JsonProperty("returnOnAssets")
public Double getReturnOnAssets() {
return returnOnAssets;
}

@JsonProperty("returnOnAssets")
public void setReturnOnAssets(Double returnOnAssets) {
this.returnOnAssets = returnOnAssets;
}

@JsonProperty("returnOnEquity")
public Double getReturnOnEquity() {
return returnOnEquity;
}

@JsonProperty("returnOnEquity")
public void setReturnOnEquity(Double returnOnEquity) {
this.returnOnEquity = returnOnEquity;
}

@JsonProperty("returnOnCapitalEmployed")
public Double getReturnOnCapitalEmployed() {
return returnOnCapitalEmployed;
}

@JsonProperty("returnOnCapitalEmployed")
public void setReturnOnCapitalEmployed(Double returnOnCapitalEmployed) {
this.returnOnCapitalEmployed = returnOnCapitalEmployed;
}

@JsonProperty("netIncomePerEBT")
public Double getNetIncomePerEBT() {
return netIncomePerEBT;
}

@JsonProperty("netIncomePerEBT")
public void setNetIncomePerEBT(Double netIncomePerEBT) {
this.netIncomePerEBT = netIncomePerEBT;
}

@JsonProperty("ebtPerEbit")
public Double getEbtPerEbit() {
return ebtPerEbit;
}

@JsonProperty("ebtPerEbit")
public void setEbtPerEbit(Double ebtPerEbit) {
this.ebtPerEbit = ebtPerEbit;
}

@JsonProperty("ebitPerRevenue")
public Double getEbitPerRevenue() {
return ebitPerRevenue;
}

@JsonProperty("ebitPerRevenue")
public void setEbitPerRevenue(Double ebitPerRevenue) {
this.ebitPerRevenue = ebitPerRevenue;
}

@JsonProperty("debtRatio")
public Double getDebtRatio() {
return debtRatio;
}

@JsonProperty("debtRatio")
public void setDebtRatio(Double debtRatio) {
this.debtRatio = debtRatio;
}

@JsonProperty("debtEquityRatio")
public Double getDebtEquityRatio() {
return debtEquityRatio;
}

@JsonProperty("debtEquityRatio")
public void setDebtEquityRatio(Double debtEquityRatio) {
this.debtEquityRatio = debtEquityRatio;
}

@JsonProperty("longTermDebtToCapitalization")
public Double getLongTermDebtToCapitalization() {
return longTermDebtToCapitalization;
}

@JsonProperty("longTermDebtToCapitalization")
public void setLongTermDebtToCapitalization(Double longTermDebtToCapitalization) {
this.longTermDebtToCapitalization = longTermDebtToCapitalization;
}

@JsonProperty("totalDebtToCapitalization")
public Double getTotalDebtToCapitalization() {
return totalDebtToCapitalization;
}

@JsonProperty("totalDebtToCapitalization")
public void setTotalDebtToCapitalization(Double totalDebtToCapitalization) {
this.totalDebtToCapitalization = totalDebtToCapitalization;
}

@JsonProperty("interestCoverage")
public Double getInterestCoverage() {
return interestCoverage;
}

@JsonProperty("interestCoverage")
public void setInterestCoverage(Double interestCoverage) {
this.interestCoverage = interestCoverage;
}

@JsonProperty("cashFlowToDebtRatio")
public Double getCashFlowToDebtRatio() {
return cashFlowToDebtRatio;
}

@JsonProperty("cashFlowToDebtRatio")
public void setCashFlowToDebtRatio(Double cashFlowToDebtRatio) {
this.cashFlowToDebtRatio = cashFlowToDebtRatio;
}

@JsonProperty("companyEquityMultiplier")
public Double getCompanyEquityMultiplier() {
return companyEquityMultiplier;
}

@JsonProperty("companyEquityMultiplier")
public void setCompanyEquityMultiplier(Double companyEquityMultiplier) {
this.companyEquityMultiplier = companyEquityMultiplier;
}

@JsonProperty("receivablesTurnover")
public Double getReceivablesTurnover() {
return receivablesTurnover;
}

@JsonProperty("receivablesTurnover")
public void setReceivablesTurnover(Double receivablesTurnover) {
this.receivablesTurnover = receivablesTurnover;
}

@JsonProperty("payablesTurnover")
public Double getPayablesTurnover() {
return payablesTurnover;
}

@JsonProperty("payablesTurnover")
public void setPayablesTurnover(Double payablesTurnover) {
this.payablesTurnover = payablesTurnover;
}

@JsonProperty("inventoryTurnover")
public Double getInventoryTurnover() {
return inventoryTurnover;
}

@JsonProperty("inventoryTurnover")
public void setInventoryTurnover(Double inventoryTurnover) {
this.inventoryTurnover = inventoryTurnover;
}

@JsonProperty("fixedAssetTurnover")
public Double getFixedAssetTurnover() {
return fixedAssetTurnover;
}

@JsonProperty("fixedAssetTurnover")
public void setFixedAssetTurnover(Double fixedAssetTurnover) {
this.fixedAssetTurnover = fixedAssetTurnover;
}

@JsonProperty("assetTurnover")
public Double getAssetTurnover() {
return assetTurnover;
}

@JsonProperty("assetTurnover")
public void setAssetTurnover(Double assetTurnover) {
this.assetTurnover = assetTurnover;
}

@JsonProperty("operatingCashFlowPerShare")
public Double getOperatingCashFlowPerShare() {
return operatingCashFlowPerShare;
}

@JsonProperty("operatingCashFlowPerShare")
public void setOperatingCashFlowPerShare(Double operatingCashFlowPerShare) {
this.operatingCashFlowPerShare = operatingCashFlowPerShare;
}

@JsonProperty("freeCashFlowPerShare")
public Double getFreeCashFlowPerShare() {
return freeCashFlowPerShare;
}

@JsonProperty("freeCashFlowPerShare")
public void setFreeCashFlowPerShare(Double freeCashFlowPerShare) {
this.freeCashFlowPerShare = freeCashFlowPerShare;
}

@JsonProperty("cashPerShare")
public Double getCashPerShare() {
return cashPerShare;
}

@JsonProperty("cashPerShare")
public void setCashPerShare(Double cashPerShare) {
this.cashPerShare = cashPerShare;
}

@JsonProperty("payoutRatio")
public Double getPayoutRatio() {
return payoutRatio;
}

@JsonProperty("payoutRatio")
public void setPayoutRatio(Double payoutRatio) {
this.payoutRatio = payoutRatio;
}

@JsonProperty("operatingCashFlowSalesRatio")
public Double getOperatingCashFlowSalesRatio() {
return operatingCashFlowSalesRatio;
}

@JsonProperty("operatingCashFlowSalesRatio")
public void setOperatingCashFlowSalesRatio(Double operatingCashFlowSalesRatio) {
this.operatingCashFlowSalesRatio = operatingCashFlowSalesRatio;
}

@JsonProperty("freeCashFlowOperatingCashFlowRatio")
public Double getFreeCashFlowOperatingCashFlowRatio() {
return freeCashFlowOperatingCashFlowRatio;
}

@JsonProperty("freeCashFlowOperatingCashFlowRatio")
public void setFreeCashFlowOperatingCashFlowRatio(Double freeCashFlowOperatingCashFlowRatio) {
this.freeCashFlowOperatingCashFlowRatio = freeCashFlowOperatingCashFlowRatio;
}

@JsonProperty("cashFlowCoverageRatios")
public Double getCashFlowCoverageRatios() {
return cashFlowCoverageRatios;
}

@JsonProperty("cashFlowCoverageRatios")
public void setCashFlowCoverageRatios(Double cashFlowCoverageRatios) {
this.cashFlowCoverageRatios = cashFlowCoverageRatios;
}

@JsonProperty("shortTermCoverageRatios")
public Double getShortTermCoverageRatios() {
return shortTermCoverageRatios;
}

@JsonProperty("shortTermCoverageRatios")
public void setShortTermCoverageRatios(Double shortTermCoverageRatios) {
this.shortTermCoverageRatios = shortTermCoverageRatios;
}

@JsonProperty("capitalExpenditureCoverageRatio")
public Double getCapitalExpenditureCoverageRatio() {
return capitalExpenditureCoverageRatio;
}

@JsonProperty("capitalExpenditureCoverageRatio")
public void setCapitalExpenditureCoverageRatio(Double capitalExpenditureCoverageRatio) {
this.capitalExpenditureCoverageRatio = capitalExpenditureCoverageRatio;
}

@JsonProperty("dividendPaidAndCapexCoverageRatio")
public Double getDividendPaidAndCapexCoverageRatio() {
return dividendPaidAndCapexCoverageRatio;
}

@JsonProperty("dividendPaidAndCapexCoverageRatio")
public void setDividendPaidAndCapexCoverageRatio(Double dividendPaidAndCapexCoverageRatio) {
this.dividendPaidAndCapexCoverageRatio = dividendPaidAndCapexCoverageRatio;
}

@JsonProperty("dividendPayoutRatio")
public Double getDividendPayoutRatio() {
return dividendPayoutRatio;
}

@JsonProperty("dividendPayoutRatio")
public void setDividendPayoutRatio(Double dividendPayoutRatio) {
this.dividendPayoutRatio = dividendPayoutRatio;
}

@JsonProperty("priceBookValueRatio")
public Double getPriceBookValueRatio() {
return priceBookValueRatio;
}

@JsonProperty("priceBookValueRatio")
public void setPriceBookValueRatio(Double priceBookValueRatio) {
this.priceBookValueRatio = priceBookValueRatio;
}

@JsonProperty("priceToBookRatio")
public Double getPriceToBookRatio() {
return priceToBookRatio;
}

@JsonProperty("priceToBookRatio")
public void setPriceToBookRatio(Double priceToBookRatio) {
this.priceToBookRatio = priceToBookRatio;
}

@JsonProperty("priceToSalesRatio")
public Double getPriceToSalesRatio() {
return priceToSalesRatio;
}

@JsonProperty("priceToSalesRatio")
public void setPriceToSalesRatio(Double priceToSalesRatio) {
this.priceToSalesRatio = priceToSalesRatio;
}

@JsonProperty("priceEarningsRatio")
public Double getPriceEarningsRatio() {
return priceEarningsRatio;
}

@JsonProperty("priceEarningsRatio")
public void setPriceEarningsRatio(Double priceEarningsRatio) {
this.priceEarningsRatio = priceEarningsRatio;
}

@JsonProperty("priceToFreeCashFlowsRatio")
public Double getPriceToFreeCashFlowsRatio() {
return priceToFreeCashFlowsRatio;
}

@JsonProperty("priceToFreeCashFlowsRatio")
public void setPriceToFreeCashFlowsRatio(Double priceToFreeCashFlowsRatio) {
this.priceToFreeCashFlowsRatio = priceToFreeCashFlowsRatio;
}

@JsonProperty("priceToOperatingCashFlowsRatio")
public Double getPriceToOperatingCashFlowsRatio() {
return priceToOperatingCashFlowsRatio;
}

@JsonProperty("priceToOperatingCashFlowsRatio")
public void setPriceToOperatingCashFlowsRatio(Double priceToOperatingCashFlowsRatio) {
this.priceToOperatingCashFlowsRatio = priceToOperatingCashFlowsRatio;
}

@JsonProperty("priceCashFlowRatio")
public Double getPriceCashFlowRatio() {
return priceCashFlowRatio;
}

@JsonProperty("priceCashFlowRatio")
public void setPriceCashFlowRatio(Double priceCashFlowRatio) {
this.priceCashFlowRatio = priceCashFlowRatio;
}

@JsonProperty("priceEarningsToGrowthRatio")
public Double getPriceEarningsToGrowthRatio() {
return priceEarningsToGrowthRatio;
}

@JsonProperty("priceEarningsToGrowthRatio")
public void setPriceEarningsToGrowthRatio(Double priceEarningsToGrowthRatio) {
this.priceEarningsToGrowthRatio = priceEarningsToGrowthRatio;
}

@JsonProperty("priceSalesRatio")
public Double getPriceSalesRatio() {
return priceSalesRatio;
}

@JsonProperty("priceSalesRatio")
public void setPriceSalesRatio(Double priceSalesRatio) {
this.priceSalesRatio = priceSalesRatio;
}

@JsonProperty("dividendYield")
public Double getDividendYield() {
return dividendYield;
}

@JsonProperty("dividendYield")
public void setDividendYield(Double dividendYield) {
this.dividendYield = dividendYield;
}

@JsonProperty("enterpriseValueMultiple")
public Double getEnterpriseValueMultiple() {
return enterpriseValueMultiple;
}

@JsonProperty("enterpriseValueMultiple")
public void setEnterpriseValueMultiple(Double enterpriseValueMultiple) {
this.enterpriseValueMultiple = enterpriseValueMultiple;
}

@JsonProperty("priceFairValue")
public Double getPriceFairValue() {
return priceFairValue;
}

@JsonProperty("priceFairValue")
public void setPriceFairValue(Double priceFairValue) {
this.priceFairValue = priceFairValue;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}






@Override
public String toString() {
StringBuilder sb = new StringBuilder();
//sb.append(Stock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("symbol");
sb.append('=');
sb.append(((this.ticker == null)?"<null>":this.ticker));
sb.append(',');
sb.append("date");
sb.append('=');
sb.append(((this.date == null)?"<null>":this.date));
sb.append(',');
sb.append("period");
sb.append('=');
sb.append(((this.period == null)?"<null>":this.period));
sb.append(',');
sb.append("currentRatio");
sb.append('=');
sb.append(((this.currentRatio == null)?"<null>":this.currentRatio));
sb.append(',');
sb.append("quickRatio");
sb.append('=');
sb.append(((this.quickRatio == null)?"<null>":this.quickRatio));
sb.append(',');
sb.append("cashRatio");
sb.append('=');
sb.append(((this.cashRatio == null)?"<null>":this.cashRatio));
sb.append(',');
sb.append("daysOfSalesOutstanding");
sb.append('=');
sb.append(((this.daysOfSalesOutstanding == null)?"<null>":this.daysOfSalesOutstanding));
sb.append(',');
sb.append("daysOfInventoryOutstanding");
sb.append('=');
sb.append(((this.daysOfInventoryOutstanding == null)?"<null>":this.daysOfInventoryOutstanding));
sb.append(',');
sb.append("operatingCycle");
sb.append('=');
sb.append(((this.operatingCycle == null)?"<null>":this.operatingCycle));
sb.append(',');
sb.append("daysOfPayablesOutstanding");
sb.append('=');
sb.append(((this.daysOfPayablesOutstanding == null)?"<null>":this.daysOfPayablesOutstanding));
sb.append(',');
sb.append("cashConversionCycle");
sb.append('=');
sb.append(((this.cashConversionCycle == null)?"<null>":this.cashConversionCycle));
sb.append(',');
sb.append("grossProfitMargin");
sb.append('=');
sb.append(((this.grossProfitMargin == null)?"<null>":this.grossProfitMargin));
sb.append(',');
sb.append("operatingProfitMargin");
sb.append('=');
sb.append(((this.operatingProfitMargin == null)?"<null>":this.operatingProfitMargin));
sb.append(',');
sb.append("pretaxProfitMargin");
sb.append('=');
sb.append(((this.pretaxProfitMargin == null)?"<null>":this.pretaxProfitMargin));
sb.append(',');
sb.append("netProfitMargin");
sb.append('=');
sb.append(((this.netProfitMargin == null)?"<null>":this.netProfitMargin));
sb.append(',');
sb.append("effectiveTaxRate");
sb.append('=');
sb.append(((this.effectiveTaxRate == null)?"<null>":this.effectiveTaxRate));
sb.append(',');
sb.append("returnOnAssets");
sb.append('=');
sb.append(((this.returnOnAssets == null)?"<null>":this.returnOnAssets));
sb.append(',');
sb.append("returnOnEquity");
sb.append('=');
sb.append(((this.returnOnEquity == null)?"<null>":this.returnOnEquity));
sb.append(',');
sb.append("returnOnCapitalEmployed");
sb.append('=');
sb.append(((this.returnOnCapitalEmployed == null)?"<null>":this.returnOnCapitalEmployed));
sb.append(',');
sb.append("netIncomePerEBT");
sb.append('=');
sb.append(((this.netIncomePerEBT == null)?"<null>":this.netIncomePerEBT));
sb.append(',');
sb.append("ebtPerEbit");
sb.append('=');
sb.append(((this.ebtPerEbit == null)?"<null>":this.ebtPerEbit));
sb.append(',');
sb.append("ebitPerRevenue");
sb.append('=');
sb.append(((this.ebitPerRevenue == null)?"<null>":this.ebitPerRevenue));
sb.append(',');
sb.append("debtRatio");
sb.append('=');
sb.append(((this.debtRatio == null)?"<null>":this.debtRatio));
sb.append(',');
sb.append("debtEquityRatio");
sb.append('=');
sb.append(((this.debtEquityRatio == null)?"<null>":this.debtEquityRatio));
sb.append(',');
sb.append("longTermDebtToCapitalization");
sb.append('=');
sb.append(((this.longTermDebtToCapitalization == null)?"<null>":this.longTermDebtToCapitalization));
sb.append(',');
sb.append("totalDebtToCapitalization");
sb.append('=');
sb.append(((this.totalDebtToCapitalization == null)?"<null>":this.totalDebtToCapitalization));
sb.append(',');
sb.append("interestCoverage");
sb.append('=');
sb.append(((this.interestCoverage == null)?"<null>":this.interestCoverage));
sb.append(',');
sb.append("cashFlowToDebtRatio");
sb.append('=');
sb.append(((this.cashFlowToDebtRatio == null)?"<null>":this.cashFlowToDebtRatio));
sb.append(',');
sb.append("companyEquityMultiplier");
sb.append('=');
sb.append(((this.companyEquityMultiplier == null)?"<null>":this.companyEquityMultiplier));
sb.append(',');
sb.append("receivablesTurnover");
sb.append('=');
sb.append(((this.receivablesTurnover == null)?"<null>":this.receivablesTurnover));
sb.append(',');
sb.append("payablesTurnover");
sb.append('=');
sb.append(((this.payablesTurnover == null)?"<null>":this.payablesTurnover));
sb.append(',');
sb.append("inventoryTurnover");
sb.append('=');
sb.append(((this.inventoryTurnover == null)?"<null>":this.inventoryTurnover));
sb.append(',');
sb.append("fixedAssetTurnover");
sb.append('=');
sb.append(((this.fixedAssetTurnover == null)?"<null>":this.fixedAssetTurnover));
sb.append(',');
sb.append("assetTurnover");
sb.append('=');
sb.append(((this.assetTurnover == null)?"<null>":this.assetTurnover));
sb.append(',');
sb.append("operatingCashFlowPerShare");
sb.append('=');
sb.append(((this.operatingCashFlowPerShare == null)?"<null>":this.operatingCashFlowPerShare));
sb.append(',');
sb.append("freeCashFlowPerShare");
sb.append('=');
sb.append(((this.freeCashFlowPerShare == null)?"<null>":this.freeCashFlowPerShare));
sb.append(',');
sb.append("cashPerShare");
sb.append('=');
sb.append(((this.cashPerShare == null)?"<null>":this.cashPerShare));
sb.append(',');
sb.append("payoutRatio");
sb.append('=');
sb.append(((this.payoutRatio == null)?"<null>":this.payoutRatio));
sb.append(',');
sb.append("operatingCashFlowSalesRatio");
sb.append('=');
sb.append(((this.operatingCashFlowSalesRatio == null)?"<null>":this.operatingCashFlowSalesRatio));
sb.append(',');
sb.append("freeCashFlowOperatingCashFlowRatio");
sb.append('=');
sb.append(((this.freeCashFlowOperatingCashFlowRatio == null)?"<null>":this.freeCashFlowOperatingCashFlowRatio));
sb.append(',');
sb.append("cashFlowCoverageRatios");
sb.append('=');
sb.append(((this.cashFlowCoverageRatios == null)?"<null>":this.cashFlowCoverageRatios));
sb.append(',');
sb.append("shortTermCoverageRatios");
sb.append('=');
sb.append(((this.shortTermCoverageRatios == null)?"<null>":this.shortTermCoverageRatios));
sb.append(',');
sb.append("capitalExpenditureCoverageRatio");
sb.append('=');
sb.append(((this.capitalExpenditureCoverageRatio == null)?"<null>":this.capitalExpenditureCoverageRatio));
sb.append(',');
sb.append("dividendPaidAndCapexCoverageRatio");
sb.append('=');
sb.append(((this.dividendPaidAndCapexCoverageRatio == null)?"<null>":this.dividendPaidAndCapexCoverageRatio));
sb.append(',');
sb.append("dividendPayoutRatio");
sb.append('=');
sb.append(((this.dividendPayoutRatio == null)?"<null>":this.dividendPayoutRatio));
sb.append(',');
sb.append("priceBookValueRatio");
sb.append('=');
sb.append(((this.priceBookValueRatio == null)?"<null>":this.priceBookValueRatio));
sb.append(',');
sb.append("priceToBookRatio");
sb.append('=');
sb.append(((this.priceToBookRatio == null)?"<null>":this.priceToBookRatio));
sb.append(',');
sb.append("priceToSalesRatio");
sb.append('=');
sb.append(((this.priceToSalesRatio == null)?"<null>":this.priceToSalesRatio));
sb.append(',');
sb.append("priceEarningsRatio");
sb.append('=');
sb.append(((this.priceEarningsRatio == null)?"<null>":this.priceEarningsRatio));
sb.append(',');
sb.append("priceToFreeCashFlowsRatio");
sb.append('=');
sb.append(((this.priceToFreeCashFlowsRatio == null)?"<null>":this.priceToFreeCashFlowsRatio));
sb.append(',');
sb.append("priceToOperatingCashFlowsRatio");
sb.append('=');
sb.append(((this.priceToOperatingCashFlowsRatio == null)?"<null>":this.priceToOperatingCashFlowsRatio));
sb.append(',');
sb.append("priceCashFlowRatio");
sb.append('=');
sb.append(((this.priceCashFlowRatio == null)?"<null>":this.priceCashFlowRatio));
sb.append(',');
sb.append("priceEarningsToGrowthRatio");
sb.append('=');
sb.append(((this.priceEarningsToGrowthRatio == null)?"<null>":this.priceEarningsToGrowthRatio));
sb.append(',');
sb.append("priceSalesRatio");
sb.append('=');
sb.append(((this.priceSalesRatio == null)?"<null>":this.priceSalesRatio));
sb.append(',');
sb.append("dividendYield");
sb.append('=');
sb.append(((this.dividendYield == null)?"<null>":this.dividendYield));
sb.append(',');
sb.append("enterpriseValueMultiple");
sb.append('=');
sb.append(((this.enterpriseValueMultiple == null)?"<null>":this.enterpriseValueMultiple));
sb.append(',');
sb.append("priceFairValue");
sb.append('=');
sb.append(((this.priceFairValue == null)?"<null>":this.priceFairValue));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}

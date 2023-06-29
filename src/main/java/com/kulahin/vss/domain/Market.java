package com.kulahin.vss.domain;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"symbol",
"companyName",
"marketCap",
"sector",
"industry",
"beta",
"price",
"lastAnnualDividend",
"volume",
"exchange",
"exchangeShortName",
"country",
"isEtf",
"isActivelyTrading"
})
@jakarta.annotation.Generated("jsonschema2pojo")
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class Market implements Serializable
{

@JsonProperty("symbol")
private String ticker;


@JsonProperty("companyName")
private String companyName;


@JsonProperty("marketCap")
private Long marketCap;


@JsonProperty("sector")
private String sector;


@JsonProperty("industry")
private String industry;


@JsonProperty("beta")
private Double beta;


@JsonProperty("price")
private Double price;


@JsonProperty("lastAnnualDividend")
private Double lastAnnualDividend;


@JsonProperty("volume")
private Integer volume;


@JsonProperty("exchange")
private String exchange;


@JsonProperty("exchangeShortName")
private String exchangeShortName;


@JsonProperty("country")
private String country;


@JsonProperty("isEtf")
private Boolean isEtf;


@JsonProperty("isActivelyTrading")
private Boolean isActivelyTrading;


@JsonIgnore
@Builder.Default
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


private final static long serialVersionUID = -6207317984149711382L;

@JsonProperty("symbol")
public String getTicker() {
return ticker;
}

@JsonProperty("symbol")
public void setTicker(String ticker) {
this.ticker = ticker;
}

@JsonProperty("companyName")
public String getCompanyName() {
return companyName;
}

@JsonProperty("companyName")
public void setCompanyName(String companyName) {
this.companyName = companyName;
}

@JsonProperty("marketCap")
public Long getMarketCap() {
return marketCap;
}

@JsonProperty("marketCap")
public void setMarketCap(Long marketCap) {
this.marketCap = marketCap;
}

@JsonProperty("sector")
public String getSector() {
return sector;
}

@JsonProperty("sector")
public void setSector(String sector) {
this.sector = sector;
}

@JsonProperty("industry")
public String getIndustry() {
return industry;
}

@JsonProperty("industry")
public void setIndustry(String industry) {
this.industry = industry;
}

@JsonProperty("beta")
public Double getBeta() {
return beta;
}

@JsonProperty("beta")
public void setBeta(Double beta) {
this.beta = beta;
}

@JsonProperty("price")
public Double getPrice() {
return price;
}

@JsonProperty("price")
public void setPrice(Double price) {
this.price = price;
}

@JsonProperty("lastAnnualDividend")
public Double getLastAnnualDividend() {
return lastAnnualDividend;
}

@JsonProperty("lastAnnualDividend")
public void setLastAnnualDividend(Double lastAnnualDividend) {
this.lastAnnualDividend = lastAnnualDividend;
}

@JsonProperty("volume")
public Integer getVolume() {
return volume;
}

@JsonProperty("volume")
public void setVolume(Integer volume) {
this.volume = volume;
}

@JsonProperty("exchange")
public String getExchange() {
return exchange;
}

@JsonProperty("exchange")
public void setExchange(String exchange) {
this.exchange = exchange;
}

@JsonProperty("exchangeShortName")
public String getExchangeShortName() {
return exchangeShortName;
}

@JsonProperty("exchangeShortName")
public void setExchangeShortName(String exchangeShortName) {
this.exchangeShortName = exchangeShortName;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("isEtf")
public Boolean getIsEtf() {
return isEtf;
}

@JsonProperty("isEtf")
public void setIsEtf(Boolean isEtf) {
this.isEtf = isEtf;
}

@JsonProperty("isActivelyTrading")
public Boolean getIsActivelyTrading() {
return isActivelyTrading;
}

@JsonProperty("isActivelyTrading")
public void setIsActivelyTrading(Boolean isActivelyTrading) {
this.isActivelyTrading = isActivelyTrading;
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
sb.append(Market.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("symbol");
sb.append('=');
sb.append(((this.ticker == null)?"<null>":this.ticker));
sb.append(',');
sb.append("companyName");
sb.append('=');
sb.append(((this.companyName == null)?"<null>":this.companyName));
sb.append(',');
sb.append("marketCap");
sb.append('=');
sb.append(((this.marketCap == null)?"<null>":this.marketCap));
sb.append(',');
sb.append("sector");
sb.append('=');
sb.append(((this.sector == null)?"<null>":this.sector));
sb.append(',');
sb.append("industry");
sb.append('=');
sb.append(((this.industry == null)?"<null>":this.industry));
sb.append(',');
sb.append("beta");
sb.append('=');
sb.append(((this.beta == null)?"<null>":this.beta));
sb.append(',');
sb.append("price");
sb.append('=');
sb.append(((this.price == null)?"<null>":this.price));
sb.append(',');
sb.append("lastAnnualDividend");
sb.append('=');
sb.append(((this.lastAnnualDividend == null)?"<null>":this.lastAnnualDividend));
sb.append(',');
sb.append("volume");
sb.append('=');
sb.append(((this.volume == null)?"<null>":this.volume));
sb.append(',');
sb.append("exchange");
sb.append('=');
sb.append(((this.exchange == null)?"<null>":this.exchange));
sb.append(',');
sb.append("exchangeShortName");
sb.append('=');
sb.append(((this.exchangeShortName == null)?"<null>":this.exchangeShortName));
sb.append(',');
sb.append("country");
sb.append('=');
sb.append(((this.country == null)?"<null>":this.country));
sb.append(',');
sb.append("isEtf");
sb.append('=');
sb.append(((this.isEtf == null)?"<null>":this.isEtf));
sb.append(',');
sb.append("isActivelyTrading");
sb.append('=');
sb.append(((this.isActivelyTrading == null)?"<null>":this.isActivelyTrading));
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

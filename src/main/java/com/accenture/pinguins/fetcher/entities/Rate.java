package com.accenture.pinguins.fetcher.entities;

public class Rate {
	
	private String baseCurrency;
	private String targetCurrency;
	private Double rate;
	
	public Rate(String baseCurrency,
			String targetCurrency,
			Double rate) {
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.rate = rate;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public Double getRateValue() {
		return rate;
	}

}

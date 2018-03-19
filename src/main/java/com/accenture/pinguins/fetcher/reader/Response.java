package com.accenture.pinguins.fetcher.reader;

import java.util.Date;

import com.accenture.pinguins.fetcher.entities.Rate;
/**
 * 
 Response
   +--Server-ID
   +--Date-Of-Request
   +--Language
   +--Rate
      +-- rate (value)
      +-- baseCurrency
      +-- targetCurrency
 */
public class Response {

	private String requestLanguage = "en";
	
	private Date timeOfResponse = new Date();
	private Rate rate;

	public Response(Rate rate) {
		super();
		this.rate = rate;
	}

	public Date getTimeOfResponse() {
		return timeOfResponse;
	}

	public Rate getRate() {
		return rate;
	}
}

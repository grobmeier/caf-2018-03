package com.accenture.pinguins.fetcher.reader;

import com.accenture.pinguins.fetcher.entities.Rate;

@Reader(apiUrl = "https://api.coindesk.com/api2")
public class CoindeskExchangeReader extends ExchangeReader {

	public Response readPrice(Request request) {
		this.getHelp();
		return null;
	}
	
	public  void getHelp() {
		System.out.println("Help!!!!");
	}
}

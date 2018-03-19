package com.accenture.pinguins.fetcher.reader;

import com.accenture.pinguins.fetcher.entities.Rate;

@Reader(apiUrl = "https://api.sherif.com/api2")
public class SherifExchangeReader extends ExchangeReader {
	
	@Override
	public Response readPrice(Request request) {
		return readPrice(request, "Chrstian");
	}

	public Response readPrice(Request request, String requestorName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

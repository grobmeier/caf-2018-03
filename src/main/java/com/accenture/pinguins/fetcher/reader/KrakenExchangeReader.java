package com.accenture.pinguins.fetcher.reader;

import com.accenture.pinguins.fetcher.entities.Rate;

@Reader(apiUrl = "https://api.kraken.com/api2")
public class KrakenExchangeReader extends ExchangeReader {
	
	@Override
	public Response readPrice(Request request) {
		return readPrice(request, "Chrstian");
	}

	public Response readPrice(Request request, String requestorName) {
		
		Rate rate = new Rate("EUR", "ETH", 10.0);
		Response response = new Response(rate);
		return response;
	}

	
}

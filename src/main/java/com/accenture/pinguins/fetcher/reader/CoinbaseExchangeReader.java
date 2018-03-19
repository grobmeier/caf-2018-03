package com.accenture.pinguins.fetcher.reader;

import com.accenture.pinguins.fetcher.entities.Rate;

@Reader(apiUrl = "https://api.coinbase.com/api2")
public class CoinbaseExchangeReader extends ExchangeReader {

	@Deprecated
	public void sayHello() {
		System.out.println("");
	}
	
	@Override
	public Response readPrice(Request request) throws Exception {
		 Rate rate = new Rate("EUR", "BTC", 2.0);
		Response response = new Response(rate);
		return response;
	}
	
}

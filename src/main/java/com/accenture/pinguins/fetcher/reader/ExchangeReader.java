package com.accenture.pinguins.fetcher.reader;

public abstract class ExchangeReader {

	enum Seasons { SUMMER, WINTER }; 
	
	protected String name;
	
	public Response readPrice(Request request) throws Exception {
		return null;
	}
	
	
	
}

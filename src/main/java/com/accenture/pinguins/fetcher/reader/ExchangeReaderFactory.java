package com.accenture.pinguins.fetcher.reader;

public class ExchangeReaderFactory {

	String test = "Hair";
	int i = 5;
	Integer a = 10;
	
	static {
		System.out.println("Static");
	}
	
	{
		System.out.println("Other");
	}
	
	public ExchangeReader getInstance(ReaderTypes type)  {
		
		if (ReaderTypes.COINBASE == type) {
			return new CoinbaseExchangeReader();
		} else if (ReaderTypes.KRAKEN == type) {
			return new KrakenExchangeReader();	
		} else if (ReaderTypes.COINDESK == type) {
			return new CoindeskExchangeReader();	
		} else if (ReaderTypes.SHERIF == type) {
			return new SherifExchangeReader();	
		} 
		//else {
		//	return new CoinbaseExchangeReader();
		//}
		throw new RuntimeException();
		
	}
}

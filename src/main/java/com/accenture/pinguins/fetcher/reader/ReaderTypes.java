package com.accenture.pinguins.fetcher.reader;

public enum ReaderTypes {
	COINBASE("https://api.coinbase.com/v2/asdfsadfs"),
	COINDESK("https://api.COINDESK.com/v2/asdfsadfs"),
	KRAKEN("https://api.KRAKEN.com/v2/asdfsadfs"),
	SHERIF("https://api.SHERIF.com/v2/asdfsadfs");
	
	private String apiUrl;
	
	private ReaderTypes(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	
	public String getUrl() {
		return apiUrl;
	}
}

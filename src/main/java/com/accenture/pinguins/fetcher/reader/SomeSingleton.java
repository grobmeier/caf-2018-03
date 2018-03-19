package com.accenture.pinguins.fetcher.reader;

public class SomeSingleton {

	private static SomeSingleton instance;
	
	private SomeSingleton() {
	}
	
	public static SomeSingleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SomeSingleton();
				}
			}
			
		}
		
		return instance;
	}
}

/*
App.java:

SomeSingleton.getInstance();

*/
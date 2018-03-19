package com.accenture.pinguins.fetcher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.accenture.pinguins.fetcher.entities.Rate;
import com.accenture.pinguins.fetcher.reader.CoindeskExchangeReader;
import com.accenture.pinguins.fetcher.reader.ExchangeReader;
import com.accenture.pinguins.fetcher.reader.ExchangeReaderConstants;
import com.accenture.pinguins.fetcher.reader.ExchangeReaderFactory;
import com.accenture.pinguins.fetcher.reader.ReaderTypes;
import com.accenture.pinguins.fetcher.reader.Request;
import com.accenture.pinguins.fetcher.reader.Response;
import com.accenture.pinguins.fetcher.reader.SomeSingleton;

public class App {
	public void execute() {
		ExchangeReader[] readers = new ExchangeReader[2];

//		ExchangeReaderFactory factory = new ExchangeReaderFactory();

		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.accenture.pinguins.fetcher.reader.ExchangeReaderFactory");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ExchangeReaderFactory factory = null;
		
		try {
			//factory = (ExchangeReaderFactory)clazz.newInstance();
			Object newInstance = clazz.newInstance();
			Method[] methods = newInstance.getClass().getDeclaredMethods();
			Method method = methods[0];
			Object reader = method.invoke(newInstance, ReaderTypes.COINBASE);
			
			Request request = new Request();
			Method readerMethod = reader.getClass().getMethods()[0];
			Response response = (Response)readerMethod.invoke(reader, request);
			System.out.println(response.getRate().getRateValue());
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		/*
		if (factory instanceof ExchangeReaderFactory) {
			System.out.println("Hello");
		}
		
		if (factory.getClass().isAssignableFrom(ExchangeReaderFactory.class)) {
			System.out.println("Hello");
		}
		
		System.out.println(factory.getClass().getSimpleName());
		
		readers[0] = factory.getInstance(ReaderTypes.COINBASE);
		readers[1] = factory.getInstance(ReaderTypes.KRAKEN);
		*/
		// readers[2] = new CoindeskExchangeReader();
		// readers[3] = new SherifExchangeReader();

		/*
		try {
			readFromExchanges(readers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	private void readFromExchanges(ExchangeReader[] readers) throws Exception {
		Request request = new Request();
		
		for (int i = 0; i < readers.length; i++) {
			ExchangeReader exchangeReader = readers[i];

			if (exchangeReader instanceof CoindeskExchangeReader) {
				((CoindeskExchangeReader) exchangeReader).getHelp();

			}
			Response response = exchangeReader.readPrice(request);

			Rate rate = response.getRate();
			System.out.println(rate.getRateValue() + " " + rate.getTargetCurrency());
		}
	}

	public static void main(String[] args) throws Exception {
		App app = new App();
		app.execute();
/*
		for (ReaderTypes readerType : ReaderTypes.values()) {
			System.out.println(readerType.getUrl());

		}

		System.out.println(ReaderTypes.valueOf("COINBASE").getUrl());

		SomeSingleton instance = SomeSingleton.getInstance();
		SomeSingleton instance2 = SomeSingleton.getInstance();

		System.out.println(instance);
		System.out.println(instance2);*/
	}
}

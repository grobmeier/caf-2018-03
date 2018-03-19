package com.accenture.pinguins.fetcher.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class RateTest {

	@Test
	public void testRate() {
		
		Rate rate = new Rate("EUR", "BTC", 10.0);
		
		assertEquals("EUR", rate.getBaseCurrency());
		assertEquals(10.0, rate.getRateValue(), 0);
		assertEquals("BTC", rate.getTargetCurrency());
		
	}

}

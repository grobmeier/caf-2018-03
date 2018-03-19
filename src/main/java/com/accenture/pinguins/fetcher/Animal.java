package com.accenture.pinguins.fetcher;

public class Animal {

	public void eat() {
		this.eat(null);
	}
	
	public void eat(String foodname) {
		if (foodname == null) {
			foodname = "";
		}
		System.out.println("Eat!! " + foodname);
	}
}

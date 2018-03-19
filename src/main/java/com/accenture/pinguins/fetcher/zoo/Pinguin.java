package com.accenture.pinguins.fetcher.zoo;


public class Pinguin implements Animal, Carnivore {

	public void something(Carnivore c) {
		System.out.println("Carnivore");
	}
	
	public void something(Animal c) {
		System.out.println("Animal");
	}
	
	public void something(Pinguin c) {
		System.out.println("Pinguin");
	}
	
	public static void main(String[] args) {
		Pinguin c = new Pinguin();
		
		new Pinguin().something(c);
	}
}

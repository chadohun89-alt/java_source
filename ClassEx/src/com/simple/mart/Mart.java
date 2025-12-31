package com.simple.mart;

public class Mart {

	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(10, 1000, 500);
		FruitSeller seller2 = new FruitSeller(10, 1000, 700);
		
		
		FruitBuyer buyer = new FruitBuyer(10000);
		
		
		buyer.buyAple(seller1, 1000);
		System.out.println("--------------------");
		buyer.buyAple(seller2, 1400);
		
		

	}

}

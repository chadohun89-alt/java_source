package com.simple.mart;

public class FruitSeller {
	private int numOfApple;
	int myMoney;
	final int APPLE_PRiCE;

	public FruitSeller(int numOfApple, int myMoney, int aPPLE_PRiCE) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRiCE = aPPLE_PRiCE;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRiCE;
		myMoney += money;
		numOfApple -= num;
		showSaleResult();
		return num;
	}

	private void showSaleResult() {
		System.out.println("남은 사과 : " +numOfApple);
		System.out.println("판매 수익 : " +myMoney);
	}
	
	
}

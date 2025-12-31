package com.simple.exam3;

import java.util.Random;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 배열에 난수 채우기
		// 길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.

		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		
			System.out.println("" +array[i]);
		}
		

	}

}

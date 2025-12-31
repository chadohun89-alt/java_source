package com.simple.exam;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 최댓값 구하기 (세 수)
		// 세 정수를 입력받아 가장 큰 수를 출력하세요.

		// 데이터 입력(변수)
		int n1;
		int n2;
		int n3;


		String result = "";

		Scanner kbd = new Scanner(System.in);
		System.out.print("점수1 입력 :");
		n1 = kbd.nextInt();
		System.out.print("점수2 입력 :");
		n2 = kbd.nextInt();
		System.out.print("점수3 입력 :");
		n3 = kbd.nextInt();
		
		boolean c1;
		boolean c2;
		boolean c3;
		boolean c4;
		boolean c5;
		boolean c6;
		c1 = n1 > n2 && n2 > n3 && n1 > n3; // n1 > n2 >n3
		c2 = n1 > n2 && n2 < n3 && n1 > n3; // n1 > n3 > n2
		c3 = n2 > n1 && n1 > n3 && n2 > n3; // n2 > n1 > n2
		c4 = n2 > n1 && n1 < n3 && n2 > n3; // n2 > n3 > n1
		c5 = n3 > n2 && n1 > n2 && n3 > n1; // n3 > n1 > n2
		c6 = n3 > n2 && n1 < n2 && n3 > n1; // n3 > n2 > n1

		// 데이터 처리
		if (c1) {
			System.out.println(n1);
		} else if (c2) {
			System.out.println(n1);
		} else if (c3) {
			System.out.println(n2);
		} else if (c4) {
			System.out.println(n2);
		} else if (c5) {
			System.out.println(n3);
		} else if (c6){
			System.out.println(n3);
		}

		// 데이터 출력

	}

}

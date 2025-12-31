package com.simple.exam;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 짝수인지 3의 배수인지 판별하기
		// 정수를 입력받아 짝수인지, 3의 배수인지, 둘 다인지, 아무것도 아닌지 출력하세요.

		// 데이터 입력(변수)
		int num;
		String result = "";

		Scanner kbd = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		num = kbd.nextInt();

		// 데이터 처리
		if (num % 2 == 0 && num % 3 == 0) {
			result = "짝수이자 " + "3의 배수";
		} else if(num % 2 == 0) {
			result = "그냥 짝수";
		} else if(num % 3 == 0) {
			result = "3의 배수";
		} else {
			result = "아무것도 아님";
		}

			// 데이터 출력
			System.out.println("결과 : " + result);
	}

}

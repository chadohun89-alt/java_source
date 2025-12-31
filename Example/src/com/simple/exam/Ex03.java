package com.simple.exam;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 나이 판별하기
		// 나이를 입력받아 성인(20세 이상)인지 미성년자인지 출력하세요.

		// 데이터 입력(변수)
		int age;
		String result = "";
		final int adult = 20;

		Scanner kbd = new Scanner(System.in);
		System.out.print("나이입력 :");
		age = kbd.nextInt();

		// 데이터 처리
		if (age >= adult) {
			result = "성인";

		} else {
			result = "미성년";
		}

		// 데이터 출력
		System.out.println("나이 : " + age);
		System.out.println("결과 : " + result);

	}

}

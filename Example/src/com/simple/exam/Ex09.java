package com.simple.exam;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 합격/불합격 판별하기
		// 점수를 입력받아 60점 이상이면 합격, 아니면 불합격을 출력하세요.


		// 데이터 입력(변수)
		int num1 = 0;
		String result = "";

		Scanner kbd = new Scanner(System.in);
		System.out.print("점수 입력 :");
		num1 = kbd.nextInt();

		
		// 데이터 처리
		if(num1 >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}
		

	// 데이터 출력
	System.out.println("결과 "+result);

}

}

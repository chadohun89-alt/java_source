package com.simple.exam;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 요일 출력하기
		// 1~7 사이의 숫자를 입력받아 1은 월요일, 2는 화요일 … 7은 일요일을 출력하세요.

		// 데이터 입력(변수)
		int num;
		String result = "";

		Scanner kbd = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		num = kbd.nextInt();


		// 데이터 처리
		switch (num) {
		case 1:
			result = "월요일";
			break;
		case 2:
			result = "화요일";
			break;
		case 3:
			result = "수요일";
			break;
		case 4:
			result = "목요일";
			break;
		case 5:
			result = "금요일";
			break;
		case 6:
			result = "토요일";
			break;
		case 7:
			result = "일요일";
			break;
		default:
			result = "숫자를 확인하시오";
		}

		// 데이터 출력
		System.out.println("요일 : " +result);
	}

}

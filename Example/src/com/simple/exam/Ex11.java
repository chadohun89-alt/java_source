package com.simple.exam;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// BMI 계산기
		// 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, 정상/과체중/저체중을 판별하세요.
		// 키를 170으로 입력하면 cm이므로 나누기 100을 하여 1.7을 구해서 단위를 m로 변경해야 합니다.
		// BMI = 몸무게(kg) ÷ (키(m) × 키(m))
		// BMI(체중(kg) ÷ 키(m)²)가 18.5 미만이면 저체중, 18.5~22.9 또는 23 미만이면 정상, 23 이상 또는
		// 23~24.9는 과체중

		// 데이터 입력(변수)
		double l_ = 0;

		double w = 0;


		String result = "";

		Scanner kbd = new Scanner(System.in);
		System.out.print("키 입력 :");
		l_ = kbd.nextDouble();
		System.out.print("몸무게 입력 :");
		w = kbd.nextDouble();

		// 데이터 처리
		double l = l_ / 100;
		double bmi = w / (l * l);
		
		if (bmi < 18.5) {
			result = "저체중";
		} else if (23 > bmi && bmi >= 18.5) {
			result = "정상";
		} else if (24.5 > bmi && bmi >= 23) {
			result = "과체중";
		} else {
			result = "도야지";
		}

		// 데이터 출력
		System.out.printf("BMI : %.2f ", bmi);
		System.out.println();
		System.out.println("BMI결과 :" + result);

	}

}

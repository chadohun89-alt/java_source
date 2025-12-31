package com.simple.exam;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 학점 판별하기
		// 점수를 입력받아 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 외는 F를 출력하세요.
		
		// 데이터 입력(변수)
		int score;
		String result = "";

		Scanner kbd = new Scanner(System.in);
		
		System.out.print("점수 :");
		
		String score_ = kbd.nextLine();
		score = Integer.parseInt(score_);
		
		
				
				
		
		// 데이터 처리
		if(score >= 90) {
			result = "A";
		}else if(score >= 80) {
			result = "B";
		}else if(score >= 70) {
			result = "C";
		}else {
			result = "F";
		}

		// 데이터 출력
		System.out.print("학점 : "+result);
		

	}

}

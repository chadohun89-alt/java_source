package com.simple.exam2;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {
		// 자리수 합 구하기
		// 사용자로부터 정수를 입력받아 각 자리수를 모두 더한 합을 출력하시오.
		// (예: 123 → 1+2+3=6)

		// 필요 기능들
		// 변수선언 (num, s, sum, i)
		// s는 num를 정수로 변환하는 기능
		// for (i = 0; ? ; i++) { substring(i, i+1 }
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String s1 = kbd.nextLine();
		int sum = 0;

		for (int i=0; i < s1.length();i++) {
			sum += Integer.parseInt(s1.substring(i, i+1));
		}
	
		System.out.println("각 자리수의 합 : " +sum);
		
		
	}

}

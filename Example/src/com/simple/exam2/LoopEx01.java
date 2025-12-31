package com.simple.exam2;

import java.util.Scanner;

public class LoopEx01 {

	public static void main(String[] args) {
		// 1부터 N까지의 수 중 소수 판별하기
		// 사용자로부터 정수 N을 입력받아 1부터 N까지의 수 중 소수만 출력하시오.
		// 소수 : 1과 자기 자신만을 약수로 갖는 수

		// 데이터 입력
		int num;
		int n1;
		int q;

		Scanner kbd = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = kbd.nextInt();

		// 데이터 처리
		// 소수만 출력?
		// 어떻게 소수만 남도록 만들지?
		// 나누기? n을 무엇으로 나누어야지?
		// 2부터 n-1까지 나누도록 해야한다는데
		// 오류 원인을 모르겠다.

		for (n1 = 2; n1 < num; ++n1) {
			 
		}

		// 데이터 출력
		System.out.print("결과 : " +n1);

	}

}

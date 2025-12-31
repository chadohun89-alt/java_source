package com.simple.loop;

public class LoopWhile {

	public static void main(String[] args) {
		// for : 정해진 횟수 만큼 반복
		int i;

		// 1, 3, 5, 7, 9
		for (i = 1; i <= 9; i++) {

			// i = i + 1; --> i++
			// i = i + 2; --> i+=2;

			System.out.println("i : " + i);
		}
		System.out.println();

		i = 0;
		int sum=0;
		int count = 0;
		int finalCount = 0;

		// 1부터 n까지의 숫자를 더해가면서 그 합이 100이 넘을때까지 반복하시오.
		//될 때까지 반복하시오.
		while (sum < 100) {
			sum = sum + i;
			System.out.println("i : " + i);
			System.out.println("합계 : " + sum);

			i++;
			finalCount = count++;
			// ++count;
		}

		// 반복획수 출력
		System.out.println("반복횟수: "+count);
		System.out.println("최종 반복횟수: "+finalCount);
		
		// 데이터 출력

		System.out.println("프로그램 종료됨");

	}

}

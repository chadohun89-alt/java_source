package com.simple.myexam;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        // 최댓값 구하기 (두 수)
        // 두 정수를 입력받아 더 큰 수를 출력하세요.

        int num1 = 0;
        int num2 = 0;
        int end = 0;

        Scanner kbd = new Scanner(System.in);
        do {
            System.out.println("숫자 2개 입력 : ");
            num1 = kbd.nextInt();
            num2 = kbd.nextInt();

            int result = (num1 > num2) ? num1 : num2;

            System.out.println("최댓값 : " + result);


            while (true) {
                System.out.println("프로그램 종료(0) / 재시작(1)");
                end = kbd.nextInt();
                if (end == 1) {
                    System.out.println("프로그램을 재시작 합니다");
                    break;
                } else if (end == 0) {
                    System.out.println("프로그램을 종료 합니다");
                    break;
                } else {
                    System.out.println("올바른 숫자를 입력해주십시오");
                }
            }

        } while (end != 0);

    }
}

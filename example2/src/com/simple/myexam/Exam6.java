package com.simple.myexam;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        // 최댓값 구하기 (세 수)
        // 세 정수를 입력받아 가장 큰 수를 출력하세요.

        int num1;
        int num2;
        int num3;
        int end;

        Scanner kbd = new Scanner(System.in);

        do {
            System.out.println("숫자를 3개 입력하세요");
            num1 = kbd.nextInt();
            num2 = kbd.nextInt();
            num3 = kbd.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("최댓값 : " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("최댓값 : " + num2);
            } else {
                System.out.println("최댓값 : " + num3);
            }

            while (true) {
                System.out.println("프로그램 종료(0) / 재시작(1)");
                end = kbd.nextInt();
                if(end == 1) {
                    System.out.println("프로그램 재시작");
                    break;
                } else if(end == 0) {
                    System.out.println("프로그램 종료");
                    break;
                } else {
                    System.out.println("올바른 숫자를 입력해 주세요");
                }
            }

        } while (end != 0);



    }
}

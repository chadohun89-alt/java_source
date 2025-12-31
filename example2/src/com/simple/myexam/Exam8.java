package com.simple.myexam;

import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        // 짝수인지 3의 배수인지 판별하기
        // 정수를 입력받아 짝수인지, 3의 배수인지, 둘 다인지, 아무것도 아닌지 출력하세요.

        int num1 = 0;
        int end = 0;


        Scanner kbd = new Scanner(System.in);

        do {
            System.out.println("숫자를 입력해주세요.");
            num1 = kbd.nextInt();


            if (num1 % 3 == 0 && num1 % 2 == 0) {
                System.out.println("짝수 + 3의 배수");
            } else if (num1 % 2 == 0) {
                System.out.println("단순 짝수");
            } else if (num1 % 3 == 0) {
                System.out.println("3의 배수");
            } else {
                System.out.println("아무것도 아닌 경우");
            }


            while (true){
                System.out.println("프로그램 종료(0) / 재시작(1)");
                end = kbd.nextInt();
                if (end == 0 ) {
                    System.out.println("프로그램 종료");
                    break;
                } else if (end == 1) {
                    System.out.println("프로그램 재시작");
                    break;
                } else {
                    System.out.println("숫자를 올바르게 입력해 주세요");
                }
            }

        }while (end != 0);
    }
}

package com.simple.myexam;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        // 나이 판별하기
        // 나이를 입력받아 성인(20세 이상)인지 미성년자인지 출력하세요.

        // 숫자(입력)
        // 불리언 함수 사용
        // 삼항연산자 사용

        int age = 0;
        final int adultAge = 20;
        boolean adult = false;
        int end = 0;

        Scanner kbd = new Scanner(System.in);

        do {
            System.out.print("나이를 입력해주세요 : ");
            age = kbd.nextInt();

            adult = (age >= adultAge) ? true : false;


            if (adult) {
                System.out.println("성인입니다");
            } else {
                System.out.println("미성년자입니다");
            }

            while (true) {

                System.out.print("종료버튼 0 / 재실행 버튼 1 ");
                end = kbd.nextInt();

                if (end == 1 || end ==0) {
                    break;
                }
            }
        } while(end !=0);

        System.out.println("프로그램 종료");


    }
}

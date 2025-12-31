package com.simple.myexam;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        // 양수/음수/0 판별하기
        // 정수를 입력받아 양수, 음수, 0 중 어떤 값인지 출력하세요.

        // 숫자를 입력 받아서
        // if문 사용
        // 만약 0보다 크다면 ~
        // 만약 0보다 작다면 ~
        // 만약 0이라면 ~

        int num = 0;
        int end = 0;
        String result = "";
        Scanner kbd = new Scanner(System.in);

        do {
            System.out.print("숫자를 입력하세요 : ");
            num = kbd.nextInt();
            System.out.println("입력된 숫자 : "+num);


            result = (num >= 0) ? "양수" : (num <= 0) ? "음수" : "0";
            System.out.println(result);

//            if (num >= 1) {
//                // 출력
//                System.out.println("양수");
//            } else if (num == 0) {
//                System.out.println("0");
//
//            } else {
//                System.out.println("음수");
//            }

            System.out.println("계속? 0입력");
            end = kbd.nextInt();
            switch (end) {
                case 0:
                    System.out.println("계속");
                    break;
                default:
                    System.out.println("종료");
                    break;
            }

        }while (end == 0);
        System.out.println("프로그램 종료 되었습니다");
    }
}

package com.simple.myexam;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        // 짝수/홀수 판별하기
        // 사용자로부터 정수를 입력받아 짝수인지 홀수인지 출력하세요.

        int end;
        Scanner kbd = new Scanner(System.in);
        int num = 0;
        String result;


        do {
            System.out.println("숫자를 입력하세요 : ");
            num = kbd.nextInt();
            result = (num % 2 == 0) ? "짝수" : "홀수";
            System.out.println(result);

            System.out.println("프로그램 종료(0이외 숫자)/계속(0)");
            end = kbd.nextInt();
        } while (end == 0);

        System.out.println("프로그램 종료");
    }
}

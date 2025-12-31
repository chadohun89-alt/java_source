package com.simple.myexam;

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        // 7. 요일 출력
        // 1~7 사이의 숫자를 입력받아 1은 월요일, 2는 화요일 … 7은 일요일을 출력하세요.

//
//        Scanner kbd = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요 : ");
//        int num = 0;
//        num = kbd.nextInt();
//
//        if (num == 7) {
//            System.out.println("일요일");
//        } else if (num == 6) {
//            System.out.println("토요일");
//        } else if (num == 5) {
//            System.out.println("금요일");
//
//        } else if (num == 4) {
//            System.out.println("목요일");
//        } else if (num == 3) {
//            System.out.println("수요일");
//        } else if (num == 2) {
//            System.out.println("화요일");
//        } else if (num == 1) {
//            System.out.println("월요일");
//        } else {
//            System.out.println("숫자를 올바로 입력하시오.");
//        }

        String [] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        int num = 0;
        int end=0;

        do {

            Scanner kbd = new Scanner(System.in);
            System.out.print("숫자를 입력하세요 : ");
            num = kbd.nextInt();

            if (num >= 1 && num <= 7) {
                System.out.println("요일 : "+days[num - 1]);
            } else {
                System.out.println("숫자를 올바르게 입력해 주세요");
            }

            while (true){

                System.out.println("프로그램 종료(0)/재시작(1)");
                end = kbd.nextInt();
                if(end == 0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (end == 1) {
                    System.out.println("프로그램을 재시작합니다.");
                    break;
                }else{
                    System.out.println("숫자를 올바르게 입력하시오.");
                }
            }
        }while (end != 0);
    }
}
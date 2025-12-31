package com.simple.myexam;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        // 학점 판별하기
        // 점수를 입력받아 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 외는 F를 출력하세요.

        int score = 0;
        int end = 0;
        Scanner kbd = new Scanner(System.in);

        do {
            System.out.println("점수를 입력해주세요 : ");
            score = kbd.nextInt();

            if (score >= 90) {
                score = 1;
            } else if (score >= 80) {
                score = 2;

            } else if (score >= 70) {
                score = 3;

            } else {
                score = 4;
            }

            switch (score) {
                case 1:
                    System.out.println("A 학점");
                    break;
                case 2:
                    System.out.println("B 학점");
                    break;
                case 3:
                    System.out.println("C 학점");
                    break;
                default:
                    System.out.println("D 학점");

            }
            while (true) {
                System.out.println("프로그램 종료(0) / 재시작(1)");
                end = kbd.nextInt();

                if (end == 1) {
                    System.out.println("프로그램을 재시작 합니다.");
                    break;
                } else if (end == 0) {
                    System.out.println("프로그램을 종료 합니다.");
                    break;
                } else {
                    System.out.println("숫자를 다시 입력해 주세요.");
                }

            }
        } while (end != 0);


    }
}




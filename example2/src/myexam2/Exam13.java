package myexam2;

import java.util.Scanner;

public class Exam13 {
    public static void main(String[] args) {
        // 윤년 판별하기
        // 연도를 입력받아 윤년인지 아닌지 판별하세요.
        // 조건: 4의 배수이면서 100의 배수가 아니거나, 400의 배수인 해는 윤년.

        int year = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.println("년도를 입력해 주세요");
        year = kbd.nextInt();

        if (year == 0) {
            System.out.println("0은 입력할 수 없습니다.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }


    }
}

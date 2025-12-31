package myexam2;

import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        // BMI 계산기
        // 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, 정상/과체중/저체중을 판별하세요.
        // 키를 170으로 입력하면 cm이므로 나누기 100을 하여 1.7을 구해서 단위를 m로 변경해야 합니다.
        // BMI = 몸무게(kg) ÷ (키(m) × 키(m))
        // 18.5 이하 저체중
        // 18.5 ~ 23 정상
        // 23 ~ 24.9 비만 전 단계
        // 25 ~ 35 비만


        double h = 0;
        double w = 0;
        double bmi = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.print("키를 입력해주세요 : ");
        h = kbd.nextDouble();

        System.out.print("몸무게를 입력해주세요 : ");
        w = kbd.nextDouble();

        bmi = w/ ((h/100) * (h/100));

        System.out.println(bmi);
        System.out.printf("%.2f", (float)(bmi));


    }

}


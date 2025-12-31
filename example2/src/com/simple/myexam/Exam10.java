package com.simple.myexam;

import java.util.Scanner;

public class Exam10 {
    // 문자 판별하기
    // 문자를 입력받아 알파벳 대문자인지, 소문자인지, 숫자인지 판별하세요.

    public static void main(String[] args) {
        char ch;

        Scanner kbd = new Scanner(System.in);

        System.out.print("문자를 입력해주세요 : ");
        ch = kbd.next().charAt(0);

        if (Character.isUpperCase(ch)){
            System.out.println(ch+"는 대문자입니다.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch+"는 소문자입니다.");

        } else if (Character.isDigit(ch)) {
            System.out.println(ch+"는 숫자입니다.");
        }else {
            System.out.println(ch+"는 특수문자입니다.");
        }


    }


}

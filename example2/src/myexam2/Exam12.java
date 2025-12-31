package myexam2;

import java.util.Scanner;

public class Exam12 {
    public static void main(String[] args) {
        //간단한 계산기 (switch문 활용)
        // 두 수와 연산자(+,-,*,/)를 입력받아 계산 결과를 출력하세요.

        int num1 = 0;
        int num2 = 0;
        double result = 0;
        String s = "";

        Scanner kbd = new Scanner(System.in);
        System.out.println("숫자와 연산자를 입력해 주세요. (예 : 3 + 2)");
        num1 = kbd.nextInt();

        s = kbd.next();
        num2 = kbd.nextInt();


        switch (s) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if(num2 !=0) {
                    result = (double) num1 / num2;

                } else {
                    System.out.println("0으로는 나눌 수 없습니다.");
                }
                break;

            default:
                System.out.println("연산자를 확인해 주세요");
                break;
        }


        System.out.println("결과 : "+result);


    }
}

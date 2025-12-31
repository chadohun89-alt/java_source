package com.simple.vm;

public class ProductOutput {

    // 생성자 명시적으로 선언하지 않아도 설정 돼 있음(디폴트 생성자)
    // 변수가 없으므로 별도로 생성자를 생성하지 않은 것

    public void dispense(Coffee coffee) {
        System.out.println("[출력]"+ coffee.getName()+"가 나왔습니다");
    }

}

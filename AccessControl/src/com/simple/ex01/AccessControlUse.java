package com.simple.ex01;

public class AccessControlUse {
    public static void main(String[] args) {
        AccessControlEx01 ac = new AccessControlEx01();

        ac.setName("똥길동");
        ac.setNum(1000);
        ac.shareMoney -= 10000;

        System.out.println(ac.getNum());


    }
}

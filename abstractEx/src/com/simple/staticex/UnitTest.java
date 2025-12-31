package com.simple.staticex;
class UnitConverter {
    // cm -> m
    public static double cmtoMeter(double cm) {
        return cm/100.0;
    }
}


public class UnitTest {
    public static void main(String[] args) {

        UnitConverter.cmtoMeter(214.1);

        Math.random();


    }
}

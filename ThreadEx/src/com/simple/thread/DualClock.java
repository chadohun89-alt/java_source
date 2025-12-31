package com.simple.thread;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DualClock {
    public static void main(String[] args) throws InterruptedException {
        // 한국시간 시계 쓰레드
        Thread usClock = new Thread(()->{
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("HH:mm:ss");
            while (true){
                LocalDateTime nowKorea = LocalDateTime.now(
                        ZoneId.of("America/New_York"));
                System.out.println("[미국시간]"+nowKorea.format(formatter));
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });

        // 데몬 쓰레드로 설정
//        koreaClock.setDaemon(true);
        usClock.setDaemon(true);

//        koreaClock. start();
        usClock. start();

        // 메인이 어느 정도 동작하도록 설정

        try {
            Thread.sleep(20000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


    }
}

package com.abin.lee.spring.boot.aviator.test;

public class TwoTest {
    private final long twepoch = 1420041600000L;

    public static void main(String[] args) {
        int userId = 12345;
        String userIdTwo = Integer.toBinaryString(userId);
        System.out.println("userId="+userId+",userIdTwo="+userIdTwo);
        int up = 0;
        Long timestamp = System.currentTimeMillis();

        String orderId = (timestamp-userIdTwo) <<

    }



}

package com.abin.lee.aviator.test.uniqueid;

public class TwoTest {
    private static final long twepoch = 1420041600000L;

    public static void main(String[] args) {
        int userId = 12345;
        String userIdTwo = Integer.toBinaryString(userId);
        System.out.println("userId="+userId+",userIdTwo="+userIdTwo);
        int up = 0;
        Long timestamp = System.currentTimeMillis();

        String orderId = String.valueOf((timestamp-twepoch) << 22L);

        
    }



}

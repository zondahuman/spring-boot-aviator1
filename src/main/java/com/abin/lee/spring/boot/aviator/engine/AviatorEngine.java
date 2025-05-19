package com.abin.lee.spring.boot.aviator.engine;

public class AviatorEngine {


    public double calculateDiscount(double totalAmount) {
        if (totalAmount > 1000) {
            return totalAmount * 0.1; // 10% discount for amounts over 1000
        } else {
            return totalAmount * 0.05; // 5% discount otherwise
        }
    }


}

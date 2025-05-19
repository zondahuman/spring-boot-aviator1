package com.abin.lee.aviator.test.aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AviatorEngineTest1 {

    public double calculateDiscount(double totalAmount) {
        if (totalAmount > 1000) {
            return totalAmount * 0.1; // 10% discount for amounts over 1000
        } else {
            return totalAmount * 0.05; // 5% discount otherwise
        }
    }

    @Test
    public void testPlusRule(){
        String params = "5 + 3" ;
        Long result = (Long) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testMinusRule(){
        String params = "5 - 3" ;
        Long result = (Long) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testTimesRule(){
        String params = "5 * 3" ;
        Long result = (Long) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testDivisionRule(){
        String params = "15 / 3" ;
        Long result = (Long) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testTernaryOperatorRule(){
        String params = "15 / 3 == 5 ? 0 : 1" ;
        Long result = (Long) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testCommonRule1(){
        String name = "JACK";
        Map<String,Object> env = new HashMap<>();
            env.put("name", name);
        String result = (String) AviatorEvaluator.execute(" 'Hello ' + name ", env);
            System.out.println(result);
    }


    /**
     * https://blog.csdn.net/m0_48038376/article/details/141427682
     */
    @Test
    public void testMapRule(){
        String expression = "age > 18 && salary > 50000";
        Map<String, Object> env = new HashMap<>();
        env.put("age", 12);
//        env.put("age", 25);
        env.put("salary", 60000);

        boolean result = (boolean) AviatorEvaluator.execute(expression, env);
        System.out.println("Expression result: " + result);  // 输出: Expression result: true
    }


    /**
     * Aviator 支持自定义函数吗？如何实现自定义函数？
     * https://blog.csdn.net/m0_48038376/article/details/141427682
     */
    @Test
    public void testSupportSelfDefineFunction(){

    }






}

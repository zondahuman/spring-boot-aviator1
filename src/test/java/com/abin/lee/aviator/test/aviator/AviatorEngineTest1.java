package com.abin.lee.aviator.test.aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;
import com.googlecode.aviator.Expression;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBigInt;
import com.googlecode.aviator.runtime.type.AviatorObject;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
//        Long result = (Long) AviatorEvaluator.execute(params);
        Long result = (Long) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testPlusRule2(){
        String params = "5.012 + 3.321" ;
//        Long result = (Long) AviatorEvaluator.execute(params);
        Double result = (Double) AviatorEvaluator.execute(params);
        System.out.println(result);
    }

    @Test
    public void testPlusRule3(){
        String params = "5.012 + 3.321" ;
//        Long result = (Long) AviatorEvaluator.execute(params);
        Double result = (Double) AviatorEvaluator.execute(params);
        System.out.println(result);
        BigDecimal result1 = new BigDecimal(result).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(result1);
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
     * 内置函数
     * https://www.cnblogs.com/kaleidoscope/p/13132315.html
     */
    @Test
    public void testBuiltInFunctionsRule(){
        String str = "使用Aviator";
        Map<String,Object> env = new HashMap<>();
        env.put("str",str);
        Long length = (Long)AviatorEvaluator.execute("string.length(str)",env);
        System.out.println(length);
    }


    /**
     * compile用法
     * https://www.cnblogs.com/kaleidoscope/p/13132315.html
     */
    @Test
    public void testCompileRule(){
        String expression = "a-(b-c)>100";
        Expression compiledExp = AviatorEvaluator.compile(expression);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 100.3);
        env.put("b", 45);
        env.put("c", -199.100);
        Boolean result = (Boolean) compiledExp.execute(env);
        System.out.println(result);
    }

    @Test
    public void testCompileRule2(){
        String expression = "a-(b-c)>100";
//        Expression compiledExp = AviatorEvaluator.compile(expression);
        Expression compiledExp = AviatorEvaluator.compile(expression, true);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 150);
//        env.put("a", 151);
        env.put("b", 100);
        env.put("c", 50);
        Boolean result = (Boolean) compiledExp.execute(env);
        System.out.println(result);
    }

    @Test
    public void testCompileRule3(){
        String expression = "a-(b-c)>100";
//        Expression compiledExp = AviatorEvaluator.compile(expression);
        AviatorEvaluatorInstance instance = AviatorEvaluator.getInstance();
        String cacheKey = "script_algorithm_";
        Expression compiledExp = instance.compile(cacheKey, expression, true);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 150);
//        env.put("a", 151);
        env.put("b", 100);
        env.put("c", 50);
        Boolean result = (Boolean) compiledExp.execute(env);
        System.out.println(result);
    }



    /**
     * Aviator 支持自定义函数吗？如何实现自定义函数？
     * https://blog.csdn.net/m0_48038376/article/details/141427682
     */
    @Test
    public void testSupportSelfDefineFunction(){
        AviatorEvaluator.addFunction(new MinFunction());
        String expression = "min(a,b)";
        Expression compiledExp = AviatorEvaluator.compile(expression, true);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 100.3);
        env.put("b", 45);
        Double result = (Double) compiledExp.execute(env);
        System.out.println(result);
    }

    static class MinFunction extends AbstractFunction {
        @Override public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
            Number left = FunctionUtils.getNumberValue(arg1, env);
            Number right = FunctionUtils.getNumberValue(arg2, env);
            return new AviatorBigInt(Math.min(left.doubleValue(), right.doubleValue()));
        }

        public String getName() {
            return "min";
        }
    }





}

package com.abin.lee.aviator.test.aviator;

import org.apache.logging.log4j.core.script.Script;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApacheGroovyEngineTest1 {


    @Test
    public void testPlusRule(){
        Object result1 = parse("line.contains(\"test\")", "9123rhewtestdfks");
        Object result2 = parse("line.contains(\"test\")", "123");
        System.out.println(result1);
        System.out.println(result2);

    }

    public static Object parse(String re, String line) {

//        Map<String, Object> map = new HashMap<String, Object>(1);
//        map.put("line", line);
//
//        Script script = new GroovyShell().parse(re);
//        script.setBinding(new Binding(map));
//        return script.run();
        return null;
    }






}

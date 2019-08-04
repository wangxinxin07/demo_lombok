package com.wxx.bj;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;

/**
 * DataDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class DataDemoTest {

    public static void main(String[] args) {
        DataDemo dataDemo = new DataDemo();
        dataDemo.setId(1);
        dataDemo.setAge(19);
        dataDemo.setName("zhangsan");
        dataDemo.setSalary(new BigDecimal("1000.01"));
        System.out.println("dataDemo = " + dataDemo);
        System.out.println("dataDemo = " + JSON.toJSONString(dataDemo));

        System.out.println("hasCode = " + dataDemo.hashCode());
    }
}

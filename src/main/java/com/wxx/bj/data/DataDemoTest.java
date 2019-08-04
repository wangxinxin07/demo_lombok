package com.wxx.bj.data;

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
        dataDemo.setName("zhangsan");
        dataDemo.setSalary(new BigDecimal("1000.01"));
        System.out.println("dataDemo = " + dataDemo);
        System.out.println("dataDemo = " + JSON.toJSONString(dataDemo));

        System.out.println("hasCode = " + dataDemo.hashCode());

        DataDemoParent dataDemoParent = new DataDemoParent();
        System.out.println(dataDemo.canEqual(dataDemoParent));

        DataDemoChild dataDemoChild = new DataDemoChild();
        System.out.println(dataDemo.canEqual(dataDemoChild));
    }
}

package com.wxx.bj.value;

/**
 * ValueDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class ValueDemoTest {

    public static void main(String[] args) {

        ValueDemo valueDemo = new ValueDemo(1, "lisi", 11);
        System.out.println(valueDemo);

        System.out.println(valueDemo.getId());
    }
}

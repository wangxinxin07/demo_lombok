package com.wxx.bj.argsConstructor;

/**
 * ArgsConstructorDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class ArgsConstructorDemoTest {

    public static void main(String[] args) {
        ArgsConstructorDemo argsConstructorDemo = new ArgsConstructorDemo();
        System.out.println("argsConstructorDemo = " + argsConstructorDemo);

        ArgsConstructorDemo argsConstructorDemo1 = new ArgsConstructorDemo(1, "zhangsan", 12);
        System.out.println("argsConstructorDemo1 = " + argsConstructorDemo1);

        ArgsConstructorDemo argsConstructorDemo2 = new ArgsConstructorDemo("lisi");
        System.out.println("argsConstructorDemo2 = " + argsConstructorDemo2);
    }
}

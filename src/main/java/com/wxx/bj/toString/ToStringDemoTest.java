package com.wxx.bj.toString;

/**
 * ToStringDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class ToStringDemoTest {

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo();

        toStringDemo.setId(1);
        toStringDemo.setName("lisi");
        toStringDemo.setAge(20);

        System.out.println(toStringDemo);

    }
}

package com.wxx.bj.builder;

/**
 * BuilderDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class BuilderDemoTest {

    public static void main(String[] args) {

        BuilderDemo builderDemo = BuilderDemo.builder().id(2).name("zhangsan2").age(22).build();
        System.out.println(builderDemo);

    }
}

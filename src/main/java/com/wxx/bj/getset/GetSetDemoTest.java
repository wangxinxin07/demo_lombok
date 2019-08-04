package com.wxx.bj.getset;

import com.alibaba.fastjson.JSON;

/**
 * GetSetDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class GetSetDemoTest {

    public static void main(String[] args) {
        GetSetDemo getSetDemo = new GetSetDemo();

        getSetDemo.setName("zhangsan");
        System.out.println(getSetDemo.getName());

        System.out.println(getSetDemo.getId());

        System.out.println(JSON.toJSONString(getSetDemo));
    }
}

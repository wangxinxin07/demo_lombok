package com.wxx.bj.value;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Value;

/**
 * ValueDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
@ToString
@AllArgsConstructor
@Value
public class ValueDemo {

    private int id;

    private String name;

    private int age;

}

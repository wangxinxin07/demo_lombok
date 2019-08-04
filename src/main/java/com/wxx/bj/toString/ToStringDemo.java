package com.wxx.bj.toString;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ToStringDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
@ToString
@Getter
@Setter
public class ToStringDemo {

    @ToString.Exclude
    private int id;

    private String name;

    private int age;


}

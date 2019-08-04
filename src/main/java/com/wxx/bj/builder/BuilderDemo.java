package com.wxx.bj.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * BuilderDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
@ToString
@Getter
@Setter
@Builder
public class BuilderDemo {

    private int id;

    private String name;

    private int age;

}

package com.wxx.bj.builder;

import lombok.*;

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
@AllArgsConstructor(access = AccessLevel.PRIVATE)
/*builder注解需要与@AllArgsConstructor(access = AccessLevel.PRIVATE) 配合使用，生成private的构造函数*/
public class BuilderDemo {
    private int id;

    private String name;

    private int age;

}

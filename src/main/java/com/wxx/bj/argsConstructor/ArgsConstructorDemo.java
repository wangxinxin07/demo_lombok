package com.wxx.bj.argsConstructor;

import lombok.*;

/**
 * ArgsConstructorDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
@Getter
@Setter
@ToString
//默认情况下就有 无参构造器
@NoArgsConstructor
//全参构造器
@AllArgsConstructor
//
@RequiredArgsConstructor
public class ArgsConstructorDemo {

    private int id;

    @NonNull
    private String name;

    private int age;

}

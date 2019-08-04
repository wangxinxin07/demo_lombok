package com.wxx.bj.nonNull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * NonNullDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class NonNullDemo {

    @NonNull
    @Getter
    @Setter
    private String name;


    @Getter
    @Setter
    private Integer id;
}

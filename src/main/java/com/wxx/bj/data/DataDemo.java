package com.wxx.bj.data;

import lombok.Data;

import java.math.BigDecimal;

/**
 * DataDemo.java
 *
 * @author wangxinxin07
 * @Data为类生成setter/getter、equals、hashcode、toString、canEqual方法
 * @date 2019/8/4
 */
@Data
public class DataDemo extends DataDemoParent{

    public static final String country = "China";

    private int id;

    private String name;

    public static int age;

    private BigDecimal salary;

}

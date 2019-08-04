package com.wxx.bj.cleanup;

import lombok.Cleanup;

/**
 * CleanupDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class CleanupDemoTest {

    public static void main(String[] args) {

        @Cleanup(value = "hahaha")
        CleanupDemo cleanupDemo = new CleanupDemo();
        cleanupDemo.writeWord();
    }
}

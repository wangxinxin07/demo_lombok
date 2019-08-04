package com.wxx.bj.synchronize;

import lombok.Synchronized;

/**
 * SynchronizedDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class SynchronizedDemo {

    public static int total = 0;

    public void add(int times) {
        for (int i = 0; i < times; i++) {
            total++;
        }
    }

    public synchronized void addSynchronized(int times) {
        for (int i = 0; i < times; i++) {
            total++;
        }
    }

    @Synchronized
    public void addSynchronized2(int times) {
        for (int i = 0; i < times; i++) {
            total++;
        }
    }

}

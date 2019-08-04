package com.wxx.bj.synchronize;

import lombok.SneakyThrows;

/**
 * SynchronizedDemoTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class SynchronizedDemoTest {

    @SneakyThrows
    public static void main(String[] args) {

        final SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        openTenThreads(new Runnable() {
            public void run() {
//                synchronizedDemo.add(1000);
//                synchronizedDemo.addSynchronized(1000);
                synchronizedDemo.addSynchronized2(1000);
            }
        });

        Thread.sleep(5000);
        System.out.println("total = " + SynchronizedDemo.total);
    }

    private static void openTenThreads(Runnable runnable) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}

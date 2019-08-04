package com.wxx.bj.sneakyThrows;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;

/**
 * SneakyThrowsDemo.java
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class SneakyThrowsDemo {

    @SneakyThrows
    public void writeWord(){
        @Cleanup
        FileOutputStream fileOutputStream = new FileOutputStream(new File("target2/22.txt"));
        fileOutputStream.write("senakyThrows".getBytes());
    }
}

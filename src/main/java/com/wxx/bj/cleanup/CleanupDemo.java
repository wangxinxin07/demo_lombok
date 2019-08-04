package com.wxx.bj.cleanup;

import lombok.Cleanup;

import java.io.File;
import java.io.FileOutputStream;

/**
 * CleanupDemo.java
 * @Cleanup 用来修饰局部变量. 默认调用局部变量的close方法,可手动指定其他方法:value属性为指定方法名.【方法必须无参】
 *
 * @author wangxinxin07
 * @date 2019/8/4
 */
public class CleanupDemo {

    public void writeWord(){
        try {
            @Cleanup
            FileOutputStream writer = new FileOutputStream(new File("target/11.txt"));
            writer.write("aaa".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(){
        System.out.println("close run");
    }


    public void hahaha(){
        System.out.println("hahahahahahah");
    }

}

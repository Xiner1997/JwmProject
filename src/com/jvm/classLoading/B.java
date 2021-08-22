package com.jvm.classLoading;

/**
 * @Author wangxin
 * @Description
 * @Date create in 0:03 2021/8/23
 * @Modified
 */
public class B {
    static {
        System.out.println("static com.jvm.classLoading.B");
    }

    public B() {
        System.out.println("constructor com.jvm.classLoading.B");
    }
}

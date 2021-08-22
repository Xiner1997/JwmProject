package com.jvm.classLoading;

/**
 * @Author wangxin
 * @Description
 * @Date create in 0:02 2021/8/23
 * @Modified
 */
public class A extends B {
    static {
        System.out.println("static com.jvm.classLoading.A");
    }

    public A() {
        System.out.println("constructor com.jvm.classLoading.A");
    }

}

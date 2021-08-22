package com.jvm.classLoading;

import com.jvm.classLoading.A;

/**
 * @Author wangxin
 * @Description
 * @Date create in 0:01 2021/8/23
 * @Modified
 */
public class TestLoadingSort {
    static {
        System.out.println("Loading test static");
    }
    public static void main(String[] args) {
        new A();
        System.out.println("Loading test");
    }
}

package com.jvm.classloader;

import sun.misc.Launcher;
import sun.misc.URLClassPath;

import java.net.URL;

/**
 * @Author wangxin
 * @Description 类加载器
 * @Date create in 0:40 2021/8/23
 * @Modified
 */
public class TestClassLoader {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(TestClassLoader.class.getClassLoader().getClass().getName());

        System.out.println("==============");

        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println("启用类加载器是C++实现的本地方法，java代码无法获取，为null");
        System.out.println("BootstrapClassLoader:" + bootStrapClassLoader);
        System.out.println("ExtensionClassLoader:" + extClassLoader);
        System.out.println("AppClassLoader:"+ appClassLoader);

        System.out.println("==============");

        System.out.println("bootstrapClassLoader加载以下文件：");
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls){
            System.out.println(url);
        }

        System.out.println("extClassLoader加载以下文件：");
        System.out.println(System.getProperty("java.ext.dirs"));

        System.out.println("appClassLoader加载以下文件：");
        System.out.println(System.getProperty("java.class.path"));

    }
}

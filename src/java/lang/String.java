package java.lang;

/**
 * @Author wangxin
 * @Description
 * @Date create in 1:10 2021/8/23
 * @Modified
 */
public class String {
    public static void main(String[] args) {
        // 根据双亲委派机制，向上委托使用BootstrapClassLoader加载了String.class,由于java自带的String类没有main()函数，所以报错
        System.out.println("自己定义的String.class");
    }
}

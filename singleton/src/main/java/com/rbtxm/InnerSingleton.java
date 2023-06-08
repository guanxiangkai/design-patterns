package com.rbtxm;

/**
 * 静态内部类
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月08日 星期四 23时32分28秒
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    //特性：类加载机制--->会在第一次使用时加载
    private static class InnerSingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return InnerSingletonHolder.INSTANCE;
    }
}

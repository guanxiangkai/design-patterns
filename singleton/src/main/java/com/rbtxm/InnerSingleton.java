package com.rbtxm;

/**
 * 静态内部类
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月08日 星期四 23时32分28秒
 */
public class InnerSingleton {
    // 防止反射破坏单例
    private InnerSingleton() {
        throw new RuntimeException("单例模式不允许多个实例");
    }

    //特性：类加载机制--->会在第一次使用时加载
    private static class InnerSingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return InnerSingletonHolder.INSTANCE;
    }
}

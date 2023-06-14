package com.rbtxm;

/**
 * 饿汉式
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月06日 星期二 23时52分59秒
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    // 防止反射破坏单例
    private EagerSingleton() {
       throw new RuntimeException("单例模式不允许多个实例");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
    // 防止序列化破坏单例
    private Object readResolve() {
        return instance;
    }
}

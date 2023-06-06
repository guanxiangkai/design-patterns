package com.rbtxm;

/**
 * 饿汉式
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月06日 23时52分59秒
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

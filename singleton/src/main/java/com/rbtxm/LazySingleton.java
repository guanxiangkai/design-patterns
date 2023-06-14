package com.rbtxm;

/**
 * 懒汉式
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月07日 星期三 00时12分51秒
 */
public class LazySingleton {
    //懒汉式
    private static LazySingleton instance;

    // 防止反射破坏单例
    private LazySingleton() {
        throw new RuntimeException("单例模式不允许多个实例");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    // 防止序列化破坏单例
    private Object readResolve() {
        return instance;
    }
}

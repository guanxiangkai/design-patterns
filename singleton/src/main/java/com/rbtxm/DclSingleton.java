package com.rbtxm;

/**
 * 懒汉式 双重检查锁
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月08日 星期四 23时10分39秒
 */
public class DclSingleton {
    // 懒汉式
    /**
     * 创建对象不是一个原子操作，即使使用了双重检查锁，也可能在创建过程中产生半初始化状态
     * volatile关键字可以禁止指令重排，1、保证内存可见性，2、保证有序性
     * 1.9以上，jvm加载有序，不需要添加volatile
     */
    private static DclSingleton instance;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}

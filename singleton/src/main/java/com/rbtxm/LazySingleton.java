package com.rbtxm;

/**
 * 懒汉式
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月07日 00时12分51秒
 */
public class LazySingleton {
    //懒汉式
    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

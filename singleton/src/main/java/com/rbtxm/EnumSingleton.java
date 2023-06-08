package com.rbtxm;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 全局计数器
 *
 * @author guanxiangkai
 * @version 1.0
 * @since 2023年06月08日 星期四 23时40分01秒
 */
public enum EnumSingleton {
    /**
     * 任何一个枚举项都是一个天然的单例
     * 本质上就是static final EnumSingleton INSTANCE = new EnumSingleton();
     */
    INSTANCE;

    private AtomicLong atomicLong = new AtomicLong(0);

    public long getNumber() {
        return atomicLong.incrementAndGet();
    }
}

package org.example.singleton;

/**
 * @author: os.shenj
 * @create: 2020/12/24  13:34
 * @update: 2020/12/24  13:34
 * @remark: 优点：懒汉式单例，只有用到的时候才会创建对象。相比于饿汉式单例降低了系统内存开销
 * 缺点：存在线程不安全问题
 */
public class LazySingleTon {

    public static LazySingleTon instance;

    private LazySingleTon() {

    }

    public static LazySingleTon getInstance() {
        if (null == instance) {
            instance = new LazySingleTon();
        }
        return instance;
    }
}

package org.example.singleton;

/**
 * @author: os.shenj
 * @create: 2020/12/24  13:40
 * @update: 2020/12/24  13:40
 * @remark: 优点：方法块中加锁的懒汉式单例，优点是降低了系统内存开销同时解决了线程安全问题
 * 缺点：如果存在多线程同时调用的时候，系统性能降低
 */
public class SyncLazySingleTon {

/*    public static SyncLazySingleTon instance;

    private SyncLazySingleTon() {
    }

    public synchronized  static SyncLazySingleTon getInstance() {
        if (null == instance) {
            instance = new SyncLazySingleTon();
        }
        return instance;
    }*/


/*    public static SyncLazySingleTon getInstance() {
        return InnerInstance.instance;
    }


    private static class InnerInstance {
        public static SyncLazySingleTon instance=new SyncLazySingleTon();
    }*/

    public static SyncLazySingleTon instance;

    private SyncLazySingleTon() {
    }

    public static SyncLazySingleTon getInstance() {
        synchronized (SyncLazySingleTon.class) {

            if (null == instance) {
                instance = new SyncLazySingleTon();
            }
            return instance;
        }
    }
}

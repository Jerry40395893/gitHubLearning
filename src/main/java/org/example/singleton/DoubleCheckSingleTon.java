package org.example.singleton;

/**
 * @author: os.shenj
 * @create: 2020/12/24  14:10
 * @update: 2020/12/24  14:10
 * @remark: 优点：保证了线程安全，且降低了内存开销
 * 缺点：  不够优雅
 */
public class DoubleCheckSingleTon {
    public static volatile DoubleCheckSingleTon instance;

    private DoubleCheckSingleTon() {
        if (null != instance) {
            throw new RuntimeException("不允许通过反射生成单例");
        }
    }

    public static DoubleCheckSingleTon getInstance() {

        //第一次检查，判断如果为空就加锁
        if (null == instance) {
            synchronized (DoubleCheckSingleTon.class) {
                //第二次检查，如果上一个线程已经生成实例，但是还没有返回的场景
                if (null == instance) {
                    // 可能存在指令重排序的问题，得给instance加上volatile字段
                    instance = new DoubleCheckSingleTon();
                }
            }
        }
        return instance;
    }
}

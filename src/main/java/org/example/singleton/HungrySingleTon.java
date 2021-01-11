package org.example.singleton;

/**
 * @author: os.shenj
 * @create: 2020/12/24  11:18
 * @update: 2020/12/24  11:18
 * @remark:
 * 优点：单例类在系统启动的时候就创建，不存在线程安全问题
 * 缺点：如果创建大量的单例对象，但是又不去使用，会消耗大量的系统资源。
 */
public class HungrySingleTon {

//----------------V1----------------
//    public static final HungrySingleTon instance = new HungrySingleTon();
//
//    private HungrySingleTon() {
//    }
//
//    public static HungrySingleTon getInstance() {
//        return instance;
//    }

//----------------V2----------------
//    public static HungrySingleTon instance = null;
//
//    static {
//        instance = new HungrySingleTon();
//    }
//
//    private HungrySingleTon() {
//    }
//
//    public static HungrySingleTon getInstance() {
//        return instance;
//    }
//------------------V3---------------

}

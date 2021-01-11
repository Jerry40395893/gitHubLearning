package org.example;

import sun.security.jca.GetInstance;

/**
 * @author: os.shenj
 * @create: 2020/12/23  15:26
 * @update: 2020/12/23  15:26
 * @remark:
 */
public class SingleTon {

    private static SingleTon instance = null;

    private SingleTon() {
    }

    public static SingleTon getInstance() {

        if (null == instance) {
            synchronized (SingleTon.class) {
                if (null == instance) {
                    instance = new SingleTon();
                }
            }
        }

        return instance;
    }
}

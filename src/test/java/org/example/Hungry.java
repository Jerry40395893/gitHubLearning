package org.example;

import org.example.singleton.EnumSingleTon;
import org.example.singleton.HungrySingleTon;

/**
 * @author: os.shenj
 * @create: 2020/12/24  13:52
 * @update: 2020/12/24  13:52
 * @remark:
 */
public class Hungry implements  Runnable{
    @Override
    public void run() {

        EnumSingleTon instance = EnumSingleTon.getInstance();
        System.out.println(instance);
    }
}

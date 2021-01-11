package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: os.shenj
 * @create: 2020/12/24  13:51
 * @update: 2020/12/24  13:51
 * @remark:
 */
public class HungrySingleTest {
    public static void main(String[] args) {
        Thread t1=new Thread(new Hungry());
        Thread t2=new Thread(new Hungry());
        t1.start();
        t2.start();

        List<String > stringList=new ArrayList<>();
        stringList.subList(1,stringList.size());

    }
}

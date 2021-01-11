package org.example;

/**
 * @author: os.shenj
 * @create: 2020/12/23  15:28
 * @update: 2020/12/23  15:28
 * @remark:
 */
public class OutputThread extends Thread {

    @Override
    public void run() {
        SingleTon instance = SingleTon.getInstance();
        System.out.println(instance);
    }
}

package org.example.singleton;

/**
 * @author: os.shenj
 * @create: 2020/12/24  14:31
 * @update: 2020/12/24  14:31
 * @remark:
 */
public enum EnumSingleTon {
    INSTANCE;

    public static EnumSingleTon getInstance() {
        return INSTANCE;
    }
}

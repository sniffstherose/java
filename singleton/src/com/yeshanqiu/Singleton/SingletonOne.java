package com.yeshanqiu.Singleton;
//饿汉式：创建对象实例时直接初始化  空间换时间
public class SingletonOne {
    //创建类中的私有构造
    private SingletonOne() {}
    //创建该类型的私有静态实例
    private static SingletonOne instance = new SingletonOne();
    //创建公有静态方法，返回静态实例对象
    public static SingletonOne getInstance() {
        return instance;
    }
}

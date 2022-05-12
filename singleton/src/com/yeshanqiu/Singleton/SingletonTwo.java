package com.yeshanqiu.Singleton;
//懒汉式：类内实例对象创建时并不实例化对象，直到第一次调用get方法
//时间换空间
public class SingletonTwo {
    private SingletonTwo() {}
    private static SingletonTwo instance = null;
    public static SingletonTwo getInstance() {
        if(instance == null)
            instance = new SingletonTwo();

        return instance;
    }
}

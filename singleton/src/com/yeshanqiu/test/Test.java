package com.yeshanqiu.test;

import com.yeshanqiu.Singleton.SingletonOne;
import com.yeshanqiu.Singleton.SingletonTwo;

public class Test {
    public static void main(String[] args) {
        SingletonOne one=SingletonOne.getInstance();
        SingletonOne two=SingletonOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println("==============================");
        SingletonTwo three=SingletonTwo.getInstance();
        SingletonTwo four=SingletonTwo.getInstance();
        System.out.println(three);
        System.out.println(four);
    }
}

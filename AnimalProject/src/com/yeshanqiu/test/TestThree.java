package com.yeshanqiu.test;

import com.yeshanqiu.animal.Animal;

public class TestThree {
    public static void main(String[] args) {
        Animal one=new Animal(2,"花花");
        Animal two=new Animal(2,"花花");
        /* equals方法：
         * 1、继承object类中的equals方法时，比较的是两个引用是否指向同一个对象
         * 2、子类可以重写equals方法的形式，改变比较的内容
         */
        boolean b=one.equals(two);
        System.out.println(b);
        System.out.println(one==two);
        System.out.println("========================");
        String str1=new String("Hello");
        String str2=new String("Hello");
        b=str1.equals(str2);
        System.out.println(b);
        System.out.println(str1==str2);
        System.out.println("========================");
        /* toString()测试
         * 1、输出对象名是时，默认调用toString()方法
         * 2、继承Object中的toString()方法时，输出对象的字符串表示形式：类型信息+@+地址信息
         */
        System.out.println(one.toString());
        System.out.println(one);
        System.out.println("========================");
        System.out.println(str1);
    }
}

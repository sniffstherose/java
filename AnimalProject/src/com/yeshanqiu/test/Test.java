package com.yeshanqiu.test;

import com.yeshanqiu.animal.Cat;
import com.yeshanqiu.animal.Dog;


public class Test {
    public static void main(String[] args){
        Cat one = new Cat();
        one.setName("花花");
        one.setMonth(2);
        one.setSpecies("中华田园猫");
        one.eat();
        one.run();
        System.out.println(one.temp);
        System.out.println("======================");
        Dog two = new Dog();
        two.setName("凡凡");
        two.setMonth(1);
        two.setSpecies("边牧");
        two.eat();
        two.sleep();
        System.out.println("======================");
        two.eat("niuniu");
    }
}

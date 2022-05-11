package com.yeshanqiu.animal;

import com.yeshanqiu.animal.Animal;

public class Cat extends Animal {
    private double weight;//体重
    public int temp=300;
    public static int st3=44;
    static{
        System.out.println("我是子类的静态代码块");
    }
    {
        System.out.println("我是子类的构造代码块");
    }

    public Cat(){
        this.month=12;
        System.out.println("我是子类无参构造方法");
    }
    public Cat(int month,String name){
        /*
         * 子类构造，默认调用父类无参构造方法
         * 可使用super关键字调用父类其他构造方法
         * super();必须放在子类构造方法有效代码的第一行
         */

        super(2,"花花");
        System.out.println("我是子类带参构造");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run(){
        eat();
        System.out.println(this.getName()+"是一只"+getSpecies()+"正在奔跑");
    }
}

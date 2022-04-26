package com.yeshanqiu.animals;

/**
 * Created by IntelliJ IDEA Professional.
 * &#064;author: 夜芟秋
 * &#064;Created: 2022/4/25 13:34
 */
public class Cat {
    //成员属性
    private String name;
    private int month;
    private double weight;
    private String species;
    public static int price;//售价
    //构造方法
    {
        System.out.println("我是构造代码块");
    }//构造代码块
    static {
        System.out.println("我是静态代码块");
    }//静态代码块
    public Cat(){
        System.out.println("我是宠物猫~~");
    }
    public Cat(String name){
        this.name=name;
    }
    public Cat(String name,int month,double weight,String species){
        this();
        this.name=name;
        setMonth(month);
        setWeight(weight);
        this.species=species;
    }
    //getter、setter方法
    public String getName() {
        return "我是一只名叫："+name+"的宠物猫";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=0){
            System.out.println("错误，年龄不能<=0");
        }
        else
            this.month = month;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<=0){
            System.out.println("错误，体重不能<=0");
        }
        else
            this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    //成员方法
    public static void eat(){
        System.out.println("小猫吃鱼");
    }
    public void eat(String name){
        System.out.println(name+"小猫吃鱼");
    }
    public void run(){
        {System.out.println("我是普通代码块");}//普通代码块
        eat();
        name="妞妞";
        price=20;
        System.out.println("售价为"+price+"的"+name+"快跑");
    }
}
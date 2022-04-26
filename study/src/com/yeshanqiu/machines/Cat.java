package com.yeshanqiu.machines;

/**
 * Created by IntelliJ IDEA Professional.
 * &#064;author: 夜芟秋
 * &#064;Created: 2022/4/25 15:29
 */
public class Cat {
    //成员属性
    private String name;
    private int month;
    private double weight;
    private String species;
    //构造方法
    public Cat(){
        System.out.println("这是一只机器猫");
    }
    public Cat(String name, int month, double weight, String species){
        this();
        setName(name);
        setMonth(month);
        setWeight(weight);setSpecies(species);
    }
    //getter/setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

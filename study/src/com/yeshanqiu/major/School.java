package com.yeshanqiu.major;

public class School {
    //成员属性
    private String name;
    private String number;
    private int years;
    //构造方法
    public School(){}
    public School(String name, String number, int years){
        this.name = name;
        this.number = number;
        this.years = years;
    }
    //getter和setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYears() {
        return years;
    }

    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", years=" + years +
                '}';
    }

    public void setYears(int years) {
        this.years = years;
    }

}

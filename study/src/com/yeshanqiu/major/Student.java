package com.yeshanqiu.major;
/**
 * Created by IntelliJ IDEA.
 * &#064;author: 夜芟秋
 * &#064;Created: 2022/4/26 11:22
 */


public class Student {
    School sc=new School("计算机科学与应用","J0001",4);
    //成员属性
    String name;
    int age;
    int number;
    String gender;
    static String subject="计算机科学与应用";
    static int years=4;
    //构造方法
    public Student(String name, int age, int number, String gender){
        this.name = name;
        this.age = age;
        this.number = number;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        System.out.println("====================");
        return "姓名："+name+"\n性别："+gender+"\n学号："+number+"\n年龄："+age+"\n所选专业："+subject+"\n学制年限："+years;
    }
}

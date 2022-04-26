package com.yeshanqiu.major;

import com.yeshanqiu.major.School;

public class Student {
    School sc=new School("计算机科学与应用","J0001",4);
    //成员属性
    String name;
    int age;
    int number;
    String gender;
    String major;
    int year;
    //构造方法
    public Student(String name, int age, int number, String gender){
        this.name = name;
        this.age = age;
        this.number = number;
        this.gender = gender;
        this.major = sc.getName();
        this.year = sc.getYears();
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
        return "Student{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", year=" + year +
                '}';
    }
}

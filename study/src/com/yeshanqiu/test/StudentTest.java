package com.yeshanqiu.test;

import com.yeshanqiu.major.Student;

public class StudentTest {
    public static void main(String[] args){
        Student one = new Student("张三",18,501,"男");
        System.out.println(one.toString());

        Student two = new Student("李四",17,502,"女");
        System.out.println(two.toString());

        Student three =new Student("王五",18,503,"男");
        System.out.println(three.toString());
    }
}

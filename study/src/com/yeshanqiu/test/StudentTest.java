package com.yeshanqiu.test;

import com.yeshanqiu.major.School;
import com.yeshanqiu.major.Student;

public class StudentTest {
    public static void main(String[] args){
        School sc=new School("计算机科学与应用","J0001",4);
        Student one = new Student("张三",18,501,"男");
        System.out.println(one.toString());

        Student two = new Student("李四",17,502,"女");
        System.out.println(two.toString());

        Student three =new Student("王五",18,503,"男");
        System.out.println(three.toString());
        System.out.println("===============");

        sc.addStudent(one);
        sc.addStudent(two);
        sc.addStudent(three);
        System.out.println(sc.getName()+"的专业中有"+(sc.getStudentNum()+1)+"学生已经报名");

    }
}

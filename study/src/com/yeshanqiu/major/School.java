package com.yeshanqiu.major;

/**
 * Created by IntelliJ IDEA.
 * &#064;author: 夜芟秋
 * &#064;Created: 2022/4/26 11:22
 */
public class School {
    //成员属性
    private String name;
    private String number;
    private int years;
    private Student[] myStudents;
    private int studentNum;
    //构造方法
    public School(){}
    public School(String name, String number, int years){
        this.name = name;
        this.number = number;
        this.years = years;
    }
    public School(String name, String number, int years,Student[] myStudents){
        this.setName(name);
        this.setNumber(number);
        this.setYears(years);
        this.setMyStudents(myStudents);
    }
    //getter和setter
    public Student[] getMyStudents(){
        if(this.myStudents == null){
            this.myStudents = new Student[200];
        }
        return myStudents;
    }
    public void setMyStudents(Student[] myStudents){
        this.myStudents = myStudents;
    }
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

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getYears() {
        return years;
    }

    int i;
    public void addStudent(Student stu){
        for(i=0;i<this.getMyStudents().length;i++){
            if(this.getMyStudents()[i]==null){
                this.getMyStudents()[i]=stu;
                break;
            }
            this.studentNum=i+1;
        }
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

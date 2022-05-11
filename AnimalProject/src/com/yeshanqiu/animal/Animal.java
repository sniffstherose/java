package com.yeshanqiu.animal;

/**
 * Created by IntelliJ IDEA.
 * &#064;author: 夜芟秋
 * &#064;Created: 2022/4/28 15:18
 */
/* final class：该类没有子类 public final class/final public class
 * final 方法：该方法不允许被子类重写，但是可以正常被子类继承使用
 * final 方法内的局部变量：只要在具体可被使用之前赋值，一旦赋值不允许被修改
 * final 类中的成员属性：赋值过程：1、定义初始化 2、构造方法中初始化 3、构造代码块中初始化
 */
public class Animal {
    /*
     * private:只允许在本类中进行访问
     * public:允许在任意位置访问
     * protected:允许在当前类、同包子类/非子类、跨包子类调用，跨包非子类不允许调用
     * 默认：允许在当前类、同包子类调用，跨包子类/非子类不允许调用，
     */
    private String name="妮妮";//昵称
    protected int month=2;//月份
    private String species="动物";//品种
    final public int temp=15;

    private static int st1=22;
    public static int st2=23;

    static{
        System.out.println("我是父类的静态代码块");
    }
    {
        System.out.println("我是父类的构造代码块");
    }
    //构造方法,父类的构造函数不能被继承、重写
    public Animal(){
        System.out.println("我是父类的无参构造方法");
    }
    public Animal(int month,String name){
        this.month = month;
        this.name = name;
        System.out.println("我是父类带参构造");
    }
    public Animal(String name,int month,String species){

    }
    //getter、setter
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat(){
        final int temp=10;//方法内的局部变量
        System.out.println(name+"吃东西");
        final Animal animal=new Animal(10,"凡凡");
    }
    public void eat(String name) {System.out.println(name+"吃东西");}
    public boolean equals(Object o) {
        if(o==null)
            return false;
        else{
            Animal temp=(Animal)o;
            return (this.getName().equals(temp.getName())) && (this.getMonth() == temp.getMonth());
        }
    }
    public boolean equals(Animal o){
        if(o==null)
            return false;
        else{
            return (this.getName().equals(o.getName())) && (this.getMonth() == o.getMonth());
        }
    }

    public String toString(){
        return "昵称"+this.getName()+"年龄"+this.getMonth();
    }
}


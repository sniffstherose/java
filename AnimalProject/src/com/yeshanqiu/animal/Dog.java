package com.yeshanqiu.animal;

public class Dog extends Animal{
    private String gender;//性别

    public Dog(){}

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        super.eat();
        System.out.println(this.getMonth()+"个月大的小狗"+getName()+"在睡觉");
    }

    /*
     * 方法重载：
     * 1、同一个类中
     * 2、方法名相同，参数列表不同（参数顺序、个数、类型）
     * 3、方法返回值、访问修饰符任意
     * 4、与方法参数名无关
     *
     * 方法重写：
     * 1、有继承关系的子类中
     * 2、方法名相同，参数列表相同（参数顺序、个数、类型）,方法的返回值可以允许是子类类型
     * 3、访问修饰符，访问范围需要>=父类的访问范围
     * 4、与方法的参数名无关
     * @param name
     * @return
     */
    public void eat(){
        System.out.println(this.getName()+"最近没有食欲~~");
    }

    public void eat(String month){
        System.out.println(month+"最近没有食欲~~");
    }
}

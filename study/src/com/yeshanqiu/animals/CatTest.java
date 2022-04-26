package com.yeshanqiu.animals;

public class CatTest {
    public static void main(String[] args) {
        Cat one=new Cat("花花",2,800,"英国短毛猫");
//        one.setName("花花");
//        one.setMonth(-3);
//        one.setWeight(800);
//        one.setSpecies("英国短毛猫");

        System.out.println("name: "+one.getName());
        System.out.println("species: "+one.getSpecies());
        if(one.getWeight()!=0)
            System.out.println("weight:"+one.getWeight());
        if(one.getMonth()!=0)
            System.out.println("month:"+one.getMonth());
        one.run();
    }
}

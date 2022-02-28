package com.ys.ioc.entity;

public class HeroAttribute {
    private Integer healthPoint;
    private Integer magicPoint;

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
        System.out.println("第二步：调用set方法");
    }

    public void setMagicPoint(Integer magicPoint) {
        this.magicPoint = magicPoint;
        System.out.println("第二步：调用set方法");
    }

    public HeroAttribute() {
        System.out.println("第一步：通过构造器创建bean实例");
    }

    public void initMethod(){
        System.out.println("第三步：调用bean的初始化方法");
    }

    public void destoryMethod(){
        System.out.println("第五步：调用bean的销毁方法");
    }
}

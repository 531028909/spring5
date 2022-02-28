package com.ys.ioc.entity;

public class Heros {
    private String name;
    private String weapon;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Heros{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}

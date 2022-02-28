package com.ys.ioc.entity;

import java.util.List;

public class Camps {
    private String name;
    private List<Heros> herosList;

    public void setName(String name) {
        this.name = name;
    }

    public void setHerosList(List<Heros> herosList) {
        this.herosList = herosList;
    }

    @Override
    public String toString() {
        return "Camps{" +
                "name='" + name + '\'' +
                ", herosList=" + herosList +
                '}';
    }
}

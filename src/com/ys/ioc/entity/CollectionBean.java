package com.ys.ioc.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {

    private String[] stringNames;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;

    public void setStringNames(String[] stringNames) {
        this.stringNames = stringNames;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void test(){
        System.out.println(Arrays.toString(stringNames));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}

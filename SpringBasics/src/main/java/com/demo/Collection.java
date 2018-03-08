package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {
    List<String> list = new ArrayList<>();
    Map<String, Integer> map = new HashMap<String, Integer>();

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list1) {
        this.list = list1;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "list=" + list +
                ", map=" + map +
                '}';
    }
}

package com.demo;

public class Database {
    Integer portNo;
    String name;

    public Integer getPortNo() {
        return portNo;
    }


    public void setPortNo(Integer portNo) {
        this.portNo = portNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "portNo=" + portNo +
                ", name='" + name + '\'' +
                '}';
    }
}

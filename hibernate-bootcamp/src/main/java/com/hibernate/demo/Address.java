package com.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {


    @Column(name="Street_Number")
    private Integer street_No;
    @Column(name="State")
    private String state;
    @Column(name = "Location")
    private String loc;

    public Integer getStreet_No() {
        return street_No;
    }

    public void setStreet_No(Integer street_No) {
        this.street_No = street_No;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street_No=" + street_No +
                ", state='" + state + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }


}



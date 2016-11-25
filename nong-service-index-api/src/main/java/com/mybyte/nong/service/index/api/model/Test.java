package com.mybyte.nong.service.index.api.model;

import java.io.Serializable;

/**
 * Created by judeys on 2016/11/25.
 */
public class Test implements Serializable{

    private  int id;
    private String name;

    public Test() {
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

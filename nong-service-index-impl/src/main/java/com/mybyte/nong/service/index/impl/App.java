package com.mybyte.nong.service.index.impl;

import com.google.gson.Gson;
import com.mybyte.nong.service.index.api.model.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       Test test = new Test(1,"willian");
        Gson gson = new Gson();
        System.out.println(gson.toJson(test));

    }

    @org.junit.Test
    public void test1(){
            System.out.println("juint test");
    }

    public void test2(){
        System.out.println("juint test");
    }
}

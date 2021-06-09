package com.example.coll.learn;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapExample
{
    public static void main(String[] args) {
        HashMap<String,Integer> cources=new HashMap<>();

        //add element

        cources.put("core java",4000);
        cources.put("Python",6000);
        cources.put("Android",9000);
        cources.put("Python",3500);
        cources.put("Spring",5000);
        cources.put("PHP",2124);
        System.out.println(cources);

       // cources.forEach((e1,e2)->
        //{
       //     System.out.println(e1+"=>"+e2);
       // });
        cources.forEach((key,value)->{
            System.out.println(key);
            System.out.println("=>");
            System.out.println(value);
            System.out.println();
        });
        //entry set
        //key set
        Integer cs= cources.get("core java");
        System.out.println("Price of ="+cs);
    }
}

package com.example.coll.learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class traversExample {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Shree Ganesh");
        names.add("Geeta");
        names.add("Kartik");
        names.add("Siya");
        names.add("ABC");
        names.add("Geeta");


        //for each loop:
        for (String str:names)
        {
            StringBuffer buffer=new StringBuffer(str);
            System.out.println(str+"\t"+str.length()+"\t"+buffer.reverse());


        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        //traversing using ITERATOR
        Iterator<String> itr= names.iterator();

        while(itr.hasNext())
        {
            String next=itr.next();
            System.out.println(next);
        }
        System.out.println("*************************************");
        //backward traversal of collection LISTITERATOR

       ListIterator<String> litr= names.listIterator(names.size());
        while (litr.hasPrevious())
        {
            String previous=litr.previous();
            System.out.println(previous);
        }

        //Enumeration
        System.out.println("************** FOR EACH METHOD ***************");
        //for each loop
        names.forEach(str->{
            System.out.println(str);
        });

        System.out.println("*********Sorting of Elements********");
        TreeSet<String > set=new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });


        //Comparable
    }
}

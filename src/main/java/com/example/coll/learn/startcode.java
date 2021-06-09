package com.example.coll.learn;
import java.util.*;
public class startcode {
    public static void main(String[] args) {
        System.out.println("Welcode to code java collection framework!!!!!!");


        /*
        creating collection
        1)Type safe- same type of elements (objects) are added to collection

        2)Un type safe- different types of elements can be addeded to collection
         */

        //Type safe collection
        ArrayList<String> names= new ArrayList<String>();
        names.add("Shree Ganesh");
        names.add("Geeta");
        names.add("Kartik");
        names.add("Siya");
        names.add("ABC");
        names.add("Geeta");
        System.out.println(names);
       // System.out.println(names.get(0));
       // System.out.println(names.get(2));
        //un type safe
      //  LinkedList list=new LinkedList();
       // list.add("Geeta");
       // list.add(108);
       // list.add(898982984.090);
       // list.add(true);
        //System.out.println(list);



        //remove element in collection
        names.remove(2);
        System.out.println(names);

        //size
        System.out.println("SIZE="+names.size());

        //search element is present or not
        System.out.println(names.contains("Shree Ganesh"));
        System.out.println(names.contains("Shree"));
        //add element specific index
        names.add(2,"XYZ");
        System.out.println(names);
        //set element specific position
        names.set(2,"Kartik");
        System.out.println(names);

        //check for empty or not
        System.out.println(names.isEmpty());

        //clear
        //names.clear();
        //System.out.println(names);

        Vector<String> vector=new Vector<>();
        vector.addAll(names);

        System.out.println("Vector"+vector);
        System.out.println("*********************************************************************************");

        HashSet<Double> nms=new HashSet<>();
        nms.add(14.14);
        nms.add(34.12345);
        nms.add(8880.8880);
        nms.add(4234.3);
        nms.add(93.3);
        nms.add(34.12345);

        System.out.println(nms);

        //sorted list by using treeset
        TreeSet<Double> tset= new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

    }
}

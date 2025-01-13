package com.monisha;

import java.util.ArrayList;

public class List {
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Nivsni");
        list.add("Maanvi");
        list.add("Navilan");
        System.out.println("Friends List");
        for(String name:list)
        {
            System.out.println(name);
        }
    }
}

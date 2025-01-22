package com.vasanthia.collections;
import java.util.*;
public class MapExample
{
    public static void main(String[] args)
    {
      Map<Integer, String> hashMap = new HashMap<>();
      hashMap.put(1,"One");
      hashMap.put(4,"Two");
      hashMap.put(3,"Three");
      hashMap.put(2,"Two");
        System.out.println("HashMap : " + hashMap);

        //TreeMap: Sorted order

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Four");
        System.out.println("TreeMap : " +treeMap);


    }
}

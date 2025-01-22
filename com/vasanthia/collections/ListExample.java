package com.vasanthia.collections;
import java.util.*;
public class ListExample
{
    public static void main(String[] args)
    {
     List<String> arrayList = new ArrayList<>();
     arrayList.add("Apple");
     arrayList.add("Banana");
     arrayList.add("Orange");
        System.out.println("ArrayList : " +arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList :" + linkedList);
    }
}

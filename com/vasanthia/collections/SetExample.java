package com.vasanthia.collections;
import java.util.*;
public class SetExample
{
    public static void main(String[] args)
    {
        //HashSet: no order
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Banana");
        hashSet.add("Apple");
        System.out.println("HashSet : " +hashSet);

        //LinkedHashSet : Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet : " +linkedHashSet);

        //TreeSet : Sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Cherry");
        treeSet.add("Apple");
        System.out.println("TreeSet : " +treeSet);

    }
}

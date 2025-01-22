package com.vasanthia.collections;
import java.util.*;
public class ArrayUtilityExample
{
    public static void main(String[] args) {
        String[] fruits ={"Banana", "Apple", "Cherry"};
        System.out.println("Original Array: " +Arrays.toString(fruits));

        //Sorting

        Arrays.sort(fruits);
        System.out.println("Sorted Array: " +Arrays.toString(fruits));

        //Convert to list
        List<String> friutList = Arrays.asList(fruits);
        System.out.println("List: " +friutList);
    }
}

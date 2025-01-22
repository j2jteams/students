package com.vasanthia.collections;
import java.util.*;
public class CollectionsUtilityExample
{
    public static void main(String[] args)
    {
      List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println("OriginalList : " + numbers);

        //Soritng
        Collections.sort(numbers);
        System.out.println("SortedList : " +numbers);

        //Binary Search
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

    }
}

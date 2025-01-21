package com.vasanthia.stream;
import java.util. *;
import java.util.stream.*;
public class StreamFilterExample
{
    public static void main(String[] args)
    {
       List<String> names = Arrays.asList("John" , "James", "Red", "Gray");
       //Filter names start with 'J'
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        System.out.println("Filtered names : " +filteredNames);
    }
}

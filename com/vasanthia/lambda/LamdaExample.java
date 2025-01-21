package com.vasanthia.lambda;
import java.util.Arrays;
import java.util.List;
import javax.sound.midi.Soundbank;

public class LamdaExample
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Smith","Krish","Ram");
        names.forEach(name -> System.out.println(name));
        //names sorting
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted names:" + names);

    }
}

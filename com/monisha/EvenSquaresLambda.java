package com.monisha;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquaresLambda {
    public static void main(String args[])
    {
        List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> results=integers.stream().filter(number -> number%2 == 0).map(number -> number * number).collect(Collectors.toList());
        System.out.println("Even Squared Numbers" + results);
    }
}

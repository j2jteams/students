package com.monisha;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStream {
    public static void main(String args[])
    {
        List<Integer> numbers= Arrays.asList(3,4,7,8,5,9,1);
        List<Integer> result=numbers.stream().filter(num -> num >5).map(num -> num * num)
                                       .collect(Collectors.toList());
        System.out.println("Result using Lambda and Stream" + result);
    }
}

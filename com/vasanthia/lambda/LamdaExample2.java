package com.vasanthia.lambda;
interface Greeting
{
    void greet (String name);
}
public class LamdaExample2
{
    public static void main(String[] args)
    {
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        greeting.greet("World");
    }
}

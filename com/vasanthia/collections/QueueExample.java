package com.vasanthia.collections;
import java.util.*;

public class QueueExample
{
    public static void main(String[] args)
    {
     Queue<Integer> priorityQueue = new PriorityQueue<>();
     priorityQueue.add(5);
     priorityQueue.add(2);
     priorityQueue.add(4);

        System.out.println("PriorityQueue : " +priorityQueue);
        while (!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll());
        }

    }
}

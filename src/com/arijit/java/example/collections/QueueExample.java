package com.arijit.java.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public void priorityQueueOperation() {

        Queue<String> qe = new PriorityQueue<>();
        qe.add("Geeks");
        qe.add("For");
        qe.add("Asjk");
        qe.add("Geeks");
        qe.add("Iryiu");
        System.out.println(qe);
        qe.remove();
        System.out.println(qe);
        qe.remove("Geeks");
        System.out.println(qe);
        qe.poll();
        System.out.println(qe);

        qe.add("Geeks");
        qe.add("For");
        qe.add("Asjk");
        qe.add("Geeks");
        qe.add("Iryiu");

        // Printing the top element of
        // the PriorityQueue
        System.out.println(qe.peek());

        Iterator itr = qe.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }


    public void LinkedListExample() {
        Queue<String> qe = new LinkedList<>();
        qe.add("Geeks");
        qe.add("For");
        qe.add("Asjk");
        qe.add("Geeks");
        qe.add("Iryiu");
        System.out.println(qe);

        // Printing the top element of
        // the LinkedList
        System.out.println(qe.peek());

        // Printing the top element and removing it
        // from the LinkedList container
        System.out.println(qe.poll());

        // Printing the top element again
        System.out.println(qe.peek());
    }
}

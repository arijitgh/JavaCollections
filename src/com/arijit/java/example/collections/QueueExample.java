package com.arijit.java.example.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public void priorityQueueOperation(){

        Queue<String> qe=new PriorityQueue<>();
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

        Iterator itr=qe.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+ "");
        }



    }
}

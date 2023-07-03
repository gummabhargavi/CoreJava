package com.java.infinite;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePrg {
	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue<>(); //priorityqueue implements the queue interface.
		
		for (int i = 1; i <=10; i++) {
			queue.add(i);
			
		}
		//queue.add(1); //null values are not be allowed
		System.out.println("Queue size is : "+queue.size());
		System.out.println("Head of the queue is : "+queue.peek()); //obtaining the head of the queue(or) queue.element()
		
		System.out.println("Head is removed : "+queue.poll());//Remove the head
		System.out.println("Queue size After the Poll is: "+queue.size());
		
		System.out.println("Head of the queue is : "+queue.peek()); 

	}

}

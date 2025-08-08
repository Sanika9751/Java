package core_java;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo {

	public static void main(String[] args) {
		
		//Priority Queue
//		Queue<Integer> pq=new PriorityQueue<>();
//		pq.offer(10);
//		pq.offer(20);
//		pq.offer(16);
//		pq.offer(49);
//		
//		System.out.println(pq);
//		
//		pq.poll();
//		System.out.println(pq);
		
//		System.out.println(pq.size());
//		
//		System.out.println(pq.peek());
		
		//ArrayDeque
		Queue<Integer> aq=new ArrayDeque<>();
		aq.offer(10);
		aq.offer(20);
		aq.offer(16);
		aq.offer(49);
		
		System.out.println(aq);
		
		aq.poll();
		
		System.out.println(aq);
	
		
		

	}

}

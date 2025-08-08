package core_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pooling {

	public static void main(String[] args) {
		
		thread_2 one=new thread_2("one");
		thread_2 two=new thread_2("two");
		thread_2 three=new thread_2("three");
		thread_2 four=new thread_2("four");
		
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		pool.execute(one);
		pool.execute(two);
		pool.execute(three);
		pool.execute(four);
		
		pool.shutdown();
		
		
		

	}

}

class thread_2 extends Thread{
	
	String name;
	
	public thread_2(String name) {
		this.name=name;
		}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+" finished!");
		
	}
	
	
}
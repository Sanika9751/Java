package core_java;

public class Thread_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("Main thread");

	}

}

class thread1 extends Thread{
	
	public void run() {
	for(int i=0;i<10;i++) {
		
		System.out.println("Thread 1 :"+i);
		System.out.println();
		
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}
}

//thread 2

class thread2 extends Thread{
	
	public void run() {
	for(int i=0;i<10;i++) {
		
		System.out.println("Thread 2 :"+i);
		System.out.println();
		
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}
}



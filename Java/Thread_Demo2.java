package core_java;

public class Thread_Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Lambda Expression 
//		Runnable o1=()->{System.out.println("Abstract method in Runnable");};
//		
//		Thread t1=new Thread(o1);
//		t1.start();
//		
		
		
		threadDemo1 one=new threadDemo1();
		
		Thread t1=new Thread(one);
		
		threadDemo2 two=new threadDemo2();
		
		Thread t2=new Thread(two);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Main method thread");
		
		
		
	
		
	}

}

class threadDemo1 implements Runnable{
	
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread one executed");
	}
}


class threadDemo2 implements Runnable{
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread second executed");
	}
}
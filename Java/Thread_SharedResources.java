package core_java;

public class Thread_SharedResources {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		
		threadable t1=new threadable(c);
		threadable t2=new threadable(c);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		c.getcount();
	}

}

class Counter{
	
	int count=1;
	
	public void increment(){
		count++;
	}
	
	public void getcount() {
		System.out.println(this.count);
	}
}

class threadable extends Thread{
	Counter counter;
	
	public threadable(Counter counter) {
		this.counter=counter;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println(i);
		counter.increment();
		}
	}
}
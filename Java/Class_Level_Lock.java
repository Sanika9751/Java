package core_java;

public class Class_Level_Lock {

	public static void main(String[] args) throws InterruptedException {
		Gold g=new Gold();
		Gold g1=new Gold();
		Gold g2=new Gold();
		Gold g3=new Gold();
		
		
		Thread_Demo one=new Thread_Demo(g);
		Thread_Demo two=new Thread_Demo(g);
		Thread_Demo three=new Thread_Demo(g);
		Thread_Demo four=new Thread_Demo(g);
		
		one.start();
		two.start();
		three.start();
		four.start();
		
		one.join();
		two.join();
		three.join();
		four.join();
		
	    g.getPrice(); 
	    g1.getPrice();
		g2.getPrice();
		g3.getPrice();
		
		System.out.println("Ckecking == of two threads : ");
		System.out.println(g1==g2);  //False because g1 and g2 are two different object which reffer same memory location 
		
		System.out.println("Checking equals method : ");
		System.out.println(g1.equals(g2));
		
		
		
		
		

	}

}

class Gold{
	//By creating variable as static we get data consistent because all threads invokes same memory location 
	static int price=1;
	
	public void increase() {
		price++;
	}
	
	public void getPrice() {
		System.out.println(price);
	}
}

class Thread_Demo extends Thread{
	Gold gold;
	
	Thread_Demo(Gold gold){
		this.gold=gold;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			gold.increase();
		}
	}
}
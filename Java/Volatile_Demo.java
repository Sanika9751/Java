package core_java;

//*********** Volatile Keyword **********************

public class Volatile_Demo {

	public static void main(String[] args) throws InterruptedException {
		Count count=new Count();
		
		ThreadOne one=new ThreadOne(count);
		
		ThreadTwo two=new ThreadTwo(count);
		
		one.start();
		two.start();
		
		one.join();
		two.join();

	}

}

class Count{
	int count=1;
	
	public void increase() {
		count++;
	}
	
	public void getCount() {
		System.out.println(this.count);
	}
}

class ThreadOne extends Thread{
	Count count;
	
	ThreadOne(Count count){
		this.count=count;
	}
	
	@Override
	public void run() {
		
		try {
			ThreadOne.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=1500;i++) {
		count.increase();
		}

	}
	
}


class ThreadTwo extends Thread{
	Count count;
	
	ThreadTwo(Count count){
		this.count=count;
	}
	
	@Override
	public void run() {
		
		System.out.println("Waiting for clear the condition");
		
		while(true){
			if(count.getCount()>500){
				System.out.println("Executed........");
			}
		}
		
	}
}

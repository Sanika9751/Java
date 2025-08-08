package core_java;


//*************We get data inconsistent so we are using synchronized keyword

public class Thread_Sync_Distance {

	public static void main(String[] args) throws InterruptedException {
		Distance d=new Distance();
		
		Threadable one=new Threadable(d);
		Threadable two=new Threadable(d);
		//Threadable three=new Threadable(d);
		
		
		
		one.start();
		two.start();
		one.join();
		two.join();
		
		
		d.getDistance();
		
		
		
	}

}

class Distance{
	int distance=0;
	
//************* we can make our function which contain critical code as synchronied 
//	public synchronized void increase() {
//		distance++;
//	}
	
//************or we can make synchronized to the critical code using synchronized block
	public void increase() {
//		synchronized(this) {  //*******It is also known as instance level block
//		distance++;
//		}
//		
		//**********Or we can make like this
		synchronized(class.distance) {  //*******It is also known as instance level block
			distance++;
			}
	}
	
	
	public void getDistance() {
		System.out.println(distance);
	}
	
}

class Threadable extends Thread{
	
 	Distance distance;  //Reference created
	
	public Threadable(Distance distance) {
		this.distance=distance;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		distance.increase();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
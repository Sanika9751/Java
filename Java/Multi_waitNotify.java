package core_java;

import java.util.ArrayList;
import java.util.List;

public class Multi_waitNotify {

	public static void main(String[] args) throws InterruptedException {
		
		Number number=new Number();
		
		addThread thread1=new addThread(number);
		
		removeThread thread2=new removeThread(number);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		
	}

}

class Number {
	int n=10;
	
	List<Integer> list=new ArrayList<>();
	
	
	public synchronized void addElement() throws InterruptedException {
		
		if(list.size()==5) {
			wait();
		}
		list.add(n);
		n++;
		
		notify();
	}
	
	public synchronized void removeElement() throws InterruptedException {
		if(list.size()==0) {
			wait();
		}
		
		notify();
		System.out.println(list.remove(n));
	}
}

class addThread extends Thread{
	Number number;
	
	public addThread(Number number) {
		this.number=number;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while(true) {
			try {
				number.addElement();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class removeThread extends Thread{
	Number number;
	
	public removeThread(Number number){
		this.number=number;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			try {
				number.removeElement();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}

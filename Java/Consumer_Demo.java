package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Demo {

	public static void main(String[] args) {
//		List<Integer> li=new ArrayList<>();
//		
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(40);
//		li.add(50);
//		
//		ConsumerDemo cd=new ConsumerDemo();
//		cd.accept(li);

		
		List<String> list=new ArrayList<>();
		
		list.add("mUmBai");
		list.add("PuNe");
		list.add("KolHapur");
		list.add("NashIk");
		
		ConsumerDemo cd1=new ConsumerDemo();
		cd1.accept(list);
	}

}


//************ We are just taking list as an argument and printing them by using Consumer interface
//class ConsumerDemo implements Consumer<List<Integer>>{
//
//	@Override
//	public void accept(List<Integer> t) {
//		for(int i:t) {
//			System.out.print(i*2+" ");
//		}
//		
//	}
//	
//}




class ConsumerDemo implements Consumer<List<String>>{

	@Override
	public void accept(List<String> t) {
		for(String str:t) {
			System.out.println(str.toUpperCase());
		}
		
	}
	
}
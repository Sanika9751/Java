package core_java;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		//Accessing the elements :
		//System.out.println(list.get(0));
		
		//Deleting elements :
		
		list.remove(2);

		
		long time=System.nanoTime();
		System.out.println("time required : "+time/1000000000);
		
		//System.out.println(list.size());
		

	}

}

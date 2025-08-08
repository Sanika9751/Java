package core_java;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		
		long start=System.nanoTime();
		
		for(int i=1;i<=200;i++) {
			map.put(i+" ", i);
		}
		
		
		System.out.println(map.size());
		long end=System.nanoTime();
		
		System.out.println(start/10000);
		System.out.println(end/10000);
		
		System.out.println((end-start)/10000);
		
		

	}

}

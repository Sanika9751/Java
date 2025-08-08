package core_java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Demo {

	public static void main(String[] args) {
//		Set<Integer> s=new HashSet<>();  //insertion order is not preserved 
//		
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(30);
//		
//		System.out.println(s);
		
  //************************LinkedHashSet Example ********************************
		
//		Set<Integer> s=new LinkedHashSet<>();  //insertion order is preserved
//		
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(50);
//		
//		System.out.println(s);
		
		//*********************Treeset************************************
		
		Set<Integer> s=new TreeSet<>();
		
		s.add(40);
		s.add(50);
		s.add(100);
		s.add(10);
		
		System.out.println(s);
	}

}

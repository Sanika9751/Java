package core_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream_Demo {

	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<>();
//		
//		list.add(10);
//		list.add(12);
//		list.add(32);
//		list.add(43);
//		list.add(56);
//		
		//System.out.println(list.stream().count());  //Count function returns the number of elements in list
		
		
		
		//CUSTOM CLASS EXAMPLE
		
		
		List<EmployeeDemo> list1=new ArrayList<>();
		
		list1.add(new EmployeeDemo(100,"A"));
		list1.add(new EmployeeDemo(23,"B"));
		list1.add(new EmployeeDemo(31,"C"));
		list1.add(new EmployeeDemo(49,"D"));
		list1.add(new EmployeeDemo(67,"E"));
		
		list1.stream().max(idcompare).forEach((i)->System.out.println(i));
		
	}

}

class EmployeeDemo {
	int id;
	String name;
	
	public EmployeeDemo(int id,String name) {
		this.id=id;
		this.name=name;
	}

}

class idcompare implements Comparator<EmployeeDemo>{

	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return o1.id-o2.id;
	}
	
}
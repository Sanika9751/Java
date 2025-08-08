package core_java;

import java.util.ArrayList;
import java.util.List;

public class Filter_Employee {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1,"abc"));
		list.add(new Employee(2,"def"));
		list.add(new Employee(3,"ghi"));
		list.add(new Employee(4,"jkl"));
		
		list.stream().filter((i)->{
			if(i.id<4)
				return true;
			else
				return false;
		}).map((emp)->{
			return new StringBuffer(emp.getName()).reverse().toString().toUpperCase();
		}).sorted().forEach((emp)->System.out.println(emp));
		
		
	}

}

class Employee{
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" ";
	}
	
	
	
}

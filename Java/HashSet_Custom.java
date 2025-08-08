package core_java;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Custom {

	public static void main(String[] args) {
		Set<Student_Demo> s1=new HashSet<>();
		
		s1.add(new Student_Demo(1,"abc"));
		s1.add(new Student_Demo(1,"abc"));
		s1.add(new Student_Demo(3,"ghi"));
		s1.add(new Student_Demo(4,"jkl"));
		
		System.out.println(s1);
		

	}

}

class Student_Demo{
	
	int id;
	String name;
	
	Student_Demo(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		
		return this.id+" "+this.name;
	}
	
	private void hashode() {
		// TODO Auto-generated method stub
		

	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}

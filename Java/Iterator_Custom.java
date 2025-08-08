package core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Custom {

	public static void main(String[] args) {
	
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(1,"ABC",90));
		list.add(new Student(2,"DEF",80));
		list.add(new Student(3,"GHI",70));
		
		Iterator<Student> it=list.iterator();
		
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println("***********");
		}
		

	}

}

class Student{
	int id;
	String name;
	int marks;
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

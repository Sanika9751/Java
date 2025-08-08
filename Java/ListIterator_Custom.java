package core_java;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Custom {

	public static void main(String[] args) {
		List<Student1> list=new LinkedList<>();
		
		list.add(new Student1(1,"A",90));
		list.add(new Student1(2,"B",80));
		list.add(new Student1(3,"C",70));
		
		ListIterator<Student1> li=list.listIterator();
		
		System.out.println("Forward direction :");
		while(li.hasNext()) {
			
			Student1 s=li.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println("**********");
		}
		
		
		System.out.println("Backward direction :");
		while(li.hasPrevious()) {
			
			Student1 s=li.previous();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println("**********");
		}
		

	}

}

class Student1{
	int id;
	String name;
	int marks;
	
	public Student1(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}
package core_java;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		Set<student> s=new TreeSet();
		
		
		student s1=new student(1,"Tejal","a@");
		student s2=new student(3,"Priyanka","b@");
		student s3=new student(2,"Sanika","c@");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(student i:s) {
//			System.out.println(i.id);
			System.out.println(i.name);
//			System.out.println(i.email);
//			System.out.println("*******");
		}
		
//		Set<movie> book=new TreeSet();
//		
//		movie first=new movie(1,"Ved",10.0,1000);
//		movie second=new movie(2,"Kakan",9.5,9000);
//		movie third=new movie(3,"prem",8.5,6000);
//		
//		book.add(first);
//		book.add(second);
//		book.add(third);
//		
//		for(movie i:book) {
//			System.out.println(i.name);
//			
//		}

	}

}

class student implements Comparable<student>{

	int id;
	String name;
	String email;
	
	student(int id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	

	@Override
	public int compareTo(student o) {
		//return this.id-o.id; --->Ascending order
		//return o.id-this.id; ---->Descending order
		//return this.name.length()-o.name.length();   //Ascending order of the length of name
		return o.name.length()-this.name.length();
		
	}
}

//class movie implements Comparable<movie>{
//
//	int id;
//	String name;
//	double ratings;
//	int price;
//	
//	movie(int id,String name,double ratings,int price){
//		this.id=id;
//		this.name=name;
//		this.ratings=ratings;
//		this.price=price;
//		
//	}
//	
//	@Override
//	public int compareTo(movie o) {
//		// TODO Auto-generated method stub
//		return this.name.length()-o.name.length();
//	}
//	
//}

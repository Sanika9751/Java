package core_java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparator_Demo {

	public static void main(String[] args) {
		Set<Movie> s=new TreeSet();
		
		Movie m1=new Movie(1,"Yaariyaan",10.0,100);
		Movie m2=new Movie(2,"Vivah",9.5,300);
		Movie m3=new Movie(3,"DDLJ",8.9,200);
		
		s.add(m1);
		s.add(m2);
		s.add(m3);
		
		for(Movie i:s) {
			System.out.println(i.name);
		}

	}

}

class Movie implements Comparator<Movie>{
	int id;
	String name;
	double ratings;
	int price;
	
	public Movie(int id,String name,double ratings,int price) {
		this.id=id;
		this.name=name;
		this.ratings=ratings;
		this.price=price;
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		
		if(o1.id>o2.id) {
			return 1;
		}
		else if(o1.id<o2.id) {
			return -1;
		}
		return 0;
	}
}



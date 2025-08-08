package core_java;

import java.util.HashSet;
import java.util.Set;

public class Sel_Demo {

	public static void main(String[] args) {
		Player p1=new Player();
		p1.id=1;
		p1.name="Virat";
		p1.city="Mumbai";
		
		Player p2=new Player();
		p2.id=2;
		p2.name="Dhoni";
		p2.city="Pune";
		
		Player p3=new Player();
		p3.id=3;
		p3.name="Sachin";
		p3.city="Kolhapur";
		
		Set<Player> s=new HashSet<>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		
		
		System.out.println(s);
		
		

	}

}

class Player{
	int id;
	String name;
	String city;
	
	public int hashCode() {
		return id+100;
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		Player p=(Player)o;
		
		if(this.id==p.id && this.name.equals(p.name) )
		{
			return true;
		}
		
		return false;
	}
		
}

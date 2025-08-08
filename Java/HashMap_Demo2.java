package core_java;

import java.util.HashMap;
import java.util.Map;


//HashCode and equals() both methods are mandatory to differentiate keys

public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Leader,Integer> map=new HashMap<>();
		
		map.put(new Leader(1,"AB"),10);
		map.put(new Leader(1,"AB"),20);
		map.put(new Leader(3,"EF"),30);
		
		System.out.println(map);

	}

}

class Leader{
	
	int id;
	String name;
	
	public Leader(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int hashCode() {
		return this.id;
	}
	
	public String toString() {
		return this.id+" "+this.name;
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		
		Leader l1=(Leader)o;
		
		if(this.id==l1.id && this.name.equals(l1.name)) {   // double equal to use karun pn 2 values overlap ka zal , .equals() method use karaaychya aadhi
			return true;
		}
		return false;
	}
}

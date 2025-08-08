package core_java;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Supervisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Supervisor,Integer> trmap=new TreeMap<>(new HelperClass());
		
		trmap.put(new Supervisor(3,"Axndjx",1234), 10);
		trmap.put(new Supervisor(1,"Boidjgk",5678),20);
		trmap.put(new Supervisor(2,"Clgjxgjhk",3746), 30);
		
		System.out.println(trmap);

	}

}

class Supervisor implements Comparable<Supervisor>{
	
	int id;
	String name;
	long salary;
	
	public Supervisor(int id,String name,long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.salary;
	}

	@Override
	public int compareTo(Supervisor o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
		
	}
}


class HelperClass implements Comparator<Supervisor>{

	@Override
	public int compare(Supervisor o1, Supervisor o2) {
		// TODO Auto-generated method stub
		return o1.name.length()-o2.name.length();
	}
	
}

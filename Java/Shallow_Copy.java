package core_java;

public class Shallow_Copy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Shallow_Demo e1=new Shallow_Demo(1,"ABC");
		
		Shallow_Demo e2=(Shallow_Demo)e1.clone();
		
		System.out.println(e1.id);
		System.out.println(e2.id);
		
		e2.id=2;
		System.out.println(e1.id);
		System.out.println(e2.id);

	}

}

class Shallow_Demo implements Cloneable{
	int id;
	String name;
	Shallow_Demo2 Demo_name;
	
	public Shallow_Demo(int id,String name,Shallow_Demo2 Demo_name) {
		this.id=id;
		this.name=name;
		this.Demo_name=Demo_name;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Shallow_Demo2 {
	String Demo_name;
	
	
	public Shallow_Demo2(String Demo_name) {
		this.Demo_name=Demo_name;
	}
}

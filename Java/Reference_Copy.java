package core_java;

public class Reference_Copy {

	public static void main(String[] args) {
	  Employee e1=new Employee(1,"ABC");
	  
	  Employee e2=e1;
	  
	  System.out.println(e1.id);
	  System.out.println(e2.id);
	  
	  e2.id=2;
	  System.out.println(e1.id);
	  System.out.println(e2.id);
	
	}

}

class Employee{
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		}
}

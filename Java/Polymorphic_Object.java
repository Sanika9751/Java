package core_java;

interface Animal_Kingdom{
	public void eat();
	public void drink();
	default void breath() {
		System.out.println("Animals breathing");
	}
}

interface Plant_Kingdom{
	public void eat();
	public void drink();
	default void breath() {
		System.out.println("Plants breathing");
	}
}

class Creature implements Animal_Kingdom,Plant_Kingdom{

	@Override
	public void eat() {
	  System.out.println("eating....");
	}

	@Override
	public void drink() {
		System.out.println("drinking....");
		
	}

	@Override
	public void breath() {	
		Animal_Kingdom.super.breath(); //Animal_Kingdom breath() method will be displayed 
		Plant_Kingdom.super.breath();  //Plant_Kingdom breath() method will be displayed
		System.out.println("Breath() method of creature method");
		
	}
	
	
}
public class Polymorphic_Object {

	public static void main(String[] args) {
		Creature c=new Creature();
		c.drink();
		c.eat();
		c.breath();

	}

}

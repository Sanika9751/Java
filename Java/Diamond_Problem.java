package core_java;

interface parent1{
	public void fun();
}

interface parent2{
	public void fun();
}

class test implements parent1,parent2 {

	@Override
	public void fun() {
		System.out.println("method in test class");
	}
}

public class Diamond_Problem{
	public static void main(String[] args) {
		test t=new test();
		t.fun();
	}
}

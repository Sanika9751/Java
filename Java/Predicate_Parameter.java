package core_java;

import java.util.function.Predicate;

public class Predicate_Parameter {

	public static void Demo(int i,Predicate<Integer> pred) {
		System.out.println(pred.test(10));
	}
	
	public static void main(String[] args) {
	   Demo(10,(i)->(i>10));

	}

}


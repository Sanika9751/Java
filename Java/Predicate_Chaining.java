package core_java;

import java.util.function.Predicate;

public class Predicate_Chaining {

	public static void main(String[] args) {
		Predicate<Integer> pred1=(i)->(i>10);
		
		Predicate<Integer> pred2=(i)->(i<100);
		
		System.out.println(pred1.and(pred2).test(90));
		System.out.println(pred1.or(pred2).test(30));
		System.out.println(pred1.or(pred2).negate().test(30));


	}

}

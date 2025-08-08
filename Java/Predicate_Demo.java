package core_java;

import java.util.function.Predicate;

public class Predicate_Demo {

	public static void main(String[] args) {
		//Using Annonymous Class
//		Predicate<Integer> pred=new Predicate<>() {
//			public boolean test(Integer i) {
//				if(i%2==0) {
//					return true;
//				}
//				return false;
//			}
//		};
//		
//		System.out.println(pred.test(2));
//		
//Using Lambda Expression
		
		Predicate<Integer> pred=(i)->{
			if(i%2==0) {
				return true;
			}
			return false;
		};

		System.out.println(pred.test(10));
	}

}

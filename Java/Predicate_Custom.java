package core_java;

import java.util.function.Predicate;

public class Predicate_Custom {

	public static void main(String[] args) {
		Cars car=new Cars(90,"Audi");
		
		//using Annonymous Class
//		Predicate<Cars> pred=new Predicate<>() {
//
//			
//			@Override
//			public boolean test(Cars t) {
//				if(car.price>1000000) {
//					return true;
//				}
//				return false;
//			}
//			
//		};

//		System.out.println(pred.test(car));
		
		
		
		//Using Lambda Expression
		
		Predicate<Cars> pred1=(j)->{
			if(car.price>10000)
				return true;
			return false;
		};
		
		System.out.println(pred1.test(car));
	}

}

class Cars{

	int price;
	String name;
	
	public Cars(int price,String name) {
		this.price=price;
		this.name=name;
	}
}
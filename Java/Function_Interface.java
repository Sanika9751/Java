package core_java;

import java.util.function.Function;

//*********************Function functional Interface******************
public class Function_Interface {

	public static void main(String[] args) {
		Function<Integer,Integer> fun1=(i)->(i+100);
		
		Function<Integer,Integer> fun2=(i)->(i+10);
		
//		Function<Integer,Integer> fun3=fun1.compose(fun2);
//		
//		System.out.println(fun3.apply(10));    //Output is 120

		Function<Integer,Integer> fun4=fun1.andThen(fun2);
		
		System.out.println(fun4.apply(200));  //Output is 310
		
	}

}

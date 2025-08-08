package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Stream_Intermediatory {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Function<Integer,Double> fun=(i)->{return i*2.0;};
		
		list.stream().map(fun).forEach((i)->{System.out.println(i);});

	}

}

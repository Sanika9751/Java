package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream_Terminal {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Stream<Integer> strm=list.stream();
		
		Consumer<Integer> cons=(i)->{System.out.println(i*2);};
		
		strm.forEach(cons);
	}

}

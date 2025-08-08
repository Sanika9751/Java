package core_java;

import java.util.ArrayList;
import java.util.List;

public class Filter_Method {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(100);
		list.add(150);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		list.stream().filter((i)->(i>200)).forEach((i)->{System.out.println(i);});
		
	}

}

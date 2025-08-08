package core_java;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to India";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> e:map.entrySet()) {
			System.out.println(e);
		}
	}

}

package core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Stream_Intermediatory2 {

	public static void main(String[] args) {
		
		
		Function<StringBuffer,StringBuffer> func=(ch)->
		{
			StringBuffer str1=new StringBuffer(ch);
			
			char[] ch1=str1.toString().toCharArray();
			
			
			for(int i=0;i<ch1.length;i++) {
//				if(ch1[i]=='e') {
//					ch1[i]='E';
//				}
//				else if(ch1[i]=='o') {
//					ch1[i]='O';
//				}
				
				//We can also use switch case
				switch(ch1[i]) {
				case 'a':
					ch1[i]='A';
					break;
				case 'e':
					ch1[i]='E';
					break;
				case 'i':
					ch1[i]='I';
					break;
				case 'o':
					ch1[i]='O';
					break;
				case 'u':
					ch1[i]='U';
					break;
				case 'A':
					ch1[i]='a';
					break;
				case 'E':
					ch1[i]='e';
					break;
				case 'I':
					ch1[i]='i';
					break;
				case 'O':
					ch1[i]='o';
					break;
				case 'U':
					ch1[i]='u';
					break;
				default:
					
				
				
				
				
				
				
				}
			}
	
		StringBuffer buffer=new StringBuffer();
		for(char c:ch1) {
			buffer.append(c);
		}
		
		return buffer;
		
		};
		
		
		List<StringBuffer> list=new ArrayList<>();
		list.add(new StringBuffer("WelcomE"));
		list.add(new StringBuffer("aeiou"));
		list.add(new StringBuffer("AEIOU"));
		
		list.stream().map(func).forEach((i)->{System.out.println(i);});
		
		}
		
		
		
	}


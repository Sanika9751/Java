package core_java;

public class Throw_Demo {

	public static void main(String[] args) {
		int i=1,j=0;
		try {
		if(j==0) {
			throw new Exception("Wrong");
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

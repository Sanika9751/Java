package core_java;

public class Exception_Age {

	public static void main(String[] args) throws AgeException {
		int age=10;
		try {
		 if(age<18) {
			 throw new AgeException();
		 }
		 else {
			 System.out.println("You are eligible to vote");
		 }
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class AgException extends Exception{
	
	
	
}

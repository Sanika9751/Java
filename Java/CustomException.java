package core_java;

public class CustomException {

	public static void main(String[] args) throws AgeException {

		AgeException ageEx = new AgeException();
	}

}

class AgeException extends Exception {
	int age = 20;

	public AgeException() {
		super("you are not elifible to vote");
	}

	if(age>18)

	{
		throw new AgeException();
	}

}
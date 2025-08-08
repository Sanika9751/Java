package core_java;

public class Exception_Demo {

	public static void main(String[] args) {
		try {
			System.out.println(8/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() +" of Arithmetic exception");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

package core_java;

class overPrice_Exception extends Exception{
	
	
	overPrice_Exception(){
		super();
		System.out.println("Instance created");
		System.out.println("go ahead");
	}
	
}
class underPrice_Exception extends Exception{
	
	underPrice_Exception(){
		System.out.println("stop");
	}
	
}


public class Exception_Example {

	public static void main(String[] args) throws overPrice_Exception, underPrice_Exception{
		int price=600;
		
		try {
			if(price>100) {
				throw new overPrice_Exception();
			}
			else {
				throw new underPrice_Exception();
			}
			
		}
		catch(overPrice_Exception e) {
			System.out.println(e.getMessage());
		}
		catch(underPrice_Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

package core_java;

public class Demo_Practice {

	public static void main(String[] args) {
	int n=1,flag=1;
	
	if(n==1 || n==0) {
		System.out.println("Not prime");
	}
	else {
	for(int i=2;i<n/2;i++) {
		if(n%i==0) {
			flag=0;
		}
	}
	if(flag==1) {
		System.out.println("Prime");
		}
	else {
		System.out.println("Not");
	}
	
	}
}
}


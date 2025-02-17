package oops;

public class Polymorphism {
	int a;
	int b;

	public Polymorphism() {
	
	}
	public Polymorphism(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Object name() {
		System.out.println("Hello");
		return 0;
	}
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int ...numbers) {   // method overloading 
		 
		
		// ... concept callled as var args 
		
		int sum=0;
		for(int i:numbers) {
			sum+=i;
		}
		return sum;
		
	} 
}

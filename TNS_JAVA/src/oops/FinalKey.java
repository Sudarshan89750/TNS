package oops;

public final  class FinalKey {
//	final int x; it will give an error due to not intilization 
	final int a=10;
	final public void display () 
// this method can't @override
	{
		System.out.println(a);
	}

}

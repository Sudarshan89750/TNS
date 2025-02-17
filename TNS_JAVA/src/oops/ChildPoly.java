package oops;

//import javax.sound.midi.Soundbank;

public class ChildPoly extends Polymorphism {
	@Override   // using concept of 
	public String name() { 
		System.out.println();
		return "Hello";
		
	}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		System.out.println(p.add(1,2,3,4,5,6,7,8,90));
	}
}

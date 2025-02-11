package oops;

public class Student extends Citizen {
	int roll;
	String college;
	public Student(String name, String adharNo, String city, String phone,int roll,String college) {
		super(name, adharNo, city, phone);
		this.roll=roll;
		this.college=college;
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", college=" + college + ", name=" + name + ", adharNo=" + adharNo + ", city="
				+ city + ", phone=" + phone + ", getRoll()=" + getRoll() + ", getCollege()=" + getCollege()
				+ ", getName()=" + getName() + ", getAdharNo()=" + getAdharNo() + ", getCity()=" + getCity()
				+ ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public static void main(String[] args) {
		Student s = new Student("Shubham", "381821955565", "Beed", "9359395424", 21, "Keystone");
		System.out.println(s);
	}
	

}
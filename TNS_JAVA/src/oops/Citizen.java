package oops;



public class Citizen {
	String name;
	String adharNo;
	String city;
	String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Citizen(String name, String adharNo, String city, String phone) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.city = city;
		this.phone = phone;
	}

}

package in.onlydocs.bean;

import java.util.Date;

public class Customer {
	String firstName;
	String middleName;
	String lastName;
	String mobile;
	Date dateOfBirth;
	String address;
	String town;
	int pin;
	String area;
	Order order;
	
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", mobile=" + mobile + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", town=" + town
				+ ", pin=" + pin + ", area=" + area + ", order=" + order + "]";
	}
}

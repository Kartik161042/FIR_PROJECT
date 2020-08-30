package com.FIR.Beans;

public class UserDetails {
	private int id;
	private String name;
	private int age;
	private String mobile;
	private String address;
	private String gender;
	private String adhar_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", address="
				+ address + ", gender=" + gender + ", adhar_no=" + adhar_no + "]";
	}
	
}

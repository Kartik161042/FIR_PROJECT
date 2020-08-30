package com.FIR.Beans;

public class UserType {
	private int id;
	private String Admin;
	private String Victim;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin() {
		return Admin;
	}
	public void setAdmin(String admin) {
		Admin = admin;
	}
	public String getVictim() {
		return Victim;
	}
	public void setVictim(String victim) {
		Victim = victim;
	}
	@Override
	public String toString() {
		return "UserType [id=" + id + ", Admin=" + Admin + ", Victim=" + Victim + "]";
	}
	
}

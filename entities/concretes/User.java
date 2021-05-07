package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity  {
	private int id;
	
	private String firstName;
	private String surName;
	private String eMail;
	private String password;
	
	public User() {
	
	}
	
	public User(int id,String firstName, String surName, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.eMail = eMail;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User "+ firstName + " "+ surName +" ,"+ eMail  ;
	}
}

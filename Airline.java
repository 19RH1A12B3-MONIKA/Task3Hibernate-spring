package com.motivity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Airlines")
@Entity
public class Airlines {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int passport_id;
	@Column(name="name")
      private String name;
	@Column(name="login")
	 String login;
	@Column(name="password")
	 private String password;
	@Column(name="mobile")
	private String mobile;
	public Airlines(int passport_id, String name, String login, String password, String mobile) {
		// TODO Auto-generated constructor stub
		this.passport_id = passport_id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.mobile = mobile;
	}
	
	
	public Airlines(int passport_id) {
		this.passport_id=passport_id;
	}
	
	/*public Airlines(Object airlines) {
		this.airlines=airlines;
	}*/
	public Airlines() {}
	
	public int getPassport_id() {
		return passport_id;
	}
	public void setPassport_id(int passport_id) {
		this.passport_id = passport_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Airlines [passport_id=" + passport_id + "  name=" + name + "  login=" + login + "password"+password+"mobile"+mobile
				+ "]";
	}
	
	
	
		
	
	
	

}

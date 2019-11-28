package com.hcl;

import javax.persistence.Column;

public class User {

	@Column
	private int userid;
	@Column
	private String username;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}
	
	public User(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

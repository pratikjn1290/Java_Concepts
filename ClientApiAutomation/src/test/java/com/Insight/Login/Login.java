package com.Insight.Login;

public class Login {

	String userid;
	String password;
	String sourcesystem;

	public Login(String userid, String password, String sourcesystem) {
		this.userid = userid;
		this.password = password;
		this.sourcesystem = sourcesystem;

	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSourcesystem() {
		return sourcesystem;
	}

	public void setSourcesystem(String sourcesystem) {
		this.sourcesystem = sourcesystem;
	}

}
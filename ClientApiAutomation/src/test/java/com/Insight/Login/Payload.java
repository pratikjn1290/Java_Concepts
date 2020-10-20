package com.Insight.Login;

public class Payload {

	Login userid;
	public Login getUserid() {
		return userid;
	}

	public void setUserid(Login userid) {
		this.userid = userid;
	}

	public Login getPassword() {
		return password;
	}

	public void setPassword(Login password) {
		this.password = password;
	}

	public Login getSourcesystem() {
		return sourcesystem;
	}

	public void setSourcesystem(Login sourcesystem) {
		this.sourcesystem = sourcesystem;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	Login password;
	Login sourcesystem;
	Request request;
	
	public Payload(Login userid, Login password, Login sourcesystem, Request request)
	{
		 this.userid = userid;
		 this.password = password;
		 this.sourcesystem = sourcesystem;
		 this.request = request;
	}
	

	
	
	
}

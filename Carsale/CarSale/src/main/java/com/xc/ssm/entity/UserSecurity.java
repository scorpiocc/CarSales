package com.xc.ssm.entity;

public class UserSecurity {
	private String username;
	private String authority;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "UserSecurity [username=" + username + ", authority=" + authority + "]";
	}
}

package com.myclass.entity;

public class User {
	private int id;
	private String email;
	private String password;
	private String avatar;
	private int roleId;
	
	public User() {}
	
	public User(int id, String email, String password, String avatar, int roleId) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.roleId = roleId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}

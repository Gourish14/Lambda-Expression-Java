package com.cozentus.Lambda;

public class User {
	int id;
	String name;
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Id=" + id + ", Name="+name;
	}
	
}

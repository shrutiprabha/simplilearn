package com.simplilearn.phase1;

class MyMainEmployee{
	private int id;
	private String name;
	public MyMainEmployee(String myName,int myId) {
		id=myId;
		name=myName;
	}
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
	
}

public class constructor {
	public static void main(String[] args) {
		MyMainEmployee harry=new MyMainEmployee("Harihar", 12);
		System.out.println(harry.getId());
		System.out.println(harry.getName());
		
	}
}

package com.simplilearn.phase1;

 class MyEmployee {
	 private int id;
	 private String name;
	 protected int y=45;
	 int z=6;
	 
	 
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
	public void meth1() {
		System.out.println(y);
		System.out.println(z);
	}
	

}
public class accessSpecifier{
	public static void main(String[] args) {
		MyEmployee harry=new MyEmployee();
		//harry.id=45;//private
		//harry.name="Harry";//private//so not possible to execute
		harry.setName("Hello");
		System.out.println(harry.getName());
		harry.setId(234);
		System.out.println(harry.getId());
		
		
		
		
	}
}


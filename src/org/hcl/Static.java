package org.hcl;

public class Static {
	 String_ex name ;
	 String_ex college;
	 
	 public void display() {
		System.out.println(name);
		System.out.println(college);
	}
}
class demo{
	public static void main(String_ex[] args) {
		Static caller= new Static();
		caller.name="Raj";
		caller.college="A.v.c college of engineering";
		
	}
	
	
}
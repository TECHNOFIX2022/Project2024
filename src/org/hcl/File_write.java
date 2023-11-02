package org.hcl;


import java.io.FileWriter;
						   //Writer
						  //File handling
public class File_write {//Codewith_Rk
	
	public static void main(String[] args) {
	try {
		FileWriter obj = new FileWriter("C:\\\\Rajkumar\\\\In.txt");
		obj.write("hello, i am Rajkumar");
		obj.close();
	} catch (Exception e) {
		System.out.println(e);
	}	
	System.out.println("success");	
	}
	

}

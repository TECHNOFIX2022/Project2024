package org.hcl;		   	

import java.io.IOException;

   						  //Exception-throw is hided
public class Exception1 {//codingwith_Rk 
	
	void m() throws IOException{//create own exception
			throw new IOException("device error");
	}
		
	void p(){
		try {
			m();
		}
		catch (Exception e) {
			System.out.println("exception handled");
		}	
	}
public static void main(String[] args) {
	Exception1 obj= new Exception1();
	obj.p();
	System.out.println("normal flow...");
}
}
x
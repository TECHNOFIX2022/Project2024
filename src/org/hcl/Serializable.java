package org.hcl;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class emp implements Serializable {

	int eid;
	String ename;
	
	emp(int eid , String ename){
		this.eid=eid;
		this.ename=ename;
	}
}

class ser_ex{
	public static void main(String[]args) {
		
		try {
		emp obj = new emp(1,"Rajkumar");
		//Serializable 
		/*FileOutputStream fout = new FileOutputStream("C:\\Rajkumar\\stream.txt");
		ObjectOutputStream  a = new ObjectOutputStream(fout);
		a.writeObject(obj);
		a.flush();
		a.close();*/
		//deSerializable 
		ObjectInputStream b = new ObjectInputStream(new FileInputStream("C:\\Rajkumar\\stream.txt"));
		emp d=(emp)b.readObject();
		System.out.println(d.eid+","+d.ename);
		b.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	} 
		
}



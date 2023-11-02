package org.hcl;

public class String_ex {

	public static void main(String [] args) {
		/*String s = "Gowtham";
		String b = "Nandhu";
		System.out.println(s.toUpperCase());//print Uppercase
		System.out.println(s.toLowerCase());//print lowercase
		System.out.println(s);//just print 
		System.out.println(s.concat(""+b));//join both the String
		System.out.println(s.substring(3));//print from 3
		System.out.println(s.substring(3, 5));//print between 3 to 5
		System.out.println(s.replace("Go", "sb"));//replace the String
		System.out.println(s.length());//print length of String
		System.out.println(s.charAt(3));//print only third letter
*/
		String h="1,gowtham,male,100";
		h.toString();
		String d[] = h.split(",");
		System.out.println(d[0]+" , "+d[2]);
		
	}

}

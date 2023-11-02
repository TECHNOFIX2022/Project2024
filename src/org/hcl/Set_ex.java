package org.hcl;

import java.util.HashSet;
import java.util.Iterator;
					  //set-hashset
public class Set_ex {//codingwith_Rk

	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<String>();
		s1.add("Rajkumar");
		s1.add("shiva");
		s1.add("iyo");
		s1.add("pocha");
		//Traversing elements
		Iterator<String>itr =s1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		s1.remove("iyo");
		System.out.println(s1);
		
	}

}

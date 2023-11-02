package org.hcl;
import java.util.Iterator;
import java.util.LinkedList;
					   //Linked list 	
public class List_ex {//codingwith_Rk

	public static void main(String[] args) {
		LinkedList<String> Is=new LinkedList<String>();
		Is.add("rajkumar");
		Is.add("Sneha");
		Is.add("Aachu");
		Is.add("Raman");
		System.out.println(Is);
		
		Iterator<String>itr=Is.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
		Is.add(1,"Ram");
		System.out.println(Is);
			
		Is.remove(0);
		System.out.println(Is);
		}
	}



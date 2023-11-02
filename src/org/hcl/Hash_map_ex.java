package org.hcl;

import java.util.HashMap;	  //Collection
import java.util.Map;        //Hash-Map
public class Hash_map_ex {//codingwith_Rk

	public static void main(String[] args) {
		HashMap<Integer, String>map = new HashMap<Integer, String>();//Creating 
		map.put(1, "Rajkumar");										//HashMap
		map.put(2, "nandhu");										
		map.put(3, "saravana");										
		map.put(1, "rahul");										

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
	}

}

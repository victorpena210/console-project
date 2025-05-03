package dataAnnotation;

import java.util.HashMap;

public class HashMapsAndEntrySets {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(10, "geeks");
		hashMap.put(15, "for");
		hashMap.put(20, "geeks");
		hashMap.put(25, "welcomes");
		hashMap.put(30, "You");
		
		System.out.println("Initial Mappings: " + hashMap);
		System.out.println("The set is: " + hashMap.entrySet());
		
		
		
	}

}

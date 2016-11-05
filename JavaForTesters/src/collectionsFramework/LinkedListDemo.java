package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		
		countries.add("US");
		countries.add("Japan");
		countries.add("India");
		countries.add("Japan");
		
		System.out.println("Total countries = " + countries.size());
		
		for (String t : countries){
			System.out.println(t);
		}
	}

}

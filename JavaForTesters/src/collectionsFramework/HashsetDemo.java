package collectionsFramework;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<Integer> phonenumbers = new HashSet<>();
		
		phonenumbers.add(12345646);
		phonenumbers.add(985785456);
		phonenumbers.add(456324);
		phonenumbers.add(985785456);
		
		for (int t : phonenumbers){
			System.out.println(t);
		}
	}

}

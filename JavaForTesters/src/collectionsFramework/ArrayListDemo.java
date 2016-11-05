package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Denver");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("Paris");
		
		System.out.println("Number of elements in the list = " + cities.size());
		
		
		for (String t: cities){
			System.out.println(t);
		}
		
		
	}

}

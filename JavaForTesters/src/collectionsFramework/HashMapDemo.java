package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> tel_directory = new HashMap<>();
		
		tel_directory.put("Steve", 7896545);
		tel_directory.put("Paul", 852356);
		
		for (Map.Entry m:tel_directory.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

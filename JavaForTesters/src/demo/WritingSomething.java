package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingSomething {
	
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("C:\\Selenium23\\Scores.txt");
		PrintWriter output = new PrintWriter(file);
		
		output.println("Deepinder");
		output.println("80");
		
		output.close();
	}

}

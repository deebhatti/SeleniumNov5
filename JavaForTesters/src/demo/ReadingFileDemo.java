package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileDemo {
	public static void main(String[] args) throws IOException {
		String currentLine;
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Selenium\\TestData.txt"));
		
		while ((currentLine = br.readLine()) != null )
		{
			System.out.println(currentLine);
		}
		
	}

}

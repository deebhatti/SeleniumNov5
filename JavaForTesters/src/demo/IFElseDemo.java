package demo;

import java.util.Scanner;

public class IFElseDemo {
	public static void main(String[] args) {
		System.out.println("Please write the color - ");
		Scanner k = new Scanner(System.in);
		String color = k.nextLine();
		
		if (color.equals("yellow")){
			System.out.println("Today it is Sunny outside");
		}
		
		else if (color.equals("black")){
			System.out.println("Today  it is cloudy");
		}
		
		else {
			System.out.println("Weather cannot be predicted");
		}
	}

}

package demo;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		System.out.println("Please enter today's day - ");
		Scanner k = new Scanner(System.in);
		String day = k.nextLine();
		
		switch(day){
		case "Monday":
			System.out.println("Today I will wear pink");
			break;
			
		case "Tuesday":
			System.out.println("Today I will wear white");
			break;
			
		case "Wednesday":
			System.out.println("Today I will wear green");
			break;
			
		case "Thursday":
			System.out.println("Today I will wear yellow");
			break;
			
		case "Friday":
			System.out.println("Today I will wear blue");
			break;
			
		case "Saturday":
			System.out.println("Today I will wear brown");
			break;
			
		case "Sunday":
			System.out.println("Today I will wear black");
			break;
			
				
				
		}
		
		
	}

}

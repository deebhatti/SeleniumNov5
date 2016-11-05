package demo;

public class Calculator {
	
	
	
	public void add(int a, int b){   //Declaration/Defining of method add -- a and b are formal arguments
		System.out.println(a+b);
	}
	
	public void subtract(int a, int b){    //Declaration/Defining of method sutract 
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b){
		System.out.println(a*b);
	}
	//Adding a comment in line number 17
	
	public void divide(int a , int b){
		System.out.println(a/b);
	}
	
	
	
	
	public static void main(String[] args){
		Calculator basicCal = new Calculator();
		
		basicCal.add(5, 6);         //Calling the method add   --5 and 6 are actual arguments
		basicCal.add(8, 12);       //Calling the method add
		basicCal.subtract(10, 6);  //Calling the method subtract
		
		basicCal.multiply(19, 7);
		
		basicCal.divide(100, 10);
		
	}
	
	
	
	
	
	
	
	

}

package inheritance;

public class HR extends Employee{
	
	int bonus = 12000; 
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		HR Ramesh = new HR();
		
		System.out.println("Total money received by Ramesh = $ " + (Ramesh.Salary+Ramesh.bonus));
		
		Ramesh.circular();
	}

}

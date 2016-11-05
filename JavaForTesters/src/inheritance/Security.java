package inheritance;

public class Security extends Employee {
	
	int bonus = 5000;
	
	
	public void circular(){
		System.out.println("All the employees will have 3 WFHs from next month onwards");
	}
	
	public static void main(String[] args) {
		Security Vijay = new Security();
		
		Vijay.circular();
	}
	

}

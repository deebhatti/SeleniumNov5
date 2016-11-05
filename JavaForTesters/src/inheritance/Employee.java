package inheritance;

public class Employee {
	int Salary = 70000;
	
	public void greetings(){
		System.out.println("Good Evening Everyone !");
	}
	
	void circular(){
		System.out.println("All the employees will have 5 WFHs from next month onwards");
	}
	
	public static void main(String[] args) {
		Employee John = new Employee();
		John.circular();
	}

}

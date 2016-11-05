package inheritance;

public class IT extends Employee {
	
	int bonus = 10000;
	
	
	public void greetings(){
		System.out.println("Good morning everyone !");
	}
	
	
	
	
	
	public static void main(String[] args) {
		IT Ram = new IT();
		
		System.out.println("Total money received by Ram = $ " + (Ram.Salary+Ram.bonus));
		
		Ram.greetings();
		
		Ram.circular();
	}

}

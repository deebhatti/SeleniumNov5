package demo;

public class Tickets {

	private double undiscountedPrice;
	private double priceForSeniorCitizen;
	private double priceForChildren;

	public Tickets(double maxPrice) {
		undiscountedPrice = maxPrice;
		priceForSeniorCitizen = maxPrice * 0.85;
		priceForChildren = maxPrice * 0.5;

	}

	public void printUndiscountedTicket() {
		System.out.println("Journey Fare = $ " + undiscountedPrice);
	}

	public void printTicketForSeniorCitizens() {
		System.out.println("Journey Fare = $ " + priceForSeniorCitizen);
	}

	public void printTicketForChildren() {
		System.out.println("Journey Fare = $ " + priceForChildren);
	}

	public static void main(String[] args) {
		Tickets TrainTicket = new Tickets(45);

		// TrainTicket.printUndiscountedTicket();

		// TrainTicket.printTicketForSeniorCitizens();

		TrainTicket.printTicketForChildren();

	}

}

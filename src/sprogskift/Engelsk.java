package sprogskift;
public class Engelsk implements SprogI{

	public void printMenu() {
		System.out.println("Welcome to dogexchange");
		System.out.println("1) Show dogs");
		System.out.println("2) Pick dog");
		System.out.println("3) Search dog by name");
		System.out.println("4) Change language");
		System.out.println("9) End program");
		System.out.println("Type your choice: ");
	}
	public void printLang() {
		System.out.println("Change language: ");
		System.out.println("1) Danish");
		System.out.println("2) English");
		System.out.println("3) German");
	}
	
}
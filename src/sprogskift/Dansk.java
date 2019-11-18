package sprogskift;

/**
 *
 * @author thor
 */
public class Dansk implements SprogI{

	public void printMenu() {
		System.out.println("Velkommen til hundeuddelingen");
		System.out.println("1) Vis hundelisten");
		System.out.println("2) Vælg hund");
		System.out.println("3) Søg hund efter navn");
		System.out.println("4) Skift sprog");
		System.out.println("9) Afslut programmet");
		System.out.println("Indtast valg: ");
	}
	public void printLang() {
		System.out.println("Skift sprog: ");
		System.out.println("1) Dansk");
		System.out.println("2) Engelsk");
		System.out.println("3) Tysk");
	}
	
}

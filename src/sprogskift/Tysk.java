package sprogskift;

/**
 *
 * @author Acer
 */
public class Tysk implements SprogI{
    
    public void printMenu() {
		System.out.println("Willkommen zur Hundeausstellung");
		System.out.println("1) Zeigen Sie die Hundeliste");
		System.out.println("2) Hund auswählen");
		System.out.println("3) Hund nach Namen suchen");
		System.out.println("4) Sprache wechseln");
		System.out.println("9) Beenden Sie das Programm");
		System.out.println("Auswahl eingeben: ");
	}
	public void printLang() {
		System.out.println("Sprache wechseln: ");
		System.out.println("1) Dänisch");
		System.out.println("2) Englisch");
		System.out.println("3) Deutsch");
	}
    
}

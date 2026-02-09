import java.util.Scanner;
import java.util.ArrayList;

public class NotenrechnerOhneOOP {
	static Scanner sc = new Scanner (System.in);
	static ArrayList<Integer> punkte = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createMenue();
	}

	
	// da in mehreren Aufgaben wichtig ist, dass bereits Werte eingetragen sind, habe ich zu Beginn zwei mögliche Menues erzeugt. 
	// der*die Benutzende bekommt unterschiedliche Auswahlmöglichkeiten
	private static void createMenue() {
		if (punkte.size() == 0) {
			System.out.println("Noch keine Punkte vorhanden");
			System.out.println("Menue: ");
			System.out.println("1. Neue Punktzahl eingeben");
			System.out.println("2. Programm beenden");
			auswahlBegrenzt(sc.nextInt());
		}
		else {
			System.out.println("Menue: ");
			System.out.println("1. Neue Punktzahl eingeben");
			System.out.println("2. alle Punkte + Noten anzeigen");
			System.out.println("3. Durchschnitt berechnen");
			System.out.println("4. Beste + Schlechteste Note");
			System.out.println("5. Punktzahl löschen");
			System.out.println("6. Punktzahl ändern");
			System.out.println("7. Programm beenden");
			auswahl(sc.nextInt());
		}
	}
	
	// Auswahlmöglichkeiten, wenn die ArrayList keinen Eintrag hat
	private static void auswahlBegrenzt(int zahl){
		switch(zahl) {
			case 1:
				if (punkte.size()<10)
					punkte.add(neueEingabe());
				else 
					System.out.println("Maximale Anzahl erreicht");
				break;
			case 2:
				System.out.println("Das Programm wird jetzt beendet. Auf Wiedersehen.");
				System.exit(0);
			default:
				System.out.println("Fehlerhafte Eingabe. Probier es nochmal");
				break;
			}
		createMenue();
	}
	
	// Auswahlmöglichkeiten, wenn bereits Einträge in der ArrayList sind
	private static void auswahl(int zahl) {
		switch(zahl) {
			case 1:
				if (punkte.size()<10)
					punkte.add(neueEingabe());
				else 
					System.out.println("Maximale Anzahl erreicht");
				break;
			case 2: 
				alleAnzeigen();
				break;
			case 3:
				durchschnittBerechnen();
				break;
			case 4:
				besteUndSchlechteste();
				break;
			case 5:
				punkte.remove(eineLoeschen());
				break;
			case 6: 
				punkte.set(eineAendern(), neueEingabe());
				break;
			case 7:
				System.out.println("Das Programm wird jetzt beendet. Auf Wiedersehen.");
				System.exit(0);
			default:
				System.out.println("Fehlerhafte Eingabe. Probier es nochmal");
				break;
		}
		createMenue();
	}
	
	// Methode zur Eingabe neuer und zu ändernder Einträge
	private static int neueEingabe() {
		System.out.println("Bitte gib eine Ganzzahl zwischen 0 und 100 ein");
		int neuePunktzahl = sc.nextInt();
		if (neuePunktzahl < 0 || neuePunktzahl > 100) {
			System.out.println("Fehlerhafte Eingabe. Probier es nochmal");
			neueEingabe();	
		}
		return neuePunktzahl;
	}
	
	// Methode zum Anzeigen der ArrayList und den entsprechenden Noten
	private static void alleAnzeigen() {
		int note;
		for (int i = 0; i <= punkte.size()-1; i++) {
			note = punkteZuNote(punkte.get(i));
			System.out.println((i+1) + ". Punktzahl: " + punkte.get(i) + " -> Note: " + note);
		}
	}
	
	// Methode zur Notenumrechnung
	private static int punkteZuNote (int punktzahl) {
		int note;
		if (punktzahl < 30)
			note = 6;
		else if (punktzahl < 50)
			note = 5;
		else if (punktzahl < 67)
			note = 4;
		else if (punktzahl < 81)
			note = 3;
		else if (punktzahl < 92)
			note = 2;
		else 
			note = 1;
		return note;
	}
	
	// Methode zur Berechnung und Ausgabe des Punktedurchschnitts
	private static void durchschnittBerechnen() {
		double gesamt = 0;
			
		for (int i = 0; i <= punkte.size()-1; i++) {
			gesamt += punkte.get(i);
		}
			
		double durchschnitt = gesamt / (punkte.size()+1);
		System.out.println("Dein Notendurchschnitt beträgt: " + durchschnitt + " Punkte");
	}
	
	// Methode zur Berechnung und Ausgabe der besten und schlechtesten Punktzahl
	private static void besteUndSchlechteste() {
		int beste = 0;
		int schlechteste = 100;
			
		for (int i = 0; i <= punkte.size()-1; i++) {
			if (beste < punkte.get(i))
				beste = punkte.get(i);
			if (schlechteste > punkte.get(i))
				schlechteste = punkte.get(i);	
		}
		
		System.out.println("Deine beste Punktzahl: " + beste);
		System.out.println("Deine schlechteste Punktzahl: " + schlechteste);
	}
	
	// Methode zum Löschen einzelner Elemente
	private static int eineLoeschen() {
		listElementMenue();
		int loeschwahl = sc.nextInt();
		
		if (loeschwahl < 1 || loeschwahl > punkte.size()) {
			System.out.println("Die Zahl ist nicht innerhalb der Auswahl. Probier es nochmal");
			eineLoeschen();
			}
		
		return (loeschwahl-1);
	}
	
	// Methode zum Ändern einzelner Elemente
	private static int eineAendern() {
		listElementMenue();
		int aenderung = sc.nextInt();
	
		if (aenderung < 1 || aenderung > punkte.size()) {
			System.out.println("Fehlerhafte Eingabe. Probier es nochmal");
			eineAendern();
			}
		
		return (aenderung-1);
	}
	
	// wenn ein Element gelöscht oder geändert wird, sollen zunächst die Elemente angezeigt werden
	private static void listElementMenue() {
		for (int i = 0; i <= punkte.size()-1; i++) {
			System.out.println((i+1) + ". Punktzahl: " + punkte.get(i));
			}
		System.out.println("Bitte gib eine Zahl zwischen 1 und " + (punkte.size()) + " ein");
	}
 	
		
}
	


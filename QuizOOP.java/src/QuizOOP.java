import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizOOP {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Question> question = new ArrayList<Question>();
	public static int[] antwortPool = {0,1,2,3,4};
	public static Random r = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createMenue();
	}

	public static void createMenue() {  
		System.out.println("Menü");
		System.out.println("----------------");
		System.out.println("(S)tart");
		System.out.println("(Q)uiz beenden");
		
		String Eingabe = sc.next(); 
		
		if (Eingabe.equals("s") || Eingabe.equals("S")) 
			start();
		else if (Eingabe.equals("q") || Eingabe.equals("Q")) 
			quizBeenden();
		else 
			falscheEingabe();
	}
	
	private static void start() {
		int punktestand = 0;
		erstelleFragen();

		for (int i = 0; i < 5; i++) {
			int rI = stelleRandomFrage(antwortPool);
			
			System.out.println(question.get(rI).getFrage());
			String[] antwort = question.get(rI).getAntwort();
			System.out.println("(A) " + antwort[0] 
								+ "   (B) " + antwort[1] 
								+ "   (C) " + antwort[2] 
								+ "   (D) " + antwort[3]);
			String richtig = question.get(rI).getRichtig();
			
			String Eingabe = sc.next(); 
			if ((Eingabe.equals("a") || Eingabe.equals("A")) && antwort[0].equals(richtig)) {
				System.out.println("korrekt");
				punktestand++;
			}
			else if ((Eingabe.equals("b") || Eingabe.equals("B")) && antwort[1].equals(richtig)) {
					System.out.println("korrekt");
					punktestand++;
			}
			else if ((Eingabe.equals("c") || Eingabe.equals("C")) && antwort[2].equals(richtig) ) {
					System.out.println("korrekt");
					punktestand++;
			}
			else if ((Eingabe.equals("d") || Eingabe.equals("D")) && antwort[3].equals(richtig)) {
					System.out.println("korrekt");
					punktestand++;
			}
			else {
				System.out.println("falsch");
				break;
			} 
		}
		System.out.println();
		if (punktestand == 5)
			System.out.println("Herzlichen Glückwunsch. Du hast " + punktestand + " Punkte erzielt");
		else 
			System.out.println("Du hast " + punktestand + " Punkte erzielt");
	}
	
	public static ArrayList<Question> erstelleFragen() {

		String[] antwort1 = {"Ein Betriebssystem", "Eine virtuelle Maschine", "Eine Virtualisierungsanwendung", "Ein Container"};
		Question q1 = new Question("Was ist ein Hypervisor?",antwort1, "Eine Virtualisierungsanwendung" );
		question.add(q1);
		
		String[] antwort2 = {"Parallele Nutzung verschiedener Betriebssysteme", "Zugang ins Internet", "Erstellen von Back-ups", "Drosselung der CPU"};
		Question q2 = new Question("Wozu dient Virtualisierung?",antwort2, "Parallele Nutzung verschiedener Betriebssysteme" );
		question.add(q2);
		
		String[] antwort3 = {"Typ A", "Typ B", "Typ 1", "Typ 2"};
		Question q3 = new Question("Welchen Hypervisortyp nennt man auch Bare Metal?",antwort3, "Typ 1" );
		question.add(q3);
		
		String[] antwort4 = {"Host-only Netzwerk", "NAT-Netzwerk", "Netzwerkbrücke", "NAT"};
		Question q4 = new Question("Welche Netzwerkeinstellung ist standardmäßig eingestellt?",antwort4, "NAT" );
		question.add(q4);
		
		String[] antwort5 = {"Gemeinsame Zwischenablage", "WebCam", "Drag'n'Drop", "Gemeinsamer Ordner"};
		Question q5 = new Question("Was ist KEIN Teil der Gasterweiterung?",antwort5, "WebCam" );
		question.add(q5);
					
		return question;
	}
	
	private static int stelleRandomFrage(int[] antwortPool) {
		int rI = r.nextInt(5);
		boolean nochVorhanden = false;
		for (int aP : antwortPool) {
			if (rI == aP) {
				antwortPool[aP]= 7;
				nochVorhanden = true;
				break;
			}
			else {
				continue; 
			}
		}
		if (nochVorhanden == false)
			rI=stelleRandomFrage(antwortPool);
		return rI;
	}
	
	private static void quizBeenden() {
		System.out.println("Das Quiz wird beendet!");
		System.exit(0);
	}

	private static void falscheEingabe() {
		
		System.out.println("Falsche Eingabe");
		createMenue();
	}
	
}

import java.util.Scanner;


public class StudentProject {
	public static Scanner sc = new Scanner(System.in);
	public static StudentDatabase studierendenbase = new StudentDatabase(10);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createMenue();
	}
	
	public static void createMenue() {
		System.out.println("Menü");
		System.out.println("----------------");
		System.out.println("(E)rstelle neuen Student");
		System.out.println("(L)ösche Student");
		System.out.println("(D)rucke die Studierendenliste");
		System.out.println("(Z)ähle die Studierenden");
		System.out.println("(A)ltersdurchschnitt");
		System.out.println("(N)otendurchschnitt");
		
		String Eingabe = sc.next(); 
		
		if (Eingabe.equals("e") || Eingabe.equals("E")) {
			System.out.println("Gib einen Nachnamen ein");
			String nachname = sc.next();
			System.out.println("Gib einen Vornamen ein");
			String vorname = sc.next();
			System.out.println("Gib eine MatrikelNr ein");
			int matrikelNr = sc.nextInt();
			System.out.println("Gib ein Alter ein");
			int alter = sc.nextInt();
			System.out.println("Gib eine Note ein");
			double note = sc.nextDouble();
			studierendenbase.addStudent(nachname, vorname, matrikelNr, alter, note);
			createMenue();
		}
		else if (Eingabe.equals("l") || Eingabe.equals("L")) {
			System.out.println("Gib eine MatrikelNr ein");
			studierendenbase.deleteStudent(sc.nextInt());
			createMenue();
		}
		else if (Eingabe.equals("d") || Eingabe.equals("D")) {
			studierendenbase.printMe();
			createMenue();
		}
		else if (Eingabe.equals("z") || Eingabe.equals("Z")) {
			System.out.println("Die Anzahl der Studierenden ist " + studierendenbase.numberOfStudents());
			createMenue();
		}
		else if (Eingabe.equals("a") || Eingabe.equals("A")) {
			System.out.println("Der Altersdurchschnitt der Studierenden ist " + studierendenbase.averageAge());
			createMenue();
		}
		else if (Eingabe.equals("n") || Eingabe.equals("N")) {
			System.out.println("Der Notendurchschnitt der Studierenden ist " + studierendenbase.averageGrade());
			createMenue();
		}
		else 
			falscheEingabe();	
	}
	
	private static void falscheEingabe() {
		System.out.println("Falsche Eingabe");
		createMenue();
	}
}

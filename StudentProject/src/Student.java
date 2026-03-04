
public class Student {
	private String nachname, vorname;
	private int matrikelNr, alter;
	private double note;
	
	
	public Student() {
	}
	
	public Student(String nachname, String vorname, int matrikelNr, int alter, double note) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.matrikelNr = matrikelNr;
		this.alter = alter;
		this.note = note;
	}
	
	public void setNachname (String nachname) {
		this.nachname = nachname;
	}
	
	public String getNachname () {
		return nachname;
	}
	
	public void setVorname (String vorname) {
		this.vorname = vorname;
	}
	
	public String getVorname () {
		return vorname;
	}
	
	public void setMatrikelNr (int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
	
	public int getMatrikelNr () {
		return matrikelNr;
	}
	
	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String toString() {
		return "Nachname: " + nachname 
				+ "\nVorname: " + vorname 
				+ "\nMatrikelNr: " + Integer.toString(matrikelNr)
				+ "\nAlter: " + Integer.toString(alter)
				+ "\nNote: " + Double.toString(note)
				+ "\n\n";
	}
	
	public void printMe() {
		System.out.println("Nachname: " + nachname 
							+ "\nVorname: " + vorname 
							+ "\nMatrikelNr: " + Integer.toString(matrikelNr) 
							+ "\nAlter: " + Integer.toString(alter)
							+ "\nNote: " + Double.toString(note)
							+ "\n\n");
	}
	
	
}

import java.util.ArrayList;

public class StudentDatabase {
	private ArrayList<Student> studierende;
	
	public ArrayList<Student> getStudierende() {
		return studierende;
	}

	public void setStudierende(ArrayList<Student> studierende) {
		this.studierende = studierende;
	}

	public StudentDatabase() {
		
	}
	
	public StudentDatabase(int anzahl) {
		int matrikelCount = 10001;
		double notenwert = 1;
		ArrayList<Student> studierende = new ArrayList<Student>();
		for (int i = 0; i < anzahl; i++) {
			Student studi = new Student();
			studi.setNachname("Nachname" + Integer.toString(i+1));
			studi.setVorname("Vorname" + Integer.toString(i+1));
			studi.setMatrikelNr(matrikelCount);
			studi.setAlter(18+i);
			studi.setNote(1 + (notenwert/10));
			studierende.add(studi);
			matrikelCount++;
			notenwert++;
		}
		this.studierende = studierende; 
	}
	
	
	public void printMe() {
		for (int i = 0 ; i < studierende.size(); i++) {
			studierende.get(i).printMe();
		}
	}
	
	public void addStudent(String nachname, String vorname, int matrikelNr, int alter, double note) {
		Student newStudi = new Student();
		newStudi.setNachname(nachname);
		newStudi.setVorname(vorname);
		newStudi.setMatrikelNr(matrikelNr);
		newStudi.setAlter(alter);
		newStudi.setNote(note);
		this.studierende.add(newStudi);
	}
	
	public void deleteStudent(int matrikelNr) {
		for (int i = 0; i < this.studierende.size(); i++) {
			if (this.studierende.get(i).getMatrikelNr() == matrikelNr)
				this.studierende.remove(i);
		}
	}
	
	public int numberOfStudents() {
		return studierende.size();
	}
	
	public double averageAge() {
		double durchschnitt = 0.0;
		for (int i = 0; i < studierende.size(); i++) {
			durchschnitt += studierende.get(i).getAlter();
		}
		return durchschnitt / studierende.size();
	}	
	
	public double averageGrade() {
		double durchschnitt = 0.0;
		for (int i = 0; i < studierende.size(); i++) {
			durchschnitt += studierende.get(i).getNote();
			System.out.println(durchschnitt);
		}
		return durchschnitt / studierende.size();
	}
}

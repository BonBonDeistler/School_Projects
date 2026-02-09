import java.util.Calendar;

public class Patient {

	int pID;
	String name, vorname, versNr, kk;
	Calendar gebDatum;
	
	void setPID(int pID) {
		if (pID > 0)
			this.pID = pID;
		else 
			System.out.println("Fehler");
	}

	int getPID() {
		return pID; 
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName () {
		return name;
	}
	
	void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	String getVorname () {
		return vorname;
	}
	
	void setVersNr(String versNr) {
		this.versNr = versNr;
	}
	
	String getVersNr () {
		return versNr;
	}
	
	void setKk (String kk) {
		this.kk = kk;
	}
	
	String getKk () {
		return kk;
	}
	
	void setGebDatum (Calendar gebDatum) {
		this.gebDatum = gebDatum;
	}
	
	Calendar getGebDatum() {
		return gebDatum;
	}
	
	
	
	
}


public class Pizza {

	String marke, sorte;
	int pID, durchmesser;
	double preis;
	boolean scharf;
	
	void setMarke (String marke) {
		this.marke = marke;
	}
	
	String getMarke () {
		return marke;
	}
	
	void setSorte (String sorte) {
		this.sorte = sorte;
	}
	
	String getSorte () {
		return sorte;
	}
	
	void setPID(int pID) {
		this.pID = pID;
	}
	
	int getPID() {
		return pID; 
	}
	
	void setDurchmesser (int durchmesser) {
		this.durchmesser = durchmesser;
	}
	
	int getDurchmesser () {
		return durchmesser;
	}
	
	void setPreis (double preis) {
		this.preis = preis;
	}
	
	double getPreis () {
		return preis;
	}
	
	void setScharf (boolean scharf) {
		this.scharf = scharf;
	}
	
	boolean getScharf () {
		return scharf;
	}
}


public class Chips {

	String marke, sorte;
	int cID;
	double preis;
	boolean scharf, geriffelt;
	
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
	
	void setCID (int cID) {
		this.cID = cID;
	}
	
	int getCID () {
		return cID;
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
	
	void setGeriffelt (boolean geriffelt) {
		this.geriffelt = geriffelt;
	}
	
	boolean getGeriffelt () {
		return geriffelt;
	}
}

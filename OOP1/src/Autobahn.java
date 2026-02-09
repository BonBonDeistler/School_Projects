
public class Autobahn {

	String bezeichnung, startPunkt, endPunkt;
	int aID, laenge, breite, maxGeschwindigkeit; 
	boolean raststaette;
	
	void setBezeichnung (String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	String getBezeichnung () {
		return bezeichnung;
	}
	
	void setStartPunkt (String startPunkt) {
		this.startPunkt = startPunkt;
	}
	
	String getStartPunkt () {
		return startPunkt;
	}
	
	void setEndPunkt (String endPunkt) {
		this.endPunkt = endPunkt;
	}
	
	String getEndPunkt () {
		return endPunkt;
	}
	
	void setAID (int aID) {
		this.aID = aID;
	}
	
	int getAID () {
		return aID;
	}
	
	void setLaenge (int laenge) {
		this.laenge = laenge;
	}
	
	int getLaenge () {
		return laenge;
		
	}void setBreite (int breite) {
		this.breite = breite;
	}
	
	int getBreite () {
		return breite;
		
	}void setMaxGeschwindigkeit (int maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}
	
	int getMaxGeschwindigkeit () {
		return maxGeschwindigkeit;
	}
	
	void setRaststaette (boolean raststaette) {
		this.raststaette = raststaette;
	}
	
	boolean setRaststaette () {
		return raststaette;
	}
	
}

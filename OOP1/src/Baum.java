import java.util.Calendar;

public class Baum {

	int bID;
	String art, standort, frucht;
	Calendar einpflanzung;
	

	void setBID (int bID) {
		this.bID = bID;
	}
	
	int getBID () {
		return bID;
	}

	void setArt (String art) {
		this.art = art;
	}
	
	String getArt () {
		return art;
	}
	
	void setStandort (String standort) {
		this.standort = standort;
	}
	
	String getStandort() {
		return standort;
	}
	
	void setFrucht (String frucht) {
		this.frucht = frucht;
	}
	
	String getFrucht () {
		return frucht;
	}
	
	void setEinpflanzung (Calendar einpflanzung) {
		this.einpflanzung = einpflanzung;
	}
	
	Calendar getEinpflanzung () {
		return einpflanzung;
	}
	
}

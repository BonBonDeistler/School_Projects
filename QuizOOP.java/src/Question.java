
public class Question {
	private String frage, richtig;
	private String[] antwort = new String[4];
	
	public Question() {
	
	}
	
	public Question(String frage, String[] antwort, String richtig) {
		this.frage = frage;
		this.antwort = antwort;
		this.richtig = richtig;
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage) {
		this.frage = frage;
	}

	public String getRichtig() {
		return richtig;
	}

	public void setRichtig(String richtig) {
		this.richtig = richtig;
	}

	public String[] getAntwort() {
		return antwort;
	}

	public void setAntwort(String[] antwort) {
		this.antwort = antwort;
	}
	

}

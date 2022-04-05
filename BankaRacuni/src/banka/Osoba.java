package banka;

public class Osoba {
	
	private String ime;
	private String prezime;
	private String JMBG;
	
	
	public Osoba() {
		this.ime = "";
		this.prezime = "";
		this.JMBG = "";
	}


	public Osoba(String ime, String prezime, String JMBG) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
	}
	
	public Osoba(Osoba kopija) {
		this.ime = kopija.ime;
		this.prezime = kopija.prezime;
		this.JMBG = kopija.JMBG;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getJMBG() {
		return JMBG;
	}


	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}
	
	

}

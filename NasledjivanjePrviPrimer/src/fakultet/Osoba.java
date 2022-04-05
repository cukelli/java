package fakultet;

public class Osoba {
	
	private String ime;
	private String prezime;
	private String JMBG;
	private String adresa;
	private String brojTelefona;
	
	public Osoba() {
		
		this.ime = "";
		this.prezime = "";
		this.JMBG = "";
		this.adresa = "";
		this.brojTelefona = "";
	}
	
	
	
	
	public Osoba(String ime, String prezime, String JMBG, String adresa, String brojTelefona) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
		this.adresa = adresa;
		this.brojTelefona = brojTelefona;
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




	public void setJMBG(String JMBG) {
		this.JMBG = JMBG;
	}




	public String getAdresa() {
		return adresa;
	}




	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}




	public String getBrojTelefona() {
		return brojTelefona;
	}




	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	
	
	@Override 
	public String toString() {
		return "Osoba " + this.ime + " se preziva " + this.prezime + " i ima JMBG " + this.JMBG + " na adresi " + this.adresa + " sa brojem telefona " + this.brojTelefona;
	}


}

package fakultet;

public class Profesor extends Zaposleni {
	
	private int brojPredavanja;
	
	
	public Profesor() {
		this.brojPredavanja = 0;
	}


	public Profesor(String ime, String prezime, String JMBG, String adresa, String brojTelefona, double plata,int brojPredavanja) {
		super(ime, prezime, JMBG, adresa, brojTelefona, plata);
		this.brojPredavanja = brojPredavanja;
		
	}


	public int getBrojPredavanja() {
		return brojPredavanja;
	}


	public void setBrojPredavanja(int brojPredavanja) {
		this.brojPredavanja = brojPredavanja;
	}
	
	@Override 
	
	public String toString() {
		return "Ime: " + this.getIme() + " prezime: " + this.getPrezime() + " broj predavanja: " + this.brojPredavanja;
	}
	
	
	
	

}

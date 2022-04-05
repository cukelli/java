package fakultet;

public class Zaposleni extends Osoba {
	
	private double plata;
	
	
	public Zaposleni() {
		this.plata = 0.0;
	}


	public Zaposleni(String ime, String prezime,String JMBG, String adresa, String brojTelefona,double plata) {
		super(ime, prezime, JMBG, adresa, brojTelefona);
		this.plata = plata;
	}


	public double getPlata() {
		return plata;
	}


	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	@Override 
	public String toString() {
		return "Ime: " + this.getIme() + " prezime: " + this.getPrezime() + " Adresa: " + this.getAdresa() + " JMBG: " + this.getJMBG() + " broj Telefona: " + this.getBrojTelefona() + " plata: " + this.plata;
			
	}
   
	

}

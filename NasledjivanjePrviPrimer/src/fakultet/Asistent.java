package fakultet;

public class Asistent extends Zaposleni {
	
	private int brojVezbi;
	private Profesor mentor;
	
	
	public Asistent() {
		this.brojVezbi = 0;
		this.mentor = null;
	}


	public Asistent(String ime, String prezime, String JMBG, String adresa, String brojTelefona, double plata,int brojVezbi,Profesor mentor) {
		super(ime, prezime, JMBG, adresa, brojTelefona, plata);
		this.brojVezbi = brojVezbi;
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "Ime: " + this.getIme() + "\n" + " broj vezbi: " +  this.brojVezbi + "\n" + "mentor: " + this.mentor.getIme();
	}
	
	
	
}

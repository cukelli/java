package StudentPaket;

public class Fakultet {
	
	String naziv;
	String adresa;
	Student[] studenti = new Student[] {};
	Predmet[] predmeti = new Predmet[] {};
	Ocena[] ocene = new Ocena[] {};
	
	
	
	public Fakultet() {
		this.naziv = "";
		this.adresa = "";
		this.studenti = new Student[] {};
		this.ocene = new Ocena[] {};
		this.predmeti = new Predmet[] {};
		
	}
	
	public Fakultet(String naziv, String adresa, Student[] studenti, Predmet[] predmeti, Ocena[] ocene) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.studenti = studenti;
		this.predmeti = predmeti;
		this.ocene = ocene;
	}
	
	public Fakultet(Fakultet kopija) {
		this.naziv = kopija.naziv;
		this.adresa = kopija.adresa;
		this.studenti = kopija.studenti;
		this.predmeti = kopija.predmeti;
		this.ocene = kopija.ocene;
		
	}
	
}

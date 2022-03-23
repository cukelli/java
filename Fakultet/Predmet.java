package StudentPaket;

public class Predmet {
	String sifraPredmeta;
	String nazivPredmeta;
	String profesor;
	
	int semestar;
	
	
	public Predmet() {
		this.sifraPredmeta = " ";
		this.nazivPredmeta = " ";
		this.profesor = " ";
		this.semestar = 0;
		
	}
	
	public Predmet(String sifraPredmeta,String nazivPredmeta,String profesor,int semestar) {
		this.sifraPredmeta = sifraPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.profesor = profesor;
		this.semestar = 0;
	}
	
	public Predmet(Predmet kopija) {
		this.sifraPredmeta = kopija.sifraPredmeta;
		this.nazivPredmeta = kopija.nazivPredmeta;
		this.profesor = kopija.profesor;
		this.semestar = kopija.semestar;
		
	}
	

}

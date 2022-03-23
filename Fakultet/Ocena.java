package StudentPaket;

public class Ocena {
	
	Student student;
	Predmet predmet;
	int ocena;
	
	public Ocena() {
		this.student = student;
		this.predmet = predmet;
	    this.ocena = 0;
		
	}

	public Ocena(Student student, Predmet predmet, int ocena) {
		super();
		this.student = student;
		this.predmet = predmet;
		this.ocena = ocena;
	}
	
	
	public Ocena(Ocena kopija) {
		this.student = kopija.student;
		this.predmet = kopija.predmet;
		this.ocena = kopija.ocena;
	}

	

	

	



	

	
	
	
	
	
	
	


}
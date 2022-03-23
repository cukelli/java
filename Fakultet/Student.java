package StudentPaket;

public class Student {
	
	String indeks;
	String imeIPrezime;
	int godinaUpisa;
	int[] ocene;
	
	
	
	public Student() {
		this.indeks = "";
		this.imeIPrezime = "";
		this.godinaUpisa = 0;
		this.ocene = new int[]{};
	}
	
	public Student(String indeks, String imeIPrezime, int godinaUpisa, int[] ocene) {
	
		this.indeks = indeks;
		this.imeIPrezime = imeIPrezime;
		this.godinaUpisa = godinaUpisa;
		this.ocene = ocene;
	}

	public Student(Student kopija) {
		this.indeks = kopija.indeks;
		this.imeIPrezime = kopija.imeIPrezime;
		this.godinaUpisa = kopija.godinaUpisa;
		this.ocene = new int[kopija.ocene.length];
		
		for (int i=0; i<this.ocene.length; i++) {
			this.ocene[i]=kopija.ocene[i];
		}
	}
	
	
}

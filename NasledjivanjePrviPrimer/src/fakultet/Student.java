package fakultet;

import java.util.Arrays;

public class Student extends Osoba {
	private String brojIndeksa;
	private int[] ocene;
	
	public Student() {
		super();
		this.brojIndeksa = "";
		this.ocene = new int[] {};
	}
	public Student(String ime, String prezime, String JMBG, String adresa, String brojTelefona,String brojIndeksa,int[] ocene) {
		super(ime, prezime, JMBG, adresa, brojTelefona);
		this.brojIndeksa = brojIndeksa;
		this.ocene = ocene;
		
	}
	@Override
	public String toString() {
		return "Ime: " + this.getIme() + "br indeksa: " + this.brojIndeksa + " ocene: " + Arrays.toString(this.ocene);
	}
	
  
}

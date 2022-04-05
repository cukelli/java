package banka;

public abstract class Racun {
	private Osoba vlasnikRacuna;
	private double stanje;
	
	
	public Racun() {
		this.vlasnikRacuna = null;
		this.stanje = 0.0;
	}
	
	public Racun(Osoba vlasnikRacuna,double stanje) {
		this.vlasnikRacuna = vlasnikRacuna;
		this.stanje = stanje;
	}
	
	
	public Osoba getVlasnikRacuna() {
		return vlasnikRacuna;
	}

	public void setVlasnikRacuna(Osoba vlasnikRacuna) {
		this.vlasnikRacuna = vlasnikRacuna;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	public abstract boolean isplata(double suma);
	public abstract void uplata(double suma);

}

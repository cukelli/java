package banka;

public class TekuciRacun extends Racun {
	private double mesecnaNaknada;
	
	
	public TekuciRacun() {
		super();
		this.mesecnaNaknada = 0.0;
	}
	

	public TekuciRacun(Osoba vlasnikRacuna,double stanje,double mesecnaNaknada) {
		super(vlasnikRacuna,stanje);
		this.mesecnaNaknada = mesecnaNaknada;
	}
	
	public TekuciRacun(TekuciRacun kopija) {
		this.mesecnaNaknada = kopija.mesecnaNaknada;
	}



	@Override
	public boolean isplata(double suma) {
		if (this.getStanje() < suma)
		return false;
		
		double stanje = this.getStanje();
		this.setStanje(stanje - suma);
		return true;
	}

	@Override
	public void uplata(double suma) {
		double stanje = this.getStanje();
	this.setStanje(stanje + suma - (suma * 0.0001));

	
		

	}
	
	
	public void obracunajMesecnuNaknadu(double mesecnaNaknada) {
		double stanje = this.getStanje();
		this.setStanje(stanje - mesecnaNaknada);
		
	}

}

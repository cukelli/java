package banka;

public class RacunStednje extends Racun {
	private boolean pokrenutaStednja;
	private double godisnjiKoeficijentStednje;
	
	
	
	
	public RacunStednje() {
		super();
		this.pokrenutaStednja = false;
		this.godisnjiKoeficijentStednje = 0.0;
		
	}
	
	

	public RacunStednje(Osoba vlasnikRacuna, double stanje,boolean pokrenutaStednja,double godisnjiKoeficijentStednje) {
		super(vlasnikRacuna, stanje);
		this.pokrenutaStednja = pokrenutaStednja;
		this.godisnjiKoeficijentStednje = godisnjiKoeficijentStednje;
	}
	
	public RacunStednje(RacunStednje kopija) {
		super();
		this.pokrenutaStednja = kopija.pokrenutaStednja;
		this.godisnjiKoeficijentStednje = kopija.godisnjiKoeficijentStednje;
	}

	public boolean isPokrenutaStednja() {
		return pokrenutaStednja;
	}



	public void setPokrenutaStednja(boolean pokrenutaStednja) {
		this.pokrenutaStednja = pokrenutaStednja;
	}



	public double getGodisnjiKoeficijentStednje() {
		return godisnjiKoeficijentStednje;
	}



	public void setGodisnjiKoeficijentStednje(double godisnjiKoeficijentStednje) {
		this.godisnjiKoeficijentStednje = godisnjiKoeficijentStednje;
	}



	@Override
	public boolean isplata(double suma) {
		if (this.getStanje() < suma || pokrenutaStednja)
		return false;
		
	   double stanje = this.getStanje();
	   this.setStanje(stanje - suma);
	   return true;
	   
	}

	@Override
	public void uplata(double suma) {
		double stanje = this.getStanje();
		this.setStanje(stanje - suma);

	}
	
	public void pokreniStednju(boolean pokrenutaStednja) {
		this.pokrenutaStednja = true;
		
		
	}
	
	public void obustaviStednju(int meseci) {
		double stanje = this.getStanje();
		this.setStanje(stanje + stanje * (godisnjiKoeficijentStednje * 0.01 * meseci / 12)
				+ stanje * (godisnjiKoeficijentStednje * 0.01 * ((meseci % 12) / 12)));
		
	}

}

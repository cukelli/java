package objektno.geometrija;

public class Krug {
	

	Tacka centar = new Tacka();
     double poluprecnik;
	
	
	
	public Krug() {
	     this.centar.prva = 0;
	     this.centar.druga = 0;
		this.poluprecnik = 0;
	}
	
	public Krug(double prva,double druga,double poluprecnik) {
		this.centar.prva = (double) prva;
		this.centar.druga = (double) druga;
		this.poluprecnik =poluprecnik;
	}
	
	
	public static double racunajPovrsinu(double poluprecnik) {
		double povrsina;
		povrsina = (poluprecnik * poluprecnik * Math.PI);
		return povrsina;
	}
	
	public double Obim(double poluprecnik) {
		double obim;
		obim = (float) (2 * poluprecnik * Math.PI);
		return obim;
	}
	
	public boolean tackaPripadaKrugu(Tacka tacka) {
		double	udaljenost =  Math.sqrt((tacka.prva - centar.prva) * (tacka.prva - centar.prva) + (tacka.druga - centar.druga) * (tacka.druga - centar.druga));
		if (udaljenost > this.poluprecnik) {
			return false;	
		}
		else {
			return true;
		
		}
		
		
	}
	
	

}

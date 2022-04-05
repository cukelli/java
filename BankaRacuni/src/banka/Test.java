package banka;

public class Test {

	public static void main(String[] args) {
		Osoba Anastasija = new Osoba("Anastasija","Cukelj","0102002735021");
		
		TekuciRacun AnastasijinRacun = new TekuciRacun(Anastasija,25000.00,150.15);
		RacunStednje Stednja = new RacunStednje(Anastasija,500,false,0.1);
		
         //TEST//
		
		System.out.println(AnastasijinRacun.getStanje());
		System.out.println(AnastasijinRacun.isplata(500));
		System.out.println(AnastasijinRacun.getStanje());
		AnastasijinRacun.uplata(1200);
		System.out.println(AnastasijinRacun.getStanje());
		
		
		System.out.println("Stedni: ");
		System.out.println(Stednja.getStanje());
		Stednja.isplata(200);
		System.out.println(Stednja.getStanje());
		Stednja.uplata(100);
		System.out.println(Stednja.getStanje());
		Stednja.pokreniStednju(true);
		System.out.println(Stednja.getStanje());
		System.out.println("Nakon pokretanja stednje,ne sme se menjati stanje");
		Stednja.isplata(100);
		System.out.println(Stednja.getStanje());
		
		
		

	}

}

package objektno.geometrija;

public class GeometrijaTest {

	public static void main(String[] args) {
     Krug prviKrug = new Krug(10.0,5.4,45);
     Krug drugiKrug = new Krug(0.2,15.0,7.0);
     Tacka prvaTacka = new Tacka(2.0,4.0);
     Tacka drugaTacka = new Tacka(6.0,10.0);
     System.out.println(prviKrug.tackaPripadaKrugu(prvaTacka));
     System.out.println(prviKrug.tackaPripadaKrugu(drugaTacka));
     System.out.println(drugiKrug.tackaPripadaKrugu(prvaTacka));
     System.out.println(drugiKrug.tackaPripadaKrugu(drugaTacka));
     
     
     System.out.println("Poluprecnik prvog kruga je " + prviKrug.poluprecnik);
     System.out.println("Poluprecnik drugog kruga je " + drugiKrug.poluprecnik);
     System.out.println("Centar drugog kruga: " + drugiKrug.centar.prva + " " + drugiKrug.centar.druga);
     
     System.out.println("Koordinate prve tacke: " + prvaTacka.prva + " " + prvaTacka.druga);
     System.out.println("Koordinate druge tacke " + drugaTacka.prva + " " + drugaTacka.druga);
     

     
	}

}

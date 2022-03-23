package StudentPaket;

import java.util.Arrays;

public class FakultetMain {

	public static void main(String[] args) {
     Student Marko = new Student("RS 1/2016","Marko Markovic",2021,new int[] {10,9,8,7});
     Student Vesna = new Student("RS 2/2016","Vesna Simic",2021,new int[] {10,9,9,10});
     Student Jelena = new Student("RS 3/2016","Jelena Markovic",2021,new int[] {7,9,8,8});
     Student MarkoDrugi = new Student("RS 4/2016","Marko Simic",2021,new int[] {9,9,8,6});
     
     Predmet telekomunikacije = new Predmet("P2","Telekomunikacije","Nikola Tesla",1);
     Predmet UvodUPsihoanalizu = new Predmet("P3","Uvod u psihoanalizu","Slavoj Zizek",1);
     Predmet OsnovaKosarke = new Predmet("P1","Osnove kosarke","Magic Johnson",1);
     Predmet PrimenjenaMatematika = new Predmet("P4","Primenjena matematika","Gabrijela Grujic",1);
     
     
     Ocena ocenaMarko = new Ocena(Marko,telekomunikacije,8);
     
     System.out.println("-------------------------------------------");
     System.out.println("Fakultet tehnickih Nauka");
     System.out.println("Trg Dositeja Obradovica 6,Novi Sad");
     System.out.println("-------------------------------------------");
     
     
     System.out.println("Studenti na fakultetu:");
     System.out.println(Marko.indeks + " " + Marko.imeIPrezime);
     System.out.println(Vesna.indeks + " " + Vesna.imeIPrezime);
     System.out.println(Jelena.indeks + " " + Jelena.imeIPrezime);
     System.out.println(MarkoDrugi.indeks + " " + MarkoDrugi.imeIPrezime);

     
   System.out.println("Predmeti na fakultetu: ");
   System.out.println(telekomunikacije.sifraPredmeta + " " + telekomunikacije.nazivPredmeta + "(" + telekomunikacije.profesor + ")" );
   System.out.println(UvodUPsihoanalizu.sifraPredmeta + " " + UvodUPsihoanalizu.nazivPredmeta + "(" + UvodUPsihoanalizu.profesor + ")");
   System.out.println(OsnovaKosarke.sifraPredmeta + " " + OsnovaKosarke.nazivPredmeta + "(" + OsnovaKosarke.profesor + ")" );
   System.out.println(PrimenjenaMatematika.sifraPredmeta + " " + PrimenjenaMatematika.nazivPredmeta + "(" + PrimenjenaMatematika.profesor + ")" );
   
   
   
   System.out.println("Student " + Marko.imeIPrezime + " iz predmeta " + telekomunikacije.nazivPredmeta + " ima ocenu " +  ocenaMarko.ocena);

   





     
 	}

}

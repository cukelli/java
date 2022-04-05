package fakultet;

public class Main {

	public static void main(String[] args) {
		
		Osoba osobaJedan = new Osoba("Anastasija","Cukelj","0102002735021","4.JULA 25","06033000964");
		System.out.println(osobaJedan);
		
		Zaposleni zaposleniJedan = new Zaposleni("Sinisa","Nikolic","20123123","Gogoljevs 13","06312141",21500.0);
		
       System.out.println(zaposleniJedan);
       
       Profesor prviProfesor = new Profesor("Mitar","Mitric","123123","Topolska 12","5553333",50000.0,5);
       
       Asistent prviAsistent = new Asistent("Marko","Markovic","123123","Cara Dusana 3","0532123",32000.0,4,prviProfesor);
       System.out.println(prviAsistent);
       
       Student prviStudent = new Student("Pera","Peric","67832112","Topolska 15","12132213","SR12",new int[] {7,10,6,8});
       System.out.println(prviStudent);
	}

}

package korisnici;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;



public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Korisnik> korisnici = new ArrayList<Korisnik>();
		korisnici = ucitaj(korisnici);
		

}

	public static ArrayList<Korisnik> ucitaj (ArrayList<Korisnik> korisnici) throws IOException {
		File file = new File("src/korisnici/korisnici.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			
			try {
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
					String[] lineSplit = line.split(";");
					String ime = lineSplit[0];
					String prezime = lineSplit[1];
					String JMBG = lineSplit[2];
					String korIme = lineSplit[3];
					String sifra = lineSplit[4];
					
					Korisnik korisnik = new Korisnik(ime,prezime,JMBG,korIme,sifra);
					korisnici.add(korisnik);
				
				}
				
				for (int i=0;i<korisnici.size(); i++) {
					Korisnik el = korisnici.get(i);
					System.out.println(el);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return korisnici;
		
		}
	}

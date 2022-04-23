package korisnici;

public class Korisnik {
	private String name;
	private String lastName;
	private String JMBG;
	private String username;
	private String password;
	
	public Korisnik(String name,String lastName,String JMBG,String username,String password) {
		this.name = name;
		this.lastName = lastName;
		this.JMBG = JMBG;
		this.username = username;
		this.password = password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override 
	public String toString() {
		return "Korisnik [ime=" + name + ", prezime=" + lastName + " jmbg," + JMBG + " kor.ime " + username + " sifra" + password;
	}
	

}

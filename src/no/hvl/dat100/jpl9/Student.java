package no.hvl.dat100.jpl9;

public class Student extends Person {
	
	//Objektvariable
	private int studentnummer;
	private String klasse;

	// Standard konstruktør
	public Student() {
		super();
		this.studentnummer = 0;
		this.klasse = "";
		
	}
	// Konstruktør med fem objektvariable
	public Student(String etternamn, String fornamn, long fodselsnummer, int studentnummer, String klasse) {
		// TODO
		super(etternamn, fornamn, fodselsnummer);
		this.studentnummer = studentnummer;
		this.klasse = klasse;
		
		if (klasse == "" && studentnummer == 0) {
		throw new RuntimeException("not implemented");
		}
	}

	// get-set metoder
	public int getStudentnummer() {
		// TODO
		if (studentnummer == 0) {
		throw new RuntimeException("not implemented");
		}
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		// TODO
		if (studentnummer == 0) {
			throw new RuntimeException("not implemented");
			}
		this.studentnummer = studentnummer;
	}

	public String getKlasse() {
		// TODO
		if (klasse == "") {
			throw new RuntimeException("not implemented");
			}
			return klasse;
	}

	public void setKlasse(String klasse) {
		// TODO
		this.klasse = klasse;
	}

	// toString metode
	@Override
	public String toString() {
		// TODO
		
		if (klasse == "" && studentnummer == 0) {
		throw new RuntimeException("not implemented");
		}
		return "STUDENT"+"\n"+fodselsnummer+"\n"+etternamn+"\n"+fornamn+"\n"+studentnummer+"\n"+klasse+"\n";
		

	}

}

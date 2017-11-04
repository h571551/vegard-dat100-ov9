package no.hvl.dat100.jpl9;

public abstract class Person {
	
	// Lager objektvariable som kan sees av subklasser av Person
	protected long fodselsnummer;
	protected String etternamn;
	protected String fornamn;

	//Standard konstruktør
	public Person() {
	this.fodselsnummer = 0;
	this.etternamn = "";
	this.fornamn = "";
	}

	//Konstruktør som kan gi verdi til objektvariablene
	public Person(String etternamn, String fornamn, long fodselsnummer) {
	this.etternamn = etternamn;
	this.fornamn = fornamn;
	this.fodselsnummer = fodselsnummer;
	}

	// get-set metoder
	public String getEtternamn() {
		// TODO
		if (etternamn == "") { 
		throw new RuntimeException("not implemented");
	}
		return etternamn;
	}
	
	public void setEtternamn(String etternamn) {
		// TODO
		if (etternamn == "") { 
			throw new RuntimeException("not implemented");
		}
		this.etternamn = etternamn;
	}

	public String getFornamn() {
		// TODO
		if (fornamn == "") { 
			throw new RuntimeException("not implemented");
		}
		return fornamn;
	}

	public void setFornamn(String fornamn) {
		// TODO
		if (fornamn == "") { 
			throw new RuntimeException("not implemented");
		}
		this.fornamn = fornamn;
	}

	public void setFodselsnummer(long fodselsnummer) {
		// TODO
		if (fodselsnummer == 0) { 
			throw new RuntimeException("not implemented");
		}
		this.fodselsnummer = fodselsnummer;
	}

	public long getFodselsnummer() {
		// TODO
		if (fodselsnummer == 0) { 
			throw new RuntimeException("not implemented");
		}
		return fodselsnummer;
	}

	// edited
	public boolean erLik(Person person) {
		// Implementerer
		if (person.fodselsnummer == this.fodselsnummer) {
			return true;
		}
		// beholder denne foreløpig. Riktig å ha den der når input er mangelfull
		return false;
	}
	
	// edited
	public boolean erKvinne() {
		// TODO
		String a = String.valueOf(this.fodselsnummer);
		char b = ' ';
		if (a.length() == 11 || a.length() == 12) {
		b = a.charAt(8);
			if (b%2 == 0) {
				return true;
			}
		}
		return false;
	}
	
	// edited
	public boolean erMann() {
		// TODO
		String a = String.valueOf(this.fodselsnummer);
		char b = ' ';
		if (a.length() == 11) {
		b = a.charAt(8);
			if (b%2 != 0) {
				return true;
			}
		}
		return false;
	}

	// edited
	@Override
	public String toString() {
		// 
		if (this.fodselsnummer != 0) {
		return fodselsnummer + "\n" + etternamn + "\n" + fornamn + "\n";
		}
		throw new RuntimeException("not implemented");
	}
}

package no.hvl.dat100.jpl9;

public class Laerer extends Person {
	
	//objektvariable
	private int maanedslonn;
	private int kontonummer;

	// Standard konstruktør
	public Laerer() {
		super();
		this.maanedslonn = 0;
		this.kontonummer = 0;
	}

	// konstruktør med objektvariabel-input
	public Laerer(String etternamn, String fornamn, long fodselsnummer, int maanedslonn, int kontonummer) {
		// TODO
		super(etternamn, fornamn, fodselsnummer);
		this.maanedslonn = maanedslonn;
		this.kontonummer = kontonummer;
		if (this.maanedslonn == 0 && this.kontonummer == 0) {
		throw new RuntimeException("not implemented");
	}
	}

		// get-set metoder
	public int getMaanedslonn() {
		// TODO
		if (this.maanedslonn == 0) {
		throw new RuntimeException("not implemented");
	}
		return maanedslonn;
	}

	public void setMaanedslonn(int maanedslonn) {
		// TODO
		this.maanedslonn = maanedslonn;
		
		if (this.maanedslonn == 0) {
			throw new RuntimeException("not implemented");
		}
	}

	public int getKontonummer() {
		// TODO
		if (this.kontonummer == 0) {
			throw new RuntimeException("not implemented");
		}
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		// TODO
		this.kontonummer = kontonummer;
		
		if (this.maanedslonn == 0) {
			throw new RuntimeException("not implemented");
		}
	}
	
	
	// toString
	@Override
	public String toString() {
		// TODO
		if (this.maanedslonn == 0 && this.kontonummer == 0) {
			throw new RuntimeException("not implemented");
		}
		return "LAERER"+"\n"+fodselsnummer+"\n"+etternamn+"\n"+fornamn+"\n"+maanedslonn+"\n"+kontonummer+"\n";

	}
}

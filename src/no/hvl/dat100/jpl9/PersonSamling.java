package no.hvl.dat100.jpl9;

import java.util.Arrays;

public class PersonSamling {

	//objektvariabel
	private int antall;
	private Person[] Samling;
	
	
	// standard konstruktør
	public PersonSamling() {
		// TODO
		this.antall = 0;
		this.Samling = new Person[20];
	}
	
	

	public void setAntall(int antall) {
		this.antall = antall;
	}



	public void setSamling(Person[] samling) {
		Samling = samling;
	}



	// konstruktør som angir startstørrelse på refereansetabell
	public PersonSamling(int antall) {
		// TODO
		this.antall = antall;
		this.Samling = new Person[antall];
	}

	// antall objekt som er lagret i tabellen 
	public int getAntall() {
		// TODO
		int ant = 0;
		if (Samling[0] == null) {
			return ant;
		}
		 for (int j = 0; j < Samling.length; j++) {
			 if (Samling[j] == null) {
				 return ant;
			 }
			 if (Samling[j] != null) {
				 ant = ant + 1;
			 }
			
		}
		return ant;
	}

	// returnerer referansetabellen med personer
	public Person[] getSamling() {
		// TODO
		return Samling;
	}

	
	public int finnPerson(Person p) {
		
		if (p == null) {
		throw new RuntimeException("not implemented");
		}
		// TODO
		boolean b = Samling[0].erLik(p);
		int i = 0;
		
		if (b == true) {
			while (Samling[i].getFodselsnummer() != p.getFodselsnummer()) {
				i = i + 1;
			}
			
		}
		else {
			i = -1;
		}
		return i;
		
	}

	public boolean finnes(Person p) {
		// TODO
		boolean a = false;
		for (int j = 0; j < getAntall(); j++) {
			
			
			if (Samling[j].fodselsnummer == p.fodselsnummer) {
				a = true;
				
			}	
			}
		return a;	
		}

	@Override
	public String toString() {
		return antall+"\n"+Arrays.toString(Samling);
	}

	public void utvid() {
		// TODO
		int j = getAntall();
		Person Samling2[] = new Person[Samling.length*2];
		if (j == Samling.length) {
			for (int k = 0; k < Samling.length; k++) {
			Samling2[k] = Samling[k];
			
		}
	}
		this.Samling = Samling2;
	}
	public boolean ledigPlass() {
		// TODO
		boolean b = false;
		
		
		for (int i = 0 ; i < Samling.length; i++) {
			if (Samling[i] == null) {
				b = true;
				return b;
			}
		}
		return b;
	}

	public boolean leggTil(Person p) {

		// TODO
		boolean b = false;
		
		if (finnes(p) == true) {
			b = false;
		}
		else {
			
		if (ledigPlass() == false) {
				utvid();
				Samling[getAntall()] = p;
		}
		else {
			Samling[getAntall()] = p;
				
			}
		b = true;
		}
		return b;
	}

	public boolean slett(Person p) {

		// TODO
		boolean b = false;
		if (finnes(p) == true) {
			for (int i = 0; i < Samling.length; i++) {
				if (Samling[i].fodselsnummer == p.fodselsnummer) {
					Samling[i] = null;
					b = true;
				}
				
			}
			
		}
		
		return b;
	}
}
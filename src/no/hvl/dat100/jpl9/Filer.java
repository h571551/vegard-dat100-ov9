package no.hvl.dat100.jpl9;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.util.*;

import javax.swing.JOptionPane;

public class Filer {

	private PersonSamling samling[];

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jpl9/";

	// private static String STUDENT = "STUDENT";
	// private static String LAERER = "LAERER";

	public boolean skriv(PersonSamling samling, String filnavn) {

		// TODO

		try {
			// skrive samlingen til fil

			PrintWriter skriver = new PrintWriter(MAPPE + filnavn);

			int b = samling.getAntall();

			for (int i = 0; i < b; i++) {

				skriver.print(samling.getSamling()[i]);

			}
			skriver.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
		}
		return true;
	}

	public PersonSamling les(String filnavn) {
		
		PersonSamling personer = new PersonSamling();
		
		try {
		Scanner leser = new Scanner(new File(MAPPE+filnavn));
		String type[] = new String[50];
		int i = 0;
		int j = 0;
		int s = 0;
		int l = 0;

		while (leser.hasNextLine()) {
			type[i] = (leser.nextLine());
			
			if (type[i].equals("STUDENT")) {
				
				s = s + 1;
			}
			if (type[i].equals("LAERER")) {
				l = l + 1;
			}
		i = i + 1;}

		int k = (i) / 6;
		
		personer.setAntall(k);

		for (j = 1; j <= k; j++) {

			if (type[j*6 - 6].equals("STUDENT")) {
				Student s1 = new Student();
				s1.fodselsnummer = Integer.parseInt(type[j * 6 - 5]);
				s1.etternamn = type[j * 6 - 4];
				s1.fornamn = type[j * 6 - 3];
				s1.setKlasse(type[j * 6 - 1]);
				s1.setStudentnummer(Integer.parseInt(type[j * 6 - 2]));
				
				personer.leggTil(s1);
			}
			if (type[j*6 - 6].equals("LAERER")) {
				Laerer l1 = new Laerer();
				l1.fodselsnummer = Integer.parseInt(type[j * 6 - 5]);
				l1.etternamn = type[j * 6 - 4];
				l1.fornamn = type[j * 6 - 3];
				l1.setMaanedslonn(Integer.parseInt(type[j * 6 - 2]));
				l1.setKontonummer(Integer.parseInt(type[j * 6 - 1]));
				
				personer.leggTil(l1);
			}
			

		}
		leser.close();
		return personer;
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
		}
	return personer;
	}
	
}

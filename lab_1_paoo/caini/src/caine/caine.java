package caine;

import java.util.Scanner;

public class caine {
	String m_nume;
	double m_inaltime;
	double m_greutate;
	int m_varsta;
	String m_culoare;
	Scanner keyboard = new Scanner(System.in);
	
	public caine(String nume, double inaltime, double greutate, int varsta, String culoare)
	{
		m_nume = nume;
		m_inaltime = inaltime;
		m_greutate = greutate;
		m_varsta = varsta;
		m_culoare = culoare;
	}
	
	public void citeste_valori()
	{
		String nume;
		System.out.println("Introduceti nume:");
		nume = keyboard.nextLine();
		
		m_nume = nume;
		
		double inaltime;
		System.out.println("Introduceti inaltime:");
		inaltime = keyboard.nextDouble();
		
		m_inaltime = inaltime;
		
		double greutate;
		System.out.println("Introduceti greutate:");
		greutate = keyboard.nextDouble();
		
		m_greutate = greutate;
		
		int varsta;
		System.out.println("Introduceti varsta:");
		varsta = keyboard.nextInt();
		
		m_varsta = varsta;
		
		keyboard.nextLine();
		
		String culoare;
		System.out.println("Introduceti culoare:");
		culoare = keyboard.nextLine();
		
		m_culoare = culoare;
	}
	
	public void afiseaza_valori()
	{
		System.out.println("Nume caine: " + m_nume);
		System.out.println("Inaltime caine: " + m_inaltime);
		System.out.println("Greutate caine: " + m_greutate);
		System.out.println("Varsta caine: " + m_varsta);
		System.out.println("Culoare caine: " + m_culoare);
	}

}

package caine;

//import java.util.Scanner;

public class caine_pete extends caine {
	
	int m_nr_pete;
	
	public caine_pete(String nume, double inaltime, double greutate, int varsta, String culoare, int nr_pete)
	{
		super(nume, inaltime, greutate, varsta, culoare);
		m_nr_pete = nr_pete;
	}
	
	public void citeste_valori()
	{
		super.citeste_valori();
	
		int nr_pete;
		
		System.out.println("Introduceti numarul de pete:");
		nr_pete = keyboard.nextInt();
		
		m_nr_pete = nr_pete;
	}
	
	public void afiseaza_valori()
	{
		super.afiseaza_valori();
		System.out.println("Numarul de pete:" + m_nr_pete);
	}
	
}

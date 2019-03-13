package caine;

public class caine_fara_pete extends caine{
	boolean m_multicolor;
	
	public caine_fara_pete(String nume, double inaltime, double greutate, int varsta, String culoare, boolean multicolor)
	{
		super(nume, inaltime, greutate, varsta, culoare);
		m_multicolor = multicolor;
	}
	
	public void citeste_valori()
	{
		super.citeste_valori();
		
		boolean multicolor;
		System.out.println("Canele este multicolor?");
		multicolor = keyboard.nextBoolean();
		
		m_multicolor = multicolor;
	}
	
	public void afiseaza_valori()
	{
		super.afiseaza_valori();
		
		if(m_multicolor == true) 
		{
			System.out.println("Cainele este multicolor");
		}
		else
		{
			System.out.println("Cainele nu este multicolor");
		}
	}
}

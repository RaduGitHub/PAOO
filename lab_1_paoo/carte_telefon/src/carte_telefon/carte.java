package carte_telefon;

//import java.util.Vector;
import java.util.ArrayList;

public class carte {
	/*static*/ int m_c_nr = 0;
	
	public class abonat
	{
		int m_a_numar;
		String m_a_nume;
		String m_a_adresa;
		
		public void adauga_abonat(int nr, String nume, String adresa)
		{
			this.m_a_numar = nr;
			this.m_a_nume = nume;
			this.m_a_adresa = adresa;
		}
		
		public boolean caut_nume(String nume, boolean found) {
			if(m_a_nume.equals(nume) == true)
			{
				found = true;
				//System.out.print(found);
				System.out.println("Numarul de telefon asociat numelui " + nume + " este: " + this.m_a_numar);
			}
			return found;
		}
	}
	
	/*Vector<abonat> abonati;*/
	//abonat[] abonati;
	
	ArrayList<abonat> abonati = new ArrayList<abonat>();
	
	public void adauga(int nr, String nume, String adresa)
	{
		this.m_c_nr++;
		System.out.println("Am adaugat abonatu al " + this.m_c_nr + " cu numarul: " + nr + " numele: " + nume + " si adresa " + adresa);
		//abonati[m_c_nr] = new abonat();
		//adresa.abonati[m_c_nr].adauga_abonat(nr, nume, adresa);
		//abonati.add(m_c_nr).adauga_abonat(nr, nume, adresa);
		abonat temporar = new abonat();
		temporar.adauga_abonat(nr, nume, adresa);
		abonati.add(temporar);
	}
	
	public void cauta(String nume)
	{
		boolean found = false;
		for(abonat i : abonati)
		{
			found = i.caut_nume(nume, found);
		}
		//System.out.print(found);
		if(found==false)
		{
			System.out.println("Nu exista");
		}
	}

}
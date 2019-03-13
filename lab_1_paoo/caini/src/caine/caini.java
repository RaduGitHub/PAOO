package caine;

//import java.util.Scanner;

public class caini {

	public static void main(String[] args) {
		
		caine c0 = new caine("alex", 5, 6, 7, "rosu");
		c0.citeste_valori();
		c0.afiseaza_valori();
		
		caine_pete c1 = new caine_pete("max", 2,3,4,"roz", 20);
		c1.citeste_valori();
		c1.afiseaza_valori();
		
		caine_fara_pete c2 = new caine_fara_pete("alex", 5,6,7,"rosu",false);
		c2.citeste_valori();
		c2.afiseaza_valori();
	}

}
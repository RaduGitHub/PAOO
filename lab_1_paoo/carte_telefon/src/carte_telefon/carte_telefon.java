package carte_telefon;

public class carte_telefon {

	public static void main(String[] args) {
		carte carte_tel = new carte();
		
		carte_tel.adauga(2243, "Mihai", "are");
		carte_tel.adauga(223, "Mihai", "are");
		carte_tel.adauga(5323, "Mihai", "are");
		carte_tel.adauga(2123, "Mihai", "are");
		
		
		carte_tel.cauta("Mihai");
		

	}

}

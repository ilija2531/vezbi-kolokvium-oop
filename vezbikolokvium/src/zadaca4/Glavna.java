package zadaca4;

public class Glavna {

	public static void main(String[] args) {
		
		Fudbaler fudbaler = new Fudbaler("Cristiano", " Ronaldo", 1985, 15000000, "Maski");
		Rakometar rakometar = new Rakometar("Kiril", " Lazarov", 1980, 800000,57);
		
		System.out.println("Fudbaler:");
		System.out.println(" Ime: " + fudbaler.ime);
		System.out.println("Prezime: " + fudbaler.prezime);
		System.out.println("Godina na raganje: " + fudbaler.godinanaraganje );
		System.out.println("Godisna zarabotuvacka: " + fudbaler.godisnazarabotuvacka);
		System.out.println("Danok: " + fudbaler.danok());
		
		System.out.println("Rakometar:");
		System.out.println(" Ime: " + rakometar.ime);
		System.out.println("Prezime: " + rakometar.prezime);
		System.out.println("Godina na raganje: " + rakometar.godinanaraganje );
		System.out.println("Godisna zarabotuvacka: " + rakometar.godisnazarabotuvacka);
		System.out.println("Danok: " + rakometar.danok());
		

	}

}

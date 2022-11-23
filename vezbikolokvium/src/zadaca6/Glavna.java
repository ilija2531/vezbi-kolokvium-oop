package zadaca6;

public class Glavna {

	public static void main(String[] args) {
		
		Korisnik k = new Korisnik("Ilija","4444");
		Kupuvac k1 = new Kupuvac("Darko","1234",70);
		Admin a1 = new Admin("Jana","7463","Popust na site proizvodi");
		k.pecatiPodatoci();
		a1.pecatiPodatoci();
		System.out.println("Dopolnitelni prvilegii: " + a1.dopolnitelniprivilegii);
		k1.pecatiPodatoci();
		System.out.println("Poeni: " + k1.poeni);
	}

}

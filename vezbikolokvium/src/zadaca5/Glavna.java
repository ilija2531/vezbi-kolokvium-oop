package zadaca5;

public class Glavna {

	public static void main(String[] args) {
		Brod brod = new Brod(150, 1000, 4.7, 15);
		Voz voz = new Voz(100,500,3.5,25);
		
		System.out.println("Brod: ");
		System.out.println("Tezina na tovar: " + brod.tezina + "kg.");
		System.out.println("Dolzina na transport: " + brod.dolzina + "km.");
		System.out.println("Cena na transport: " + brod.Cena() + "denari.");
		System.out.println();
		System.out.println("Voz: ");
		System.out.println("Tezina na tovar: " + voz.tezina + "kg.");
		System.out.println("Dolzina na transport: " + voz.dolzina + "km.");
		System.out.println("Cena na transport: " + voz.Cena() + "denari.");

	}

}

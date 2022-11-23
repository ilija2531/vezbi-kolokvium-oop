package zadaca2;

public class Glavna {

	public static void main(String[] args) {
			Konvertor kon1 = new Konvertor();
			Konvertor kon2 = new Konvertor();
			
			double kg;
			double lb;
			kg=5;
			lb=10;
			
			System.out.println(kg + " kg se: " + kon1.convertKg(kg) + " lb.");
			System.out.println(lb + " lb se: " + kon2.convertLb(lb) + " kg.");
	}

}

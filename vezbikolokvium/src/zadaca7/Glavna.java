package zadaca7;

public class Glavna {

	public static void main(String[] args) {
			double dollar;
			double denar;
			
			dollar=10;
			denar=120;
			
			Convertor c1 = new Convertor();
			Convertor c2 = new Convertor();
			
			System.out.println(dollar + " dolari, se " + c1.convertDollartoDenari(dollar) + " denari.");
			System.out.println(denar + " denari, se " + c2.convertDenartoEvra(denar) + " evra.");
	}

}

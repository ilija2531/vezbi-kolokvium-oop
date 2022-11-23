package zadaca3;

public class Glavna {

	public static void main(String[] args) {
		Pravoagolnik pravoagolnik = new Pravoagolnik();
		pravoagolnik.setA(5);
		pravoagolnik.setB(8);
		
		System.out.println("Pravoagolnikot so strana a= " + pravoagolnik.getA() + " i strana b= " + pravoagolnik.getB() + " ima dijagonala od: " + pravoagolnik.dijagonala() + " cm.");

	}

}

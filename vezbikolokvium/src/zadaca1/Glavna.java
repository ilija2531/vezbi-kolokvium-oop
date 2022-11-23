package zadaca1;

public class Glavna {

	public static void main(String[] args) {
		
		double in;
		double cm;
		in = 4;
		cm = 8;
				
		Convertor konv1 = new Convertor();
		Convertor konv2 = new Convertor();
		System.out.println(in + " inchi iznesuvaat: " + konv1.convertInches(in) + " cm.");
		System.out.println(cm + " cm iznesuvaat: " + konv2.convertCentimeters(cm) + " inchi.");
	}

}

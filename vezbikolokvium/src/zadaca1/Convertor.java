package zadaca1;

public class Convertor implements IConversion {

	@Override
	public double convertInches(double in) {
		return in*2.54;
	}

	@Override
	public double convertCentimeters(double cm) {
		return cm/2.54;
	}

}

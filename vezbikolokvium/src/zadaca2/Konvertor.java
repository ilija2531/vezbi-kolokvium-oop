package zadaca2;

public class Konvertor implements IKonverzija {

	@Override
	public double convertKg(double kg) {
		return kg/0.4536;
	}

	@Override
	public double convertLb(double lb) {
		return lb*0.4536;
	}

}

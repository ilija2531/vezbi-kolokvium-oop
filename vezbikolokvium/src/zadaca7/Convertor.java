package zadaca7;

public class Convertor implements IConvertor {

	@Override
	public double convertDollartoDenari(double dollar) {
		return dollar/0.017;
	}
	
	@Override
	public double convertDenartoEvra(double denar) {
		return denar*0.016;
	}

}

package zadaca5;

public class Voz extends Transport {
		double potrosuvackastruja;
		double cenastruja;
		
	public Voz(double tezina, int dolzina,double potrosuvackastruja,double cenastruja) {
		super(tezina, dolzina);
		this.potrosuvackastruja= potrosuvackastruja;
		this.cenastruja = cenastruja;
	}
	
	public double Cena() {
		return dolzina*potrosuvackastruja* cenastruja ;
	}

}

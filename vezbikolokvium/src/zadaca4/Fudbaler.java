package zadaca4;

public class Fudbaler extends Sportist {
	String pol;
	
	public Fudbaler(String ime,String prezime,int godinanaraganje, double godisnazarabotuvacka, String pol) {
		super(ime,prezime,godinanaraganje,godisnazarabotuvacka);
		this.pol = pol;
	}
	
	public double danok() {
		return godisnazarabotuvacka * 0.05;
	}
}

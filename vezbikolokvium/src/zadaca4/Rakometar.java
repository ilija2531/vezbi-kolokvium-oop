package zadaca4;

public class Rakometar extends Sportist {
	int odigraninatprevari;
	
	public Rakometar(String ime,String prezime, int godinanaraganje, double godisnazarabotuvacka, int odigraninatprevari) {
		super(ime,prezime,godinanaraganje,godisnazarabotuvacka);
		this.odigraninatprevari = odigraninatprevari;
	}
	public double danok() {
		if(odigraninatprevari < 20) {
			return godisnazarabotuvacka * 0.07;
		}
		else
			return godisnazarabotuvacka * 0.11;
	}

}

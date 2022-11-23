package zadaca4;

public class Fakultet {
	private String ime;
	private int brnasmerovi;
	private int studenti;
	
	public Fakultet(String ime, int brnasmerovi, int studenti) {
		this.ime = ime;
		this.brnasmerovi = brnasmerovi;
		this.studenti = studenti;
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrnasmerovi() {
		return brnasmerovi;
	}

	public void setBrnasmerovi(int brnasmerovi) {
		this.brnasmerovi = brnasmerovi;
	}

	public int getStudenti() {
		return studenti;
	}

	public void setStudenti(int studenti) {
		this.studenti = studenti;
	}
}

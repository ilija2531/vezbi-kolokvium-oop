package zadaca6;

public class Kupuvac extends Korisnik {
	int poeni;
	
	public Kupuvac(String UserId, String UserLoggedIn,int poeni) {
		super(UserId,UserLoggedIn);
		this.poeni = poeni;
	}

}

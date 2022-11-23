package zadaca6;

public class Admin extends Korisnik {
	String dopolnitelniprivilegii;
	
	public Admin(String userId, String userLoggedIn,String dopolnitelniprivilegii) {
		super(userId,userLoggedIn);
		this.dopolnitelniprivilegii = dopolnitelniprivilegii;
		
	}
}

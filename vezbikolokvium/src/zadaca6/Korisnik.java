package zadaca6;

public class Korisnik {
	private String userId;
	private String userLoggedIn;
	
	public Korisnik(String userId,String userLoggedIn) {
		this.userId = userId;
		this.userLoggedIn = userLoggedIn;
		
	}
	
	public void pecatiPodatoci() {
		System.out.println("User ID: " + userId);
		System.out.println("User LoggedIn: " + userLoggedIn);
	}
	
}

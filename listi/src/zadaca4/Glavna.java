package zadaca4;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
			List<Fakultet> fakulteti = new ArrayList<Fakultet>();
			Fakultet fakultet1 = new Fakultet("FIKT",2,150);
			fakulteti.add(fakultet1);
			Fakultet fakultet2 = new Fakultet("TFB" , 4 , 200);
			fakulteti.add(fakultet2);
			Fakultet fakultet3 = new Fakultet("FINKI",6,500);
			fakulteti.add(fakultet3);
			Fakultet fakultet4 = new Fakultet("Ekonomski Fakultet-Prilep",3,250);
			fakulteti.add(fakultet4);
			Fakultet fakultet5 = new Fakultet("PMF",4,600);
			fakulteti.add(fakultet5);
			
			
			
			System.out.println("Fakulteti: " + fakultet1);

	}

}

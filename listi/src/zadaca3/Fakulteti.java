package zadaca3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fakulteti {

	public static void main(String[] args) {
		List<String> fakulteti = new ArrayList<>();
		
		fakulteti.add("FIKT");
		fakulteti.add("TFB");
		fakulteti.add("Praven Fakultet-Kicevo");
		
		Collections.sort(fakulteti);
		
		System.out.println(fakulteti);

	}

}

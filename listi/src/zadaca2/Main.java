package zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> footballclubs = new ArrayList<>();
		footballclubs.add("Real Madrid");
		footballclubs.add("Barcelona");
		footballclubs.add("Manchester United");
		
		footballclubs.remove(1);
		System.out.println("Goleminata na listata e: " + footballclubs.size());
		System.out.println("Elementi: " + footballclubs);

	}

}

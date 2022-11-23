package zadaca1;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Ilija");
		lista.add("Bojan");
		lista.add("Darko");
		
		System.out.println("Goleminata na listata e: " + lista.size());
		System.out.println("Elementi na listata se: " + lista);
	}

}

package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProvaArray {

	public static void main(String[] args) {

		String[] giorni = {
				"lunedì",
				"martedì",
				"mercoledì",
				"giovedì",
				"venerdì",
				"sabato",
				"domenica",
		};
		
		Arrays.sort(giorni);
		
		for (String giorno : giorni) {
			System.out.println(giorno.toUpperCase());
		}

		List<String> listaGiorni = new ArrayList<>(Arrays.asList(giorni));
		
		listaGiorni.add("riposedì");
		listaGiorni.add("riposerò");
		
		for (String giorno : listaGiorni) {
			System.out.println(giorno);
		}
		
	}

}

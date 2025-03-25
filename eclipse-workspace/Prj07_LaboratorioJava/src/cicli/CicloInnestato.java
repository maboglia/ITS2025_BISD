package cicli;

public class CicloInnestato {

	public static void main(String[] args) {


		for (int i = 1; i <= 10; i++) {//stampa le righe
			
			for (int j = 1; j <= 10; j++) {//stampa le colonne
				System.out.print(i * j + "\t");
			}
			System.out.println();//a capo dopo ogni 10
			
		}
		

	}

}

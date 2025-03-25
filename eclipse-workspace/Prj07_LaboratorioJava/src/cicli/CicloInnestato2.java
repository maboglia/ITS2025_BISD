package cicli;

public class CicloInnestato2 {

	public static void main(String[] args) {


		for (int i = 1; i <= 10; i++) {//stampa le righe
			
			for (int j = 1; j <= i; j++) {//stampa le colonne
				System.out.print("*" + " ");
			}
			System.out.println();//a capo dopo ogni 10
			
		}
		

	}

}

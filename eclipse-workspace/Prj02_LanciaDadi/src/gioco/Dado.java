package gioco;

public class Dado {

	int facce;
	
	Dado(int numeroDiFacce){
		facce = numeroDiFacce;
	}
	
	int lancia() {
		return  (int) ( Math.random() * facce)  + 1      ;
	}
	
}

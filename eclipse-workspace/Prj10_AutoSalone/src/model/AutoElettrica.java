package model;

public class AutoElettrica extends Automobile implements Elettrica {

	public AutoElettrica(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
		this.nome = "Auto elettrica";
		this.alimentazione = Alimentazione.CORRENTE;
	}

}

package model;

public class Automobile extends Veicolo {

	int cilindrata;
	int posti;
	String modello;
	
	//public Automobile() {}
	
	/**
	 * Costruttore di Automobile Generica
	 */
	public Automobile(String marca) {
		super();//viene costruito veicolo
		this.nome = "Automobile";
		this.marca = marca;
	}

	
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}



	public void setPosti(int posti) {
		this.posti = posti;
	}



	public void setModello(String modello) {
		this.modello = modello;
	}



	@Override
	public String toString() {
		String libretto = super.toString();
		libretto += "Automobile [cilindrata=" + cilindrata + ", posti=" + posti + ", modello=" + modello + "]";
		return libretto;
	}

	
	
}

package model;

public class Automobile extends Veicolo {

	int cilindrata;
	int posti;
	String modello;
	Alimentazione alimentazione;
	
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
		StringBuilder libretto = new StringBuilder();
		
		//libretto.append("Automobile [cilindrata=" + cilindrata + ", posti=" + posti + ", modello=" + modello + "]");
		libretto.append("\n*******************************************************\n");
		libretto.append("Tipo di mezzo: " + nome);
		libretto.append("\nmarca: " + marca);
		libretto.append("\nprezzo: " + getPrezzo());
		libretto.append("\ncilindrata: " + cilindrata);
		libretto.append("\nposti: " + posti);
		libretto.append("\nmodello: " + modello);
		libretto.append("\nalimentazione: " + alimentazione);
		libretto.append("\n*******************************************************\n");		
		
		return libretto.toString();
	}

	
	
}

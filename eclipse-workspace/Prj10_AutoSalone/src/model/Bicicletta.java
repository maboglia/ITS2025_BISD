package model;

public class Bicicletta extends Veicolo {

	public Bicicletta() {
		//super(); 
		this.nome = "Bicicletta";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n*******************************************************\n");
		builder.append("Bicicletta [nome=");
		builder.append(nome);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", getPrezzo()=");
		builder.append(getPrezzo());
		builder.append("]");
		builder.append("\n*******************************************************\n");
		return builder.toString();
	}
	
	
	
}

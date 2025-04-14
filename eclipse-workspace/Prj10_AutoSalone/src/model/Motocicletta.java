package model;

public class Motocicletta extends Veicolo {

	Alimentazione alimentazione;
	
	public Motocicletta() {
		this.nome = "Motocicletta";
		this.alimentazione = Alimentazione.BENZINA;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n*******************************************************\n");
		builder.append("Motocicletta [alimentazione=");
		builder.append(alimentazione);
		builder.append(", nome=");
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

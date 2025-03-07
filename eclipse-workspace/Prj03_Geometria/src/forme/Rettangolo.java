package forme;

public class Rettangolo {

	private Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double perimetro() {
		return (base.lunghezza() + altezza.lunghezza())*2;
	}

	public double area() {
		return base.lunghezza() * altezza.lunghezza();
	}
}

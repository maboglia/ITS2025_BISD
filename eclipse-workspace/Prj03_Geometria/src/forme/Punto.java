package forme;

public class Punto {//astrazione
	
	private int x, y;//incapsulamento 

	//         parametri formali          argomenti
	public Punto(int x, int y) {//new Punto(3, 2);
		this.x = x;
		this.y = y;
	}
	//getters (accessori) setters (mutatori)

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
	
	
}

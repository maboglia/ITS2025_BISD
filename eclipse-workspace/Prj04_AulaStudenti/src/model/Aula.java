package model;

public class Aula {

	private Studente[] studenti;
	private Postazione[] postazioni;
	
	public Aula(){
		studenti = new Studente[30];
		postazioni = new Postazione[30];
	}
	
	//CREATE
	public void addStudente(Studente s, int pos) {
		studenti[pos] = s;
	}
	//READ
	public Studente getStudenteById(int pos) {
		return studenti[pos];
	}
	
	public Studente[] getStudenti() {
		return studenti;
	}
	//update
	public void updateStudente(Studente s, int pos) {
		studenti[pos] = s;
	}
	//delete
	public void deleteStudente(int pos) {
		studenti[pos] = null;
	}
	
}

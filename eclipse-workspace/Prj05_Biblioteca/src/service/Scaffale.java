package service;

import java.util.ArrayList;
import java.util.List;

public class Scaffale {

	private String nome;
	private List<Ripiano> ripiani;
	
	public Scaffale(String nome) {
		super();
		this.nome = nome;
		this.ripiani = new ArrayList<Ripiano>();
		initScaffale();
	}
	
	private void initScaffale() {
		this.ripiani.add(new Ripiano("primo"));
		this.ripiani.add(new Ripiano("secondo"));
		this.ripiani.add(new Ripiano("terzo"));
		this.ripiani.add(new Ripiano("quarto"));
		this.ripiani.add(new Ripiano("quinto"));
	}
	
	public Ripiano getRipiano(int piano) {
		return this.ripiani.get(piano);
	}
	
	
	
}

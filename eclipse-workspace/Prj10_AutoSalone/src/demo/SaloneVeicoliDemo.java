package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import model.*;

public class SaloneVeicoliDemo {

	public static void main(String[] args) {

		Automobile auto1 = new AutoElettricaFuoristrada("Porsche");
		Automobile auto2 = new AutoElettrica("Toyota");
		Automobile auto3 = new Automobile("Fiat");
		
		Motocicletta moto1 = new Motocicletta();
		
		Bicicletta bici1 = new BiciElettrica();
		Bicicletta bici2 = new Bicicletta();
		
		List<Veicolo> stanza1 = new ArrayList<>();
		stanza1.add(auto1);
		stanza1.add(moto1);
		stanza1.add(bici1);
		
		Deque<Veicolo> stanza2 = new LinkedList<>();
		stanza2.add(bici2);
		stanza2.addFirst(moto1);
		
		Set<Veicolo> stanza3 = new HashSet<>();
		stanza3.add(bici2);
		stanza3.add(bici1);
		stanza3.add(bici2);
		stanza3.add(auto3);
		stanza3.add(auto2);
		
		stampaStanza("Stanza1", stanza1);
		stampaStanza("Stanza2", stanza2);
		stampaStanza("Stanza3", stanza3);
//		
//		System.out.println("La stanza 1 contiene " + stanza1.size() + " veicoli");
//		System.out.println("La stanza 2 contiene " + stanza2.size() + " veicoli");
//		System.out.println("La stanza 3 contiene " + stanza3.size() + " veicoli");
	
		
		
	}

	private static void stampaStanza(String nomeStanza, Collection<Veicolo> stanza) {
		System.out.printf("La %s contiene " + stanza.size() + " veicoli %n", nomeStanza);
		
		for (Veicolo veicolo : stanza) {
			System.out.println(veicolo);
		}
		
	}

}

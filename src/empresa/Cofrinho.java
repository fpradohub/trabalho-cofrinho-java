package empresa;

import java.util.ArrayList;

public class Cofrinho{
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); // Armazena as moedas
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);		
	}
	
	public void remover(Moeda m) {
		listaMoedas.remove(m);		
	}
	
	public void listagemMoedas() {
		for(Moeda m : listaMoedas) {
			System.out.println(m);			
		}
	}
	
	public double converter() {
		double total = 0;
		for(Moeda m : listaMoedas) {
			total += m.converter(); // cada moeda fará a sua conversão.			
		}
		return total;
	}

}

package festival.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	
	private String nome;
	private int capacidade;
	private List<Evento> eventos = new ArrayList<>();
	
	public Palco(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	

	public void mostrarEventos() {
		for (Evento e : eventos) {
			System.out.println(e);
		}
	}
	
	public void adicionaEvento(Evento evento) {
		this.eventos.add(evento);
	}	

	@Override
	public String toString() {
		return String.format("""
				Palco: %s
				Capacidade: %s
				
				Eventos: 
				""", nome, capacidade);
	} 
	
}

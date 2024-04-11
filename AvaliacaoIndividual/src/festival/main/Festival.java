package festival.main;

import java.time.LocalDate;

import festival.classes.Banda;
import festival.classes.Cantor;
import festival.classes.DJ;
import festival.classes.Evento;
import festival.classes.Genero;
import festival.classes.Palco;

public class Festival {
	public static void main(String[] args) {
		
		DJ dj1 = new DJ("Vintage Culture", Genero.ELETRONICA, 250000);
		Banda banda1 = new Banda("The Cure", Genero.ROCK, 200000);
		Cantor cantor1 = new Cantor("Luedji Luna", Genero.MPB, 150000);
		Cantor cantor2 = new Cantor("Maria Bethânia", Genero.MPB, 300000);
		
		Palco palco1 = new Palco("Floresta", 50000);
		Palco palco2 = new Palco("Sol", 40000);
		
		Evento evento1 = new Evento(LocalDate.parse("2024-03-11"), "19:00", banda1);
		Evento evento2 = new Evento(LocalDate.parse("2024-03-11"), "20:30", dj1);
		Evento evento3 = new Evento(LocalDate.parse("2024-04-11"), "19:00", cantor1);
		Evento evento4 = new Evento(LocalDate.parse("2024-04-11"), "20:30", cantor2);
		
		palco1.adicionaEvento(evento1);
		palco1.adicionaEvento(evento2);
		palco2.adicionaEvento(evento3);
		palco2.adicionaEvento(evento4);
		
		System.out.println("DADOS DO FESTIVAL:\n");
		System.out.println(palco1);
		palco1.mostrarEventos();
		System.out.println(palco2);
		palco1.mostrarEventos();

	}
}

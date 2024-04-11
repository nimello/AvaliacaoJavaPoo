package festival.classes;

import java.time.LocalDate;

public class Evento {
	
	private LocalDate data;
	private String horario;
	private Artista artista;
	
	public Evento(LocalDate data, String horario, Artista artista) {
		this.data = data;
		this.horario = horario;
		this.artista = artista;
	}

	public String getHorario() {
		return horario;
	}

	public LocalDate getData() {
		return data;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return String.format("""
				Data: %s
				Hora: %s
				Artista: %s
				""", data, horario, artista);
	}

}

package festival.classes;

public enum Genero {
	
	MPB("MPB"),
	ROCK("Rock"),
	ELETRONICA("Eletrônica");

	private String nome;
	
	private Genero(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

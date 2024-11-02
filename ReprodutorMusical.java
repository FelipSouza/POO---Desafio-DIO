package celular;

public interface ReprodutorMusical {
	
	public default void tocar() {
		System.out.println("Tocando música");
	}
	
	public default void pausar() {
		System.out.println("Pausando música");
	}
	
	public default void selecionarMusica(String musica) {
		System.out.println("Selecionando musica: " + musica);
	}
}

package celular;

public interface AparelhoTelefonico {
	
	public default void ligar(String numero) {
		System.out.println("Ligando para numero: " + numero);
	}
	
	public default void atender() {
		System.out.println("Atendendo ligação");
	}
	
	public default void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}

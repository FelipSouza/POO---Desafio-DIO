package celular;

public interface NavegadorInternet{
	
	public default void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	}
	
	public default void adicionarNovaAba() {
		System.out.println("Adicionando nova página");
	}
	
	public default void atualizarPagina() {
		System.out.println("Atualizando página");
	}
	
	
}

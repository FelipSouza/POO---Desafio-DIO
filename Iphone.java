package celular;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavegadorInternet ni = new Iphone();
		AparelhoTelefonico at = new Iphone();
		ReprodutorMusical rm = new Iphone();
		
		ni.adicionarNovaAba();
		ni.exibirPagina("https://google.com.br");
		ni.atualizarPagina();
		
		
		at.atender();
		at.ligar("+55(68)9.9999-9999");
		at.iniciarCorreioVoz();
		
		rm.selecionarMusica("Todavia me alegrarei");
		rm.tocar();
		rm.pausar();
		
		
	}

}

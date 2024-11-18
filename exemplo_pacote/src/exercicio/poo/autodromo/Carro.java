package exercicio.poo.autodromo;

public class Carro extends veiculo {
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado");
	}
	
	public void confereCambio() {
		System.out.println("conferindo cambio em P");
	}
	
	public void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
}

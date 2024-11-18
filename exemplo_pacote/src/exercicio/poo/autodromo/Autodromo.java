package exercicio.poo.autodromo;

public class Autodromo {
		public static void main(String[] args) {
			Carro jeep = new Carro();
			
			jeep.setChassi("89971");
			jeep.ligar();
			
			Moto z400 = new Moto();
			z400.setChassi("466755");
			z400.ligar();
			
			veiculo coringa = z400;
			
			coringa.ligar();
		}
}

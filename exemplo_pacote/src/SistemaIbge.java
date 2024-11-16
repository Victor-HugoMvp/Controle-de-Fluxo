
public class SistemaIbge {
	public static void main(String args []){
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
		} 
		
		EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
		
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIbge());
	}
}

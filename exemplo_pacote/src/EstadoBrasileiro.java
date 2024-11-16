
public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo", 1222),
	RIO_JANEIRO("RJ", "Rio Janeiro", 4455),
	PIAUI("PI", "Piauí", 5588),
	MARANHAO("MA", "Maranhão", 7799),
	CEARA("CE", "Ceará", 6655);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	
	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getIbge() {
		return ibge;
	}
}

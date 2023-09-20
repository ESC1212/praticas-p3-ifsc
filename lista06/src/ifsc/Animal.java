package ifsc;

public class Animal {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	private String raca;
	public void caminhada() {
		System.out.println("pigiça");
	}
	private float comprimento;
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public Integer getNumpatas() {
		return numpatas;
	}
	public void setNumpatas(Integer numpatas) {
		this.numpatas = numpatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEcosis() {
		return ecosis;
	}
	public void setEcosis(String ecosis) {
		this.ecosis = ecosis;
	}
	private Integer numpatas;
	private String cor;
	private String ecosis;
}
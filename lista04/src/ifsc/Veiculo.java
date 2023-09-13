package ifsc;

public class Veiculo {
	private String Nome;
	private Integer Ano;
	private Integer Rodas;
	private String Fabric;
	private String Cor;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getAno() {
		return Ano;
	}
	public void setAno(Integer ano) {
		Ano = ano;
	}
	public Integer getRodas() {
		return Rodas;
	}
	public void setRodas(Integer rodas) {
		Rodas = rodas;
	}
	public String getFabric() {
		return Fabric;
	}
	public void setFabric(String fabric) {
		Fabric = fabric;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
}

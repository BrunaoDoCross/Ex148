package entities;

public class Funcionarios {
	private String nome;
	private Integer horaTrab;
	private Double valHora;

	public Funcionarios(String nome, Integer horaTrab, Double valHora) {
		super();
		this.nome = nome;
		this.horaTrab = horaTrab;
		this.valHora = valHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoraTrab() {
		return horaTrab;
	}

	public void setHoraTrab(Integer horaTrab) {
		this.horaTrab = horaTrab;
	}

	public Double getValHora() {
		return valHora;
	}

	public void setValHora(Double valHora) {
		this.valHora = valHora;
	}

	public double pagamento() {
		return valHora * horaTrab;
	}

}

package entities;

public class FuncionariosTercerizados extends Funcionarios {
	private Double adicional;

	public FuncionariosTercerizados(String nome, Integer horaTrab, Double valHora, Double adicional) {
		super(nome, horaTrab, valHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamento() {
		return (super.pagamento()) + (adicional + adicional * 0.1);
	}
}

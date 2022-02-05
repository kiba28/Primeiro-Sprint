package questão9;

public class Funcionarios {

	private String nome;
	private double salario;

	public Funcionarios(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		if (this.salario <= 1000) {
			return this.salario * 0.2;
		} else if (this.salario < 2000) {
			return this.salario * 0.1;
		} else {
			return -(this.salario * 0.1);
		}
	}

	public double getSalarioLiquido() {
		return salario + this.getBonus();
	}

}

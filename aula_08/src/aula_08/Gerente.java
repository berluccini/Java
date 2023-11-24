package aula_08;

public class Gerente extends Funcionarios{
	
	private float bonus;

	public Gerente(String nome, int cargo, float salario, float bonus) {
		super(nome, cargo, salario);
		this.bonus = bonus;
	}

	public float getbunos() {
		return bonus;
	}

	public void setbunos(float bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("bonus:" + this.bonus);
	}

	@Override
	public float calcularsalario() {
		return this.getSalario()+ bonus;
	}
	

}

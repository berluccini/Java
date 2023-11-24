package aula_08;

public class Vendendor extends Funcionarios {
	
	public float comissao;

	
	public Vendendor(String nome, int cargo, float salario,float comissao) {
		super(nome, cargo, salario);
		this.comissao = comissao;
		

	}

	public float getComissao() {
		return comissao;
	}


	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("bonus:" + this.comissao);
	}


	@Override
	public float calcularsalario() {
		return (this.getSalario()+ comissao *this.comissao);
	}
	
	
	

}

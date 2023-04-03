package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoCom autenticador;

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return getSalario();
	}

	public Gerente() {
		this.autenticador = new AutenticacaoCom();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}

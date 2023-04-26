package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	public void saca(double valor) throws SaldoInsuficienteExcecao {
		double valorASacar = valor + 0.20;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(valor);

	}

	@Override
	public double getValorImposto() {

		return super.getSaldo() * 0.01;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente" + super.toString();
	}

}

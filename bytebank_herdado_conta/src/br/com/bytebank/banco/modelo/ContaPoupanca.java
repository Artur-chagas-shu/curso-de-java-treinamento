package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
    @Override
	public void deposita(double valor) {
		setSaldo(valor);
		
	}
    
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta poupanca" + super.toString();
	}
}

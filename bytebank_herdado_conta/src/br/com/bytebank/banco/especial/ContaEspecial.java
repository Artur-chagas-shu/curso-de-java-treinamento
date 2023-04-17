package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	@Override
	public void deposita(double valor) {
	

	}

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	

}

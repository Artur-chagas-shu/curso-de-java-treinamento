package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Conta[5];

		ContaCorrente cp1 = new ContaCorrente(22, 33);

		ContaPoupanca cp2 = new ContaPoupanca(22, 44);

		referencias[0] = cp1;
		referencias[1] = cp2;

		Object cliente = new Cliente();

		referencias[2] = cliente;

		ContaCorrente ref = (ContaCorrente) referencias[0]; // type cast ;

//		System.out.println( contas[0].getNumero());

		System.out.println(cp1.getNumero());

		System.out.println(ref.getNumero());
	}

}

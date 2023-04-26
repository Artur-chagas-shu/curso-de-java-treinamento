package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// Generics , nao precisa usar o cast pois ele ja sabe o tipo
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);

		Conta cc2 = new ContaCorrente(33, 22);

		lista.add(cc);

		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		
		Conta ref =  lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(22, 11);

		Conta cc4 = new ContaCorrente(33, 22);

		lista.add(cc3);

		lista.add(cc4);

		System.out.println("Tamanho: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		System.out.println("-------------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

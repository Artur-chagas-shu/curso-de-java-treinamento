package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("x");
		System.out.println(1);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		
		System.out.println(cp);
		System.out.println(cc.toString());
		
		
	}
	
	
	static void println() {}
	static void println(String s) {}
	static void println(int a) {}
	static void println(boolean valor) {}
}

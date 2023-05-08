package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("222333444");
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");

		ContaCorrente conta = new ContaCorrente(222,333);
		conta.setTitular(cliente);
		conta.setSaldo(222.3);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(conta);
		oos.close();
	}

}

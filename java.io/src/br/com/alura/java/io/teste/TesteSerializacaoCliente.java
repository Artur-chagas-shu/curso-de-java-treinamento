package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setCpf("222333444");
//		cliente.setNome("Nico");
//		cliente.setProfissao("Dev");
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();

		System.out.println(cliente.getNome());

	}
}

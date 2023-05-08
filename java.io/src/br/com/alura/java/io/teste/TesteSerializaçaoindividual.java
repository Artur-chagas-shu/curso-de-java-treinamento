package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class TesteSerializaçaoindividual {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		String peaches = "peaches i love youuuuuu";
		
		ObjectOutputStream bowser = new ObjectOutputStream(new FileOutputStream("Objeto.txt"));
		
		bowser.writeObject(peaches);
		bowser.close();
		
		
		ObjectInputStream bowser2 = new ObjectInputStream(new FileInputStream("Objeto.txt"));
	    String boser =  	(String) bowser2.readObject();
	    bowser2.close();
	    System.out.println(boser);
		
		
	}
	
}

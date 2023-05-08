package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "windows-1252");
		

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
		
			
		  String stringFormatada =	String.format( "%s - %s04d-%08d, %20s: %08.2f %n" , tipoConta,agencia,numero,titular,saldo);
			
			System.out.println(stringFormatada);
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.deepToString(valores));
		}
		scanner.close();

	}

}

package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Testeindividual {

	public static void main(String[] args) throws IOException {

		// fluxo de entrada com arquivo

		InputStream fos = new FileInputStream("lorem.txt");
		Reader osw = new InputStreamReader(fos);
		BufferedReader bw = new BufferedReader(osw);

//		BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));

//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		String linha = bw.readLine();

		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		while(linha != null && !linha.isEmpty() ){
			ps.println(linha);
			linha = bw.readLine();
			
			
			
			
		}
		
		bw.close();
		ps.close();

	}
}

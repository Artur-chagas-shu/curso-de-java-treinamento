package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";

		String outro = nome.replace("A", "a");

		System.out.println(nome);
		
		//String outro = nome.toUpperCase();
		System.out.println(outro);
		
		
		System.out.println(nome.isEmpty());
		
		String vazio = nome.trim();
		
		System.out.println(vazio);
		
		
		
		System.out.println(vazio.contains("Alura"));
		
		
		System.out.println( nome.length());
		
		for(int i = 0; i < nome.length(); i ++) {
			
			System.out.println(nome.charAt(i));
			
			
			
		
			
			
		}
		
		System.out.println( nome.indexOf("ur"));
		
		
		
	
		System.out.println(nome.substring(1));
		
		
		
	}

}

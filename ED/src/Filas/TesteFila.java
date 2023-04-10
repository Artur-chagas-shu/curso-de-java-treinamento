package Filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class TesteFila {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		
		fila.add("Mauricio");
		fila.add("Guilherme");
		System.out.println(fila);
		
		System.out.println(fila.remove());
		
		System.out.println(fila);
		
		
		
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Mauricio");
		filaDoJava.add("paulo");
		filaDoJava.add("Guilherme");
		filaDoJava.poll();
		filaDoJava.add("joao");
		filaDoJava.poll();
		System.out.println(filaDoJava);
	}

}

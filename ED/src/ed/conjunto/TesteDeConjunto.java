package ed.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteDeConjunto {

	public static void main(String[] args) {

		Conjunto conjunto = new Conjunto();

		conjunto.adiciona("mauricio");
		System.out.println(conjunto);

		conjunto.adiciona("mauricio");
		System.out.println(conjunto);

		conjunto.adiciona("marcelo");

		conjunto.adiciona("lucas");
		System.out.println(conjunto);

		conjunto.remove("mauricio");

		System.out.println(conjunto);
		
		
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		conjuntoDoJava.add("mauricio");
		conjuntoDoJava.add("ana");
		System.out.println(conjuntoDoJava);
		
		
	
		
	}

}

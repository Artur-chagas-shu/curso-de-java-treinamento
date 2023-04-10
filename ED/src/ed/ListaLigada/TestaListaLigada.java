package ed.ListaLigada;

public class TestaListaLigada {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		lista.adicionaNoComeco("mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("paulo");
		System.out.println(lista);
		lista.adicionaNoComeco("guilherme");
		System.out.println(lista);
		lista.adicionaNofinal("marcelo");
		System.out.println(lista);
		lista.adicionaNoMeio(2, "gabiel");
		System.out.println(lista);		
		
		System.out.println(lista.pega(2));
		
		System.out.println(lista.tamanho());
		lista.removeDoComeco();
		System.out.println(lista);
		lista.removeDoFim();
		System.out.println(lista);
		lista.adicionaNoComeco("maria");
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);
		
		System.out.println(lista.contem("paulo"));
		System.out.println(lista.contem("jao"));
	
	}

}

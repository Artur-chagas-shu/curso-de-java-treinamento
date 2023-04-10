
public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("joao");
		Aluno a2 = new Aluno("jose");

		Vetor lista = new Vetor();
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		System.out.println(lista);

		System.out.println(lista.contem(a1));
		Aluno a3 = new Aluno("Danilo");
		System.out.println(lista.contem(a3));

		lista.adiciona(1, a3);
		System.out.println(lista);

		lista.remove(0);
		System.out.println(lista);

		for (int i = 0; i < 300; i++) {

			Aluno y = new Aluno("Joao" + i);
			lista.adiciona(y);
			i++;
		}
		System.out.println(lista);

	}

}

package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("2223334-9");
		nico.setSalario(2600.0);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

		// nico.salario = 300;

	}

}

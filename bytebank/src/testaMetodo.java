
public class testaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();

		contaDoPaulo.saldo = 100;

		contaDoPaulo.deposita(50);

		System.out.println(contaDoPaulo.saldo);

		contaDoPaulo.deposita(100);
		System.out.println(contaDoPaulo.saldo);

		boolean retornoDoAcontecido = contaDoPaulo.saca(20);

		System.out.println(contaDoPaulo.saldo);

		System.out.println(retornoDoAcontecido);

		Conta contaDaMarcela = new Conta();

		contaDaMarcela.deposita(1000);

		System.out.println(contaDaMarcela.saldo);

		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("tranferencia feita com sucesso");
		} else {
			System.out.println("saldo insuficiente");
		}

		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);

	}

}

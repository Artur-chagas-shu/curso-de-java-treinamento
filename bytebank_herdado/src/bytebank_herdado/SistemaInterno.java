package bytebank_herdado;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel Fa) {

		boolean autenticou = Fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar ");
		} else {
			System.out.println("Nao pode entrar");
		}

	}

}

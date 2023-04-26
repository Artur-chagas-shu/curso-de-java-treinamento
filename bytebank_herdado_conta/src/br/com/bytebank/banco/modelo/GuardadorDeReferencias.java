package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private int posicaoLivre;

	Conta[] referenciasO;

	public GuardadorDeReferencias() {
		this.referenciasO = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referenciasO[posicaoLivre] = ref;
		posicaoLivre++;

	}

	public int getQuantidadeDeElementos() {

		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		
		return this.referenciasO[pos];
	}

}

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	
	private int TotalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		garanteEspaco();
		this.alunos[TotalDeAlunos] = aluno;
		TotalDeAlunos++;

	}

	private boolean PosicaoValida(int posicao) {
		return posicao >= 0 && posicao <= TotalDeAlunos;
	}

	public void garanteEspaco() {
		if (TotalDeAlunos == alunos.length) {
			Aluno[] novaArray = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novaArray[i] = alunos[i];

			}
			this.alunos = novaArray;
		}
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (!PosicaoValida(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}

		for (int i = TotalDeAlunos - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		TotalDeAlunos++;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < TotalDeAlunos;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}

		return alunos[posicao];

	}

	public void remove(int posicao) {

		for (int i = posicao; i <= TotalDeAlunos - 1; i++) {
			this.alunos[i] = alunos[i + 1];
		}
		TotalDeAlunos--;

	}

	public boolean contem(Aluno aluno) {

		for (int i = 0; i < TotalDeAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return TotalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}

}

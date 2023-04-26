package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma Conta
 * 
 * @author Artur Chagas
 *
 */

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	static int getTotal() {
		return Conta.total;
	}

	/**
	 * Construtor para inicializar o objeto a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		total++;
		// System.out.println(" O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("estou criando uma conta, agencia " + this.agencia);

	}

	public abstract void deposita(double valor);

	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteExcecao
	 */
	public void saca(double valor) throws SaldoInsuficienteExcecao {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteExcecao("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExcecao {
		this.saca(valor);

		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode ser menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode ser <=0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.numero != outra.numero) {
			return false;
		}
		if (this.agencia != outra.agencia) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		  return Double.compare(this.saldo, outra.saldo);
		
	}
	
	

	@Override
	public String toString() {
		//
		return " Numero:" + this.numero + ",Agencia:" + this.agencia + " saldo: " + this.saldo;
	}
}
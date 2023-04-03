public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	static int getTotal() {
		return Conta.total;
	}

	public Conta(int agencia, int numero) {
		total++;
		// System.out.println(" O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("estou criando uma conta, agencia " + this.agencia);

	}

	public abstract void deposita(double valor);

	public void saca(double valor)throws SaldoInsuficienteExcecao {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteExcecao("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino)throws SaldoInsuficienteExcecao {
		this.saca(valor) ;
		
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
}
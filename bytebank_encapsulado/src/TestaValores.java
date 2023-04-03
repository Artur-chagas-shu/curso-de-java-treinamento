
public class TestaValores {
	
	public static void main(String[] args) {
		 
		Conta conta = new Conta(1337,24226);
		
		conta.setAgencia(-1337);
		System.out.println(conta.getAgencia());
		
		conta.setNumero(-333212);
		
		Conta conta2 = new Conta(1337,24233);
		Conta conta3 = new Conta(1333,25433);
		
		System.out.println(Conta.getTotal());
		
	}

}

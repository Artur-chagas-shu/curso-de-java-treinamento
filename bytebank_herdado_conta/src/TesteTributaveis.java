

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222,333);
		cc.deposita(100);
		
		
		SeguraDeVida seguro = new SeguraDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
	System.out.println(calc.getTotalImposto());
		
	}

}

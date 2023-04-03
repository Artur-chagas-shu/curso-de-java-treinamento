package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setSenha(5555);
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		si.autentica(adm);
		
		si.autentica(cliente);
		
		
		Gerente ge = new Gerente();
		
		ge.setSenha(2222);
		si.autentica(ge);
		

	}

}

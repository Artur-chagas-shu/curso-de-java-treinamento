package br.com.bytebank.banco.teste.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer nRef = Integer.valueOf(29); // autoboxing
		int oRef = nRef.intValue();// unboxing
		System.out.println(oRef);
		
		Double Dref = Double.valueOf(34.6);// autoboxing
		double dRef = Dref.doubleValue();// unboxing
		System.out.println(dRef);
		
		
		
		Boolean  Bref = Boolean.FALSE;//autoboxing	
		boolean bRef = Bref.booleanValue();// unboxing
		System.out.println(bRef);
		
		

	}

}

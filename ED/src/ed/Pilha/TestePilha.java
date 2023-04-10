package ed.Pilha;

import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {
//		Pilha pilha = new Pilha();
//		System.out.println(pilha.vazia());
//		pilha.insere("Amanda");
//		String r1 = pilha.remove();
//		System.out.println(r1);
//		System.out.println(pilha);
//
//		pilha.insere("Artur");
//
//		System.out.println(pilha);
//		System.out.println(pilha.vazia());
//		
//		
//		Stack<String> stack = new Stack<String>();
//		stack.push("Lara");
//		stack.push("Heitor");
//		System.out.println(stack);
//		stack.pop();
//		System.out.println(stack);
//		
//		System.out.println(stack.peek());
//		System.out.println(stack);

		Stack<String> stack = new Stack<String>();
		stack.push("mauricio");
		stack.push("marcelo");
		stack.pop();
		stack.push("ghuilherme");
		stack.push("paulo");
		stack.pop();
		stack.push("joao");
		
		System.out.println(stack);

	}

}

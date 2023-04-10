package Filas;

import java.util.LinkedList;

import java.util.List;

public class Fila {

	private List<String> alunos = new LinkedList<String>();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return alunos.toString();
	}

	public void add(String aluno) {
		alunos.add(aluno);
	}
	
	public String remove() {
		return alunos.remove(0);
		
	}
	
	public boolean vazia(){
		return alunos.isEmpty();
	}
	
}

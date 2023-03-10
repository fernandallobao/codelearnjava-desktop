package br.com.projetofinal.desktop;

import br.com.projetofinal.gui.CursoGui;
import br.com.projetofinal.pojo.Competencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Competencia c1 = new Competencia();
		Competencia c2 = new Competencia();
		Competencia c3 = new Competencia();
		Competencia c4 = new Competencia();

		//Mostara a quantidade de objetos
		System.out.println("Total de objetos:"+Competencia.getContador());
		
		// como se faz array/vetor
		Object[] competencia = {"conhecimento","habilidade","atitude","IA"};
		
		System.out.println(competencia[0]);
		System.out.println(competencia[1]);
		System.out.println(competencia[2]);
		System.out.println(competencia[3]);
		
		new CursoGui().setVisible(true);

	}

}

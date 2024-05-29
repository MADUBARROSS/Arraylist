package atividades;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo2 {

	public static void main(String[] args) {
		
		String[] disciplinas = {"mat", "port", "his", "fís"};
		
		ArrayList<String>novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geo");
		novaLista.add("quim");

		for (String i: novaLista) {

			System.out.println("Disciplina: " + i);
		}

	}

}

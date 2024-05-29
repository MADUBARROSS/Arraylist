package atividades;

public class ForEach {

	public static void main(String[] args) {
		String[] names = new String[3];
		names [0] = "Isa";
		names [1] = "Kenvin";
		names [2] = "Maria";

		for(String name : names) {
			System.out.print(name + ", ");
		}

	}

}

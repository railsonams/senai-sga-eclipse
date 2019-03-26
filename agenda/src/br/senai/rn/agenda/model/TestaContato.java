package br.senai.rn.agenda.model;

public class TestaContato {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Maria", "2222-8888", "maria@terra.com.br");
		Contato c2 = new Contato("Maria", "2222-8888", "maria@terra.com.br");

		String resultado = "";
		
		if(c1.equals(c2)) {
			resultado = "IGUAIS";
		}else {
			resultado = "DIFERENTES";
		}
		
		System.out.println(resultado);
	}

}

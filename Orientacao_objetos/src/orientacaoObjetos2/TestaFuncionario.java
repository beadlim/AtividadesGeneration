package orientacaoObjetos2;

import orientacaoObjetos.ClientePessoaFisica;
import orientacaoObjetos.ClientePessoaJuridica;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		
		Gerente funcionario1 = new Gerente("Maria dos Santos", 25, "Gerente", "Rua dos Bobos", 123456789, "Vendas");

        Vendedor funcionario2 = new Vendedor("Joao Brasil", 15, "Vendedor", "Rua das Pedrinhas", 987654321, "Copacabana");


		funcionario1.visualizar();
		funcionario2.visualizar();
		funcionario1.validarIdade();
		funcionario2.validarIdade();
	}

}

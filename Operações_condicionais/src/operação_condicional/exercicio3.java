package operação_condicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		boolean respostaDoacao;
		
		System.out.println("Digite o nome do doador: ");
	    nome = leia.nextLine();
	    
	    System.out.println("\nDigite a idade do doador: ");
	    idade = leia.nextInt();
	    
	    System.out.println("Responda se é a primeira doação: ");
	    respostaDoacao = leia.nextBoolean();
	    
	    if (idade >=60 && idade <=69) {
	    	if (respostaDoacao) {
	    		System.out.println(nome + " não está apto(a) para doar sangue.");
	    	} else {
	    		System.out.println("O paciente está apto para doar.");
	    	} 
	    } else if (idade <18 || idade >69){
	    	}
	    }
	    
	    
	    
	    
	    
	}



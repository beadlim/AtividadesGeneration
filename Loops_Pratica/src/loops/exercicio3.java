package loops;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
				
				Scanner leitor = new Scanner (System.in);
				
				int idade, menores21 = 0; int maiores50 = 0;
				boolean resposta = true;
				
				
				while (resposta) {
					System.out.println("\nDigite uma idade: ");
					idade = leitor.nextInt();
					if (idade < 21 && idade > 0) {
						menores21++;
					} else if (idade > 50) {
						maiores50++;
						
					} else resposta = false;
					
				}
		        System.out.println("Total de pessoas menores de 21 anos: "+ menores21);
		        System.out.println("Total de pessoas maiores de 50 anos: "+ maiores50);
			}



	}


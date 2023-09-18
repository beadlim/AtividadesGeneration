package loops;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int numero = 0, multiplos=0, soma = 0, media = 0;
		
		do {
			System.out.println("Digite o número: ");
			numero = leitor.nextInt();
			
			 if (numero%3 == 0) {
			 soma += numero;
			 multiplos++;
			media = soma/multiplos;
			
		}

	} while (numero !=0);
	System.out.println("A media de todos os numeros multiplos de 3 é " + media);
}

}
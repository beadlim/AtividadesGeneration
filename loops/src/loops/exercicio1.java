package loops;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador;
        int numerosPares = 0; 
        int numerosImpares = 0; 

        System.out.println("Digite os 10 primeiros números: ");
        
        for (contador = 0; contador < 10; contador++) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            int numero = leitor.nextInt();
            
            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
        
	}
	
}
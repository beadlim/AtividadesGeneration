package Arrays_exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		        Scanner leia = new Scanner(System.in);

		        int numerosVetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		        boolean encontrado = false; 

		        System.out.println("Digite o número que deseja encontrar: ");
		        int numeroDesejado = leia.nextInt();

		        for (int indice = 0; indice < 10; indice++) {
		            if (numerosVetor[indice] == numeroDesejado) {
		                encontrado = true; 
		                System.out.println("O número " + numeroDesejado + " está localizado na posição " + indice);
		                break; 
		            }
		        }

		        if (!encontrado) {
		            System.out.println("O número " + numeroDesejado + " não foi encontrado");
		        }

		    }
	
	}


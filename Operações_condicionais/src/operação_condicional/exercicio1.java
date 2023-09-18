package operação_condicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner leia = new Scanner(System.in);
	
	int A, B, C;

    System.out.printf("Digite o numero A: ");
    A = leia.nextInt();
    
    System.out.printf("\nDigite o numero B: ");
    B = leia.nextInt();
    
    System.out.printf("\nDigite o numero C: ");
    C = leia.nextInt();
    
    if(A+B > C) {
    	System.out.println("\nA soma de A + B é maior que C");
    	
    } else if (A + B < C) {
    	System.out.println("A soma de A = B é menor que C");
    	
    } else {
    	System.out.println("A soma de A + B é igual a C");
    }
	}

}

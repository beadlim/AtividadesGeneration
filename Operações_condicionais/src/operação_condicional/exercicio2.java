package operação_condicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
        
    int n1;
    
    System.out.println("Digite o numero inteiro: ");
    n1 = leia.nextInt();
    
    if(n1%2 == 0) {
    	System.out.println("O número é par.");
    } else {
    	System.out.println("O número é ímpar.");
    }
    if(n1>0) {
    	System.out.println("O número é positivo.");
    } else {
    	System.out.println("O número é negativo.");
    }
    	
    }

}
	
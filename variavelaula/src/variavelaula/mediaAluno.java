package variavelaula;

import java.util.Scanner;

public class mediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);	
		
    float nota1, nota2, nota3, nota4, media;
    
    System.out.printf("\nDigite a nota 1: ");
    nota1 = leia.nextFloat();
    
    System.out.printf("\nDigite a nota 2: ");
    nota2 = leia.nextFloat();
    
    System.out.printf("\nDigite a nota 3: ");
    nota3 = leia.nextFloat();
    
    System.out.printf("\nDigite a nota 4: ");
    nota4 = leia.nextFloat();
    
    media = (nota1 + nota2 + nota3 + nota4)/4;
    
    System.out.printf("Sua média final é %.1f", media);
    
    	
    		
    
	}

}

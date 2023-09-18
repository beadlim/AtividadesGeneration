package variavelaula;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner leia = new Scanner(System.in);
    
    System.out.printf("Digite o seu salario: ");
    float salario = leia.nextFloat();
    
    System.out.printf("Digite o seu abono: ");
    float abono = leia.nextFloat();
    
    float novoSalario = salario + abono;
    
    System.out.printf("O seu novo salario é %.2f", novoSalario);
		 
	}

}

package variavelaula;

import java.util.Scanner;

public class salarioFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontosColaborador, salarioLiquido;
		
		System.out.printf("Digite o seu salario bruto: ");
	    salarioBruto = leia.nextFloat();
	    
	    System.out.printf("Digite o seu salario adicional: ");
	    adicionalNoturno = leia.nextFloat();
	    
	    System.out.printf("Digite as suas horas extras: ");
	    horasExtras = leia.nextFloat();
	    
	    System.out.printf("Digite os seus descontos de Colaborador: ");
	    descontosColaborador = leia.nextFloat();
	    
	    salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontosColaborador;
	    
	    System.out.printf("Seu salario final é R$ %.2f", salarioLiquido);
    
	
		
	}

}

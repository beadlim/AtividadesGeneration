package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
		
	Set<Integer> setValoresInteiros = new HashSet <Integer>();
	int numeroInteiro;
	boolean encontrado = false;
	
	setValoresInteiros.add(2); 
	setValoresInteiros.add(5);
	setValoresInteiros.add(1);
	setValoresInteiros.add(3);
	setValoresInteiros.add(4);
	setValoresInteiros.add(9);
	setValoresInteiros.add(7);
	setValoresInteiros.add(8);
	setValoresInteiros.add(10);
	setValoresInteiros.add(6);
	
    System.out.println("Digite um número inteiro: " );
    numeroInteiro = leitor.nextInt();
    
    for (Integer valor : setValoresInteiros) {
        if (valor == numeroInteiro) {
            encontrado = true;  
        }
    }
    {
    
    if (encontrado) {
    	System.out.println("O número " + numeroInteiro + " foi encontrado! ");
    	
    } else {
    	System.out.println("O número " + numeroInteiro + " não foi encontrado! ");
            }

        }
    }
  

    
    
        

	}


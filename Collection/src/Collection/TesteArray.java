package Collection;
import java.util.ArrayList;
import java.util.Collections;

public class TesteArray {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
	    
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
		
		notas.set(1, 6.0d);
		System.out.println("\nA nota 4 foi apagada: " + notas.toString());
		
		notas.remove(1);
		System.out.println("\nA lista está vazia? " + notas.isEmpty());
		
		System.out.println("\nO tamanho da lista é: " + notas.size());
		
		System.out.println("\nA maior nota da lista é: " + Collections.max(notas));
		
		System.out.println("\nA maior nota da lista é: " + Collections.min(notas));
		
		notas.clear();
		System.out.println("\nA lista está vazia: " + notas.toString());
		
		
	}

}

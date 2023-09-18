package EstruturaDeDados;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {{

		Queue<String> fila = new LinkedList<String>();
        Scanner leitor = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar um novo Cliente na fila.");
            System.out.println("2 - Listar todos os Clientes na fila.");
            System.out.println("3 - Chamar (retirar) uma pessoa da fila.");
            System.out.println("0 - O programa deve ser finalizado.");
            System.out.print("Escolha a opção: ");
            
            opcao = leitor.nextInt(); 

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do cliente: ");
                    leitor.skip("\\R?");
                    String nomeCliente = leitor.nextLine();
                    fila.add(nomeCliente);
                    System.out.println(nomeCliente + " foi adicionado na fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("Os clientes que estão na fila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("\nRetira da fila: " + fila.poll());
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }
}
	}
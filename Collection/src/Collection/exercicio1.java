package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<String>();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 5 cores: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("A cor " + (i + 1) + " solicitada: ");
            String cor = leitor.nextLine();
            cores.add(cor); 
        }

        System.out.println("Cores adicionadas: ");

        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("Cores adicionadas em ordem crescente: ");

        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
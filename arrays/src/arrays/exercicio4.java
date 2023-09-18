package arrays;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double notas[][] = new double[10][4];
        double media[] = new double[10];

        for (int indiceLinha = 0; indiceLinha < 10; indiceLinha++) {
            System.out.println("Digite as notas do " + (indiceLinha + 1) + "º aluno: ");

            for (int indiceColuna = 0; indiceColuna < 4; indiceColuna++) {
                System.out.print("Digite a nota do " + (indiceColuna + 1) + "º bimestre: ");
                notas[indiceLinha][indiceColuna] = leia.nextDouble();
                media[indiceLinha] += notas[indiceLinha][indiceColuna];
            }

            media[indiceLinha] /= 4;
        }
        
        System.out.println("Médias dos alunos:");


        for (int indiceLinha = 0; indiceLinha < 10; indiceLinha++) {
        	 System.out.printf("Aluno %d: %.1f\n", (indiceLinha + 1), media[indiceLinha]);
        }

    }
}
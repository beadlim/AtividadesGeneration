package Projeto1;
import java.util.Scanner;

public abstract class Calculadora {
    public abstract double calcular(double a, double b);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**********************************************");
            System.out.println("                                              ");
            System.out.println("          Bem-vindo à Calculadora!            ");
            System.out.println("                                              ");
            System.out.println("**********************************************");
            System.out.println("                                              ");
            System.out.println("                1. Soma                       ");
            System.out.println("             2. Subtração                     ");
            System.out.println("            3. Multiplicação                  ");
            System.out.println("              4. Divisão                      ");
            System.out.println("               5. Sair                        ");
            System.out.println("           Escolha uma opção:                 ");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Obrigado por usar a calculadora. Adeus!");
                break;
            }

            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            Calculadora operacao = null;

            switch (escolha) {
                case 1:
                    operacao = new Soma();
                    break;
                case 2:
                    operacao = new Subtracao();
                    break;
                case 3:
                    operacao = new Multiplicacao();
                    break;
                case 4:
                    operacao = new Divisao();
                    break;
            }

            try {
                double resultado = operacao.calcular(a, b);
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("Deseja realizar outra operação? (sim/nao): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("sim")) {
                System.out.println("Obrigado por usar a calculadora. Adeus!");
                break;
            }
        }
    }
}

package calculadoraPadrao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class calculadora {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> historico = new ArrayList<>();
        

	        while (true) {
	            System.out.println("\n********************************************");
	            System.out.println("                                              ");
	            System.out.println("          Bem-vindo à Calculadora!            ");
	            System.out.println("                                              ");
	            System.out.println("**********************************************");
	            System.out.println("                                              ");
	            System.out.println("               1. Soma                        ");
	            System.out.println("             2. Subtração                     ");
	            System.out.println("            3. Multiplicação                  ");
	            System.out.println("              4. Divisão                      ");
	            System.out.println("             5. Histórico                     ");
	            System.out.println("               6. Sair                        ");
	            System.out.println("            Escolha uma opção:                ");

	            int escolha = scanner.nextInt();

	            if (escolha == 6) {
	                System.out.println("Obrigado por usar a calculadora. Tchauzinho!");
	                break;
	            }
	            if (escolha == 5) {
	                exibirHistorico(historico);
	               System.out.print("Deseja realizar outra operação? (sim/nao): ");
	               String resposta = scanner.next();
	                if (!resposta.equalsIgnoreCase("sim")) {
	                    System.out.println("Obrigado por usar a calculadora. Tchauzinho!");
	                    break; 
	                } else {
	                    continue; 
	                }
	            }

	            if (escolha < 1 || escolha > 4) {
	                System.out.println("Opção inválida. Tente novamente.");
	                continue;
	            }

	            System.out.print("Digite o primeiro número: ");
	            double a = scanner.nextDouble();
	            System.out.print("Digite o segundo número: ");
	            double b = scanner.nextDouble();

	            calculadoraBase operacao = switch (escolha) {
	                case 1 -> new soma();
	                case 2 -> new subtracao();
	                case 3 -> new multiplicacao();
	                case 4 -> new divisao();
	                default -> null;
	            };

	            try {
	            	double resultado = operacao.calcular(a, b);
	            	String resultadoFinal = String.format("%.2f", resultado);
	            	 historico.add(String.valueOf(resultado));
	                 System.out.println("Resultado: " + resultadoFinal);
	            } catch (ArithmeticException e) {
	                System.out.println("Erro: " + e.getMessage());
	            }

	            System.out.print("Deseja realizar outra operação? (sim/nao): ");
	            String resposta = scanner.next();
	            if (!resposta.equalsIgnoreCase("sim")) {
	                System.out.println("Obrigado por usar a calculadora. Tchauzinho!");
	                break;
	            }
	        }
	}
	        public static void exibirHistorico(List<String> historico) {
	            System.out.println("Histórico de Operações:");
	            for (String operacao : historico) {
	                System.out.println(operacao);
	            }
	        }
	    
	    }
	



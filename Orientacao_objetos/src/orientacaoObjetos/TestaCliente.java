package orientacaoObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

	public class TestaCliente {

	    public static void main(String[] args) {
	       
	        List<Cliente> clientes = new ArrayList<>();

	        ClientePessoaFisica clientePF1 = new ClientePessoaFisica("Maria dos Santos", 30, "Engenheira", "maria@gmail.com", 123456789, "12345678901");
	        ClientePessoaFisica clientePF2 = new ClientePessoaFisica("João da Silva", 40, "Médico", "joao@gmail.com", 987654321, "98765432102");
	        ClientePessoaJuridica clientePJ1 = new ClientePessoaJuridica("Empresa X", 5, "Tecnologia", "empresa@gmail.com", 987654321, "9876543210001");
	        ClientePessoaJuridica clientePJ2 = new ClientePessoaJuridica("Empresa Y", 10, "Consultoria", "empresa2@gmail.com", 987654322, "9876543220002");

	        clientes.add(clientePF1);
	        clientes.add(clientePF2);
	        clientes.add(clientePJ1);
	        clientes.add(clientePJ2);

	        List<Cliente> clientesComIdadeMaiorQue30 = clientes.stream()
	            .filter(cliente -> cliente.getIdade() > 30)
	            .collect(Collectors.toList());

	        for (Cliente cliente : clientesComIdadeMaiorQue30) {
	            cliente.visualizar();
	        }
	    }
	}



package orientacaoObjetos;

public class ClientePessoaFisica extends ClasseCliente {

    private String cpf;

    public ClientePessoaFisica(String nome, int idade, String profissao, String email, int telefone, String cpf) {
        super(nome, idade, profissao, email, telefone);
        this.cpf = cpf;
        
        
    }

    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
    public void visualizar() {
        System.out.println("Dados do Cliente Pessoa Física:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + cpf);
    }

    @Override
	public void validarDados() {
	    try {
	        if (cpf == null || cpf.isEmpty()) {
	            throw new IllegalArgumentException("CPF inválido: Não é uma String.");
	        }
	    } catch (IllegalArgumentException e) {
	    	System.err.println("Exceção de CPF inválido: " + e.getMessage());
}
    }
    }

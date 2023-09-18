package orientacaoObjetos2;

public class Gerente extends ClasseFuncionario {
	
	private String setor;

	
	public Gerente(String nome, int idade, String cargo, String endereco, int telefone, String setor) {
		super(nome, idade, cargo, endereco, telefone);
		this.setor = setor;
	}
	

	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}



	
	
	@Override
    public void visualizar() {
        System.out.println("Dados do candidato a Gerente: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Setor: " + getSetor());

	} 
	@Override
	public void validarIdade() {
	    try {
	        if (getIdade() < 30) {
	            throw new ArithmeticException("A idade do gerente não atende aos requisitos mínimos!");
	        }
	    } catch (ArithmeticException e) {
	    	System.err.println("Exceção de idade inválida para Gerente: " + e.getMessage());
	    }
	}
	

	
}

package orientacaoObjetos;

public abstract class ClasseCliente implements Cliente {
	
	   private String nome;
	    private int idade;
	    private String profissao;
	    private String email;
	    private int telefone;
	    
		public ClasseCliente(String nome, int idade, String profissao, String email, int telefone) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.profissao = profissao;
			this.email = email;
			this.telefone = telefone;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

	    
}
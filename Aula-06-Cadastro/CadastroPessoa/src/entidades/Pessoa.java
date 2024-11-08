package entidades;

public class Pessoa {
	
	
	/*Cadastro de Pessoa:

	Pessoa:
	Nome
	Cpf

	Receba os dados do usuario e apresente os dados inseridos
	
*/	
	
	private String Nome;
	private String Cpf;	
	
	
	
	
	public String getNome() {
		
		
		return this.Nome;
					
	}
	
		public void setNome(String NomeRecebido) {
		
		this.Nome = NomeRecebido;
	}

	
	
	
	public String getCpf() {
		
		
		return this.Cpf;
	}
	
	public void setCpf(String CpfRecebe) {
		
		this.Cpf = CpfRecebe;
	}
	
	
	
}

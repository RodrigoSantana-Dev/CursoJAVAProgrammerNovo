package entidades;
import java.util.Scanner;
public class Principal {

	/* Cadastro de Pessoa:

		Pessoa:
		Nome
		Cpf

		Receba os dados do usuario e apresente os dados inseridos

		
		OBS: Utilize o encapsulamento

		Depure o codigo para entender se não souber me chama */
	
			
	public static void main(String[] args) {

		Pessoa PessoaRegistro = new Pessoa();
		Scanner entradaDados = new  Scanner(System.in);
		
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
		String DadosRecebido;
		
		System.out.println("Digite o seu Nome: ");
		DadosRecebido = entradaDados.next();
		PessoaRegistro.setNome(DadosRecebido);
		
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
		System.out.println("Digite o seu Cpf: ");
		DadosRecebido = entradaDados.next();
		PessoaRegistro.setCpf(DadosRecebido);
		
		
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
		System.out.println("    Resultado:");
		System.out.println(" Seu Nome é: " + PessoaRegistro.getNome());
		System.out.println(" Seu Cpf é: " + PessoaRegistro.getCpf());
		
		
		
	}
	

}

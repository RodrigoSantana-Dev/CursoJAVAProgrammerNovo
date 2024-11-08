package principal;

import java.util.Scanner;

import entidades.Pessoa;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa PessoaRegistro = new Pessoa();
		Scanner recebeDados = new  Scanner(System.in);
		
		String entradaDados;
//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
		System.out.println("Digite o nome da Pessoa:");
		entradaDados = recebeDados.next();	
		
		PessoaRegistro.setNome(entradaDados);
		System.out.println(PessoaRegistro.getNome());
		

//¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨
		
		
		System.out.println(entradaDados + " Digite o seu Cpf:");
		entradaDados = recebeDados.next();	
		
		PessoaRegistro.setCpf(entradaDados);
		System.out.println(PessoaRegistro.getCpf());
		
		
		
		
		
		
		
	}
	
	

}

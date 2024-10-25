import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		
               // Inicializando o Objeto chamado Programador
		
		Programador programador = new Programador();
		AdmBanco admBanco = new AdmBanco();
		
               // Objeto para receber Dados pelo console 
		
		Scanner entradaDados = new Scanner(System.in);
		
//*************************Cadastro do Programador ****************************
		
		System.out.println("##### CADASTRO DO PROGRAMADOR #####");
		
		System.out.println("Digite o nome: ");
		programador.nome = entradaDados.next();	
		
		System.out.println(programador.nome + " Qual é Linguagem de programação");
		programador.linguagem = entradaDados.next();
		
		System.out.println("*********RESULTADO************");

		System.out.println(programador.nome);
		System.out.println(programador.linguagem);
		
		
//*************************Cadastro do AdmBanco ****************************
		
		System.out.println("##### CADASTRO DO AdmBanco #####");

		
		System.out.println("Digite o seu Nome: ");
		admBanco.nome = entradaDados.next();

		System.out.println(admBanco.nome + " Qual é o Tipo De Banco: ");
		admBanco.TipoDeBancoDados = entradaDados.next();

		System.out.println("*********RESULTADO************");

		System.out.println(admBanco.nome);
		System.out.println(admBanco.TipoDeBancoDados);
		
		
	}

}

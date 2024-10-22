import java.util.Scanner;

public class Principal{

  public static void main (String[] args){
	

	// Inicializar o objeto	

	Programador programador = new Programador();
	AdmBanco admBanco = new AdmBanco();

	// Objeto para receber dados atraves do console
	
	Scanner entradaDados = new Scanner(System.in);

	System.out.println("***Cadastro de Programador***");
	System.out.println("******************************");

	System.out.println("Digite seu Nome:");
	programador.nome = entradaDados.next();
	System.out.println("******************************");

	System.out.println("Qual sua linguagem:");
	programador.linguagem = entradaDados.next();
	System.out.println("******************************");

	System.out.println(programador.nome);
 	System.out.println(programador.linguagem);
 
 	System.out.println("******************************");
 	System.out.println("******************************");
	System.out.println("***Cadastro do AdmBanco***");
	System.out.println("******************************");

	
	System.out.println("Digite seu Nome:");
	admBanco.nome = entradaDados.next();
	System.out.println("******************************");

	System.out.println("Tipo de Banco:");
	admBanco.TipoDeBanco = entradaDados.next();
	System.out.println("******************************");

	System.out.println(admBanco.nome);
 	System.out.println(admBanco.TipoDeBanco);
 
	System.out.println("******************************");
 	System.out.println("******************************");



  }

}
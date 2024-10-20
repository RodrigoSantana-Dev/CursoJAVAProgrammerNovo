import java.util.Scanner;

class principal {

	public static void main (String [] args){

	System.out.println("Digite seu nome:");
	
	Scanner entradaDados = new Scanner(System.in);
	String nome = entradaDados.next();


	System.out.println("Digite sua Idade:");
	String Idade = entradaDados.next();

	System.out.println("Digite seu endereco:");
	String endereco = entradaDados.next();

	System.out.println("O nome digitado foi: " + nome  );
	System.out.println("A Idade digitada foi: " + Idade );
	System.out.println("O endereco digitado foi: " + endereco );
	

	
	


   }

}
package principal;

import java.util.Scanner;

public class Principail {

	public static void main(String[] args) {
		

		double numero1;
		double numero2;
		

		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("'''''Digitar o primeiro numero:'''''''");
		numero1 = Integer.parseInt(entradaDados.next());
	
		System.out.println("'''''Digitar o segundo numero:'''''''");
		numero2 = Integer.parseInt(entradaDados.next());
	
		
		System.out.println("'''Os Numeros digitado foi:'''''''");
		System.out.println(numero1 + numero2 );
	}

}

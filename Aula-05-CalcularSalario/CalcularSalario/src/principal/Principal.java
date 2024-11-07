package principal;

import java.util.Scanner;

import entidades.ProfessorJunior;
import entidades.ProfessorPleno;
import entidades.ProfessorSenior;
import servicos.Calcular;

public class Principal {

	public static void main(String[] args) {

		ProfessorPleno ProPleno = new ProfessorPleno();
		ProfessorJunior ProJunior = new ProfessorJunior();
		ProfessorSenior ProSenior = new ProfessorSenior();
		Scanner entradaDados = new Scanner(System.in);
		Calcular Calcular1 = new Calcular();
		
		
		
		System.out.println("'''''''Cadastro de Professor'''''''");
	    //-------------------------------------------------------------------------------------------
		System.out.println("'''''''Professor Senior'''''''");
		System.out.println("Qual é o seu nome:");
		ProSenior.Nome = entradaDados.next();
		System.out.println("Qual é o seu Cpf:");
		ProSenior.Cpf = entradaDados.next();
		System.out.println("Quantidade de Horas Trabalhadas:");
		ProSenior.qtdHorasTrabalhadas =  Integer.parseInt(entradaDados.next());
		
		//---------Inicializando variavel com seu valor chunbado (Boas praticas)--------------------
		
		
		ProSenior.valorHoratrabalhada = 100;
		ProSenior.irSenior = 10;
		
		//---------Calcular Salario-----------------------------------------------------------------	

		ProSenior.SalarioBruto = Calcular1.SalarioCalcula(ProSenior.qtdHorasTrabalhadas,ProSenior.valorHoratrabalhada);
		ProSenior.SalarioLiquido = Calcular1.desconto(	ProSenior.SalarioBruto,ProSenior.irSenior );
		
		
		System.out.println("O Salario do Professor Senior é:" + ProSenior.SalarioBruto);
		System.out.println("O Salario liquido do Professor Senior é:" + ProSenior.SalarioLiquido);

    	//-------------------------------------------------------------------------------------------	

		
		
		System.out.println("'''''''Cadastro de Professor'''''''");
	    //-------------------------------------------------------------------------------------------
		System.out.println("'''''''Professor Junior'''''''");
    	//-------------------------------------------------------------------------------------------	
		System.out.println("Qual é o seu nome:");
		ProJunior.Nome = entradaDados.next();
		System.out.println("Qual é o seu Cpf:");
		ProJunior.Cpf = entradaDados.next();
		System.out.println("Quantidade de Horas Trabalhadas:");
		ProJunior.qtdHorasTrabalhadas =  Integer.parseInt(entradaDados.next());
		
		//---------Inicializando variavel com seu valor chunbado (Boas praticas)--------------------

		ProJunior.valorHoratrabalhada = 60;
		ProJunior.IrJunior = 5;
		
		// Calcular salario 
		
		ProJunior.SalarioBruto = Calcular1.SalarioCalcula(ProJunior.qtdHorasTrabalhadas, ProJunior.valorHoratrabalhada);
		ProJunior.SalarioLiquido = Calcular1.desconto(ProJunior.SalarioBruto, ProJunior.IrJunior);
		
		
		
		
		System.out.println("O Salario do Professor Junior é:" + ProJunior.SalarioBruto);
		System.out.println("O Salario liquido do Professor Junior é:" + ProJunior.SalarioLiquido);



		System.out.println("'''''''Cadastro de Professor'''''''");
	    //-------------------------------------------------------------------------------------------
		System.out.println("'''''''Professor Pleno'''''''");
    	//-------------------------------------------------------------------------------------------	
		System.out.println("Qual é o seu nome:");
		ProPleno.Nome = entradaDados.next();
		System.out.println("Qual é o seu Cpf:");
		ProPleno.Cpf = entradaDados.next();
		System.out.println("Quantidade de Horas Trabalhadas:");
		ProPleno.qtdHorasTrabalhadas =  Integer.parseInt(entradaDados.next());
		
		//---------Inicializando variavel com seu valor chunbado (Boas praticas)--------------------

		ProPleno.valorHoratrabalhada = 80;
		ProPleno.irPleno = 7;
		
		// Calcular salario 
		
		ProPleno.SalarioBruto = Calcular1.SalarioCalcula(ProPleno.qtdHorasTrabalhadas, ProPleno.valorHoratrabalhada);
		ProPleno.SalarioLiquido = Calcular1.desconto(ProPleno.SalarioBruto,ProPleno.irPleno);
		
		
		
		
		System.out.println("O Salario do Professor Pleno é:" + ProPleno.SalarioBruto);
		System.out.println("O Salario liquido do Professor Pleno é:" + ProPleno.SalarioLiquido);

		
		
		
	}

}

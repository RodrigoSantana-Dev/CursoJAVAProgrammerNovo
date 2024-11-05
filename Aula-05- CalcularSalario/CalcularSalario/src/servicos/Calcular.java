package servicos;

public class Calcular {

	public double SalarioCalcula(int qtdHorasTrabalhadas,  double valorHoratrabalhada) {
	
		double SalarioTemp;
		SalarioTemp =   valorHoratrabalhada * qtdHorasTrabalhadas;
		
		
	return SalarioTemp;
	
  }
	
	public double desconto (double SalarioBruto, double irSenior) {
	
		double porcentagem = irSenior /100;
		double ValorDesc = SalarioBruto * porcentagem;
		
		double SaLiquido = SalarioBruto - ValorDesc;
		
	return SaLiquido;
	}
	
}
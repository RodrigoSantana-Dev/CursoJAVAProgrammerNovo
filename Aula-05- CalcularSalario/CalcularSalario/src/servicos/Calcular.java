
package servicos;

public class Calcular {

	public double SalarioCalcula(int qtdHorasTrabalhadas,  double valorHoratrabalhada) {
	
		double SalarioTemp =   valorHoratrabalhada * qtdHorasTrabalhadas;
		double ValorBonus = 25;
		double porcentagem = ValorBonus /100;
		double ValorDoBonus = SalarioTemp * porcentagem;
		
		if (qtdHorasTrabalhadas > 500);
			
		SalarioTemp = SalarioTemp + ValorDoBonus;
		
	return SalarioTemp;
	
  }
	
	public double desconto (double SalarioBruto, double irSenior) {
	
		double porcentagem = irSenior /100;
		double ValorDesc = SalarioBruto * porcentagem;
		
		double SaLiquido = SalarioBruto - ValorDesc;
		
	return SaLiquido;
	}
	
}

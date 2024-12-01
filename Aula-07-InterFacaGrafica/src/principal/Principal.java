package principal;

import javax.swing.JOptionPane;

import entidades.Celular;
import entidades.Televisao;
public class Principal {

	public static void main(String[] args) {

	//	System.out.println("Rodou");
		
		
		Celular celular = new Celular();
		Televisao televisao = new Televisao();
		
		
		String recebeDados = JOptionPane.showInputDialog("Digite o Modelo do seu Celular: ");
		
		JOptionPane.showMessageDialog(null, recebeDados + " É Modelo do seu aparelho ");
		
		
		recebeDados = JOptionPane.showInputDialog("Qualidade de imagem da Televisao: ");
		
		JOptionPane.showMessageDialog(null, "A Qualidade da imagem é: " + recebeDados);
		
	}

}

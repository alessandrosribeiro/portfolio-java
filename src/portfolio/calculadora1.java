package portfolio;

import javax.swing.*;

public class calculadora1 {

		public static void main(String[] args) {
			
			String numA = JOptionPane.showInputDialog(null, "Digite o n�mero:");
			String numB = JOptionPane.showInputDialog(null, "Digite o n�mero:");
			double a = Double.parseDouble(numA);
			double b = Double.parseDouble(numB);
			//variaveis
			double soma = a + b;
			double sub = a - b;
			double mult = a * b;
			double div = a / b;
			
			JOptionPane.showMessageDialog(null, "Soma: " + soma + "\n" + "Subtra��o: " + sub + "\n" + "Multiplica��o: " + mult + "\n" + "Divis�o: " + div);
	}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

}		
	


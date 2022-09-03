package portfolio;

import javax.swing.*;

public class calculadora1 {

		public static void main(String[] args) {
			
			String numA = JOptionPane.showInputDialog(null, "Digite o número:");
			String numB = JOptionPane.showInputDialog(null, "Digite o número:");
			double a = Double.parseDouble(numA);
			double b = Double.parseDouble(numB);
			//variaveis
			double soma = a + b;
			double sub = a - b;
			double mult = a * b;
			double div = a / b;
			
			JOptionPane.showMessageDialog(null, "Soma: " + soma + "\n" + "Subtração: " + sub + "\n" + "Multiplicação: " + mult + "\n" + "Divisão: " + div);
	}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

}		
	


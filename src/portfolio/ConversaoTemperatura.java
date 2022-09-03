package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class ConversaoTemperatura extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtF;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoTemperatura dialog = new ConversaoTemperatura();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConversaoTemperatura() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ConversaoTemperatura.class.getResource("/img/temperatura48x48.png")));
		setTitle("Convers\u00E3o de Temperatura");
		setBounds(100, 100, 433, 275);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Fahrenheit");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 40, 85, 14);
		getContentPane().add(lblNewLabel);

		txtF = new JTextField();
		txtF.setBounds(161, 39, 86, 20);
		getContentPane().add(txtF);
		txtF.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Celsius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 92, 66, 14);
		getContentPane().add(lblNewLabel_1);

		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(161, 91, 86, 20);
		getContentPane().add(txtC);
		txtC.setColumns(10);

		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				converter();
			}
		});
		btnNewButton.setBounds(273, 38, 89, 23);
		getContentPane().add(btnNewButton);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(ConversaoTemperatura.class.getResource("/img/limpar48x48.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(182, 152, 48, 48);
		getContentPane().add(btnLimpar);

	} // fim do construtor

	void converter() {
		// variaveis
		double c, f;
		// entrada
		f = Double.parseDouble(txtF.getText());
		// processamento
		c = (5 * (f - 32)) / 9;
		// saida
		// a linha abaixo exibe o conteudo da variavel c na caixa de texto (é necessario
		// converter para String)
		txtC.setText(String.valueOf(c));
	}

	void limpar() {
		txtF.setText(null);
		txtC.setText(null);
		txtF.requestFocus();
	}
}
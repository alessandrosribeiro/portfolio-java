package portfolio;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gasolina extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtEtanol;
	private JTextField txtGasolina;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasolina dialog = new Gasolina();
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
	public Gasolina() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Gasolina.class.getResource("/img/gasolina48x48.png")));
		setTitle("Etanol x Gasolina");
		setBounds(100, 100, 434, 372);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Etanol");
		lblNewLabel.setBounds(127, 12, 96, 14);
		getContentPane().add(lblNewLabel);

		txtEtanol = new JTextField();
		txtEtanol.setBounds(209, 9, 80, 20);
		getContentPane().add(txtEtanol);
		txtEtanol.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Gasolina");
		lblNewLabel_1.setBounds(127, 40, 96, 14);
		getContentPane().add(lblNewLabel_1);

		txtGasolina = new JTextField();
		txtGasolina.setBounds(209, 37, 80, 20);
		getContentPane().add(txtGasolina);
		txtGasolina.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Gasolina.class.getResource("/img/calcular48x48.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(127, 90, 48, 48);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("R$");
		lblNewLabel_2.setBounds(192, 12, 46, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("R$");
		lblNewLabel_2_1.setBounds(192, 40, 46, 14);
		getContentPane().add(lblNewLabel_2_1);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Gasolina.class.getResource("/img/PonteiroNeutro.png")));
		lblStatus.setBounds(50, 162, 320, 160);
		getContentPane().add(lblStatus);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(Gasolina.class.getResource("/img/limpar48x48.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(230, 90, 48, 48);
		getContentPane().add(btnLimpar);

	}// fim do construtor

	void calcular() {
		if (txtEtanol.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Valor do Etanol");
			txtEtanol.requestFocus();

		} else if (txtGasolina.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o Valor da Gasolina");
			txtGasolina.requestFocus();

		} else {

			// variaveis
			double etanol, gasolina;
			// entrada
			etanol = Double.parseDouble(txtEtanol.getText());
			gasolina = Double.parseDouble(txtGasolina.getText());
			// processamento/saida

			if (etanol < 0.7 * gasolina) {
				// JOptionPane.showMessageDialog(null, "Recomendado Etanol", "calculo",
				// JOptionPane.DEFAULT_OPTION);
				lblStatus.setIcon(new ImageIcon(Gasolina.class.getResource("/img/PonteiroEtanol.png")));

			} else {
				// JOptionPane.showMessageDialog(null, "Recomendado Gasolina", "calculo",
				// JOptionPane.DEFAULT_OPTION);
				lblStatus.setIcon(new ImageIcon(Gasolina.class.getResource("/img/PonteiroGasolina.png")));
			}
		}
	}

				
		void limpar() {
			txtEtanol.setText(null);
			txtGasolina.setText(null);
			txtEtanol.requestFocus();
		}
}
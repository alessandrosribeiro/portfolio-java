package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Eleitor extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor dialog = new Eleitor();
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
	public Eleitor() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Eleitor.class.getResource("/img/vota\u00E7\u00E3o48x48.png")));
		setTitle("Eleitor");
		setBounds(100, 100, 330, 282);
		getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(85, 44, 46, 14);
		getContentPane().add(lblNewLabel_1);

		txtIdade = new JTextField();
		txtIdade.setBounds(132, 41, 86, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(108, 113, 89, 23);
		getContentPane().add(btnNewButton);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(Eleitor.class.getResource("/img/limpar48x48.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(132, 157, 48, 48);
		getContentPane().add(btnLimpar);

	}

	void calcular() {
			//variaveis
			int idade;
			//entrada
			idade = Integer.parseInt(txtIdade.getText());
			//processamento/saida
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Proibido Votar");
				
			} else if (idade == 16 || idade == 17 || idade > 70) {
				JOptionPane.showMessageDialog(null, "Voto Facultativo");
				
			} else {
				JOptionPane.showMessageDialog(null, "Voto Obrigatório");
			}
		}
			
		void limpar() {
		txtIdade.setText(null);
		txtIdade.requestFocus();
	}	
}

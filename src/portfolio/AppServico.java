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

public class AppServico extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtRemuneracao;
	private JTextField txtCusto;
	private JTextField txtCarga;
	private JTextField txtHora;
	private JTextField txtExtimativa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppServico dialog = new AppServico();
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
	public AppServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AppServico.class.getResource("/img/calcularhora48x48.png")));
		setTitle("Calculo do Valor da Hora de Servi\u00E7o");
		setResizable(false);
		setBounds(100, 100, 350, 413);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Remunera\u00E7\u00E3o");
		lblNewLabel.setBounds(29, 35, 134, 14);
		getContentPane().add(lblNewLabel);

		txtRemuneracao = new JTextField();
		txtRemuneracao.setBounds(178, 35, 134, 20);
		getContentPane().add(txtRemuneracao);
		txtRemuneracao.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Custo Operacional");
		lblNewLabel_1.setBounds(29, 80, 134, 14);
		getContentPane().add(lblNewLabel_1);

		txtCusto = new JTextField();
		txtCusto.setBounds(178, 77, 134, 20);
		getContentPane().add(txtCusto);
		txtCusto.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Carga Horaria Mensal");
		lblNewLabel_2.setBounds(28, 125, 135, 14);
		getContentPane().add(lblNewLabel_2);

		txtCarga = new JTextField();
		txtCarga.setBounds(178, 122, 134, 20);
		getContentPane().add(txtCarga);
		txtCarga.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(AppServico.class.getResource("/img/salvar48x48.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularHora();
			}
		});
		btnNewButton.setBounds(50, 150, 48, 48);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Valor Hora de Servi\u00E7o");
		lblNewLabel_3.setBounds(29, 223, 134, 14);
		getContentPane().add(lblNewLabel_3);

		txtHora = new JTextField();
		txtHora.setEditable(false);
		txtHora.setBounds(178, 220, 67, 20);
		getContentPane().add(txtHora);
		txtHora.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Extimativa Horas");
		lblNewLabel_4.setBounds(29, 276, 134, 14);
		getContentPane().add(lblNewLabel_4);

		txtExtimativa = new JTextField();
		txtExtimativa.setBounds(178, 273, 67, 20);
		getContentPane().add(txtExtimativa);
		txtExtimativa.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(AppServico.class.getResource("/img/calcular48x48.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularServico();
			}
		});
		btnCalcular.setBounds(50, 316, 48, 48);
		getContentPane().add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(AppServico.class.getResource("/img/limpar48x48.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(197, 316, 48, 48);
		getContentPane().add(btnLimpar);
		

	}// algoritimo 1

	// variasveis goblais
	double hora;

	// metodo usado para calcular hora
	void calcularHora() {
		// variaveis
		double remuneracao, custo, carga;
		// entrada
		remuneracao = Double.parseDouble(txtRemuneracao.getText());
		custo = Double.parseDouble(txtCusto.getText());
		carga = Double.parseDouble(txtCarga.getText());
		// processamento
		hora = (remuneracao + 0.3 * remuneracao + custo + 0.2 * remuneracao) / carga;
		// saida
		txtHora.setText(String.valueOf(hora));
	}// algoritimo 2
	// metodo usado para calcular hora
	void calcularServico() {
		// variaveis
		double Extimativa, valor;
		// entrada
		Extimativa = Double.parseDouble(txtExtimativa.getText());
		// processamento
		valor = Extimativa * hora;
		// saida
		JOptionPane.showMessageDialog(null, "Total do Serviço: " + valor, "Relatório", JOptionPane.DEFAULT_OPTION);

	}// fim do construtor

	void limpar() {
		txtRemuneracao.setText(null);
		txtCusto.setText(null);
		txtCarga.setText(null);
		txtHora.setText(null);
		txtExtimativa.setText(null);
		txtRemuneracao.requestFocus();
	}
}// fim do codigo

package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CalculoPorcentagem extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtP;
	private JTextField txtN;
	private JTextField txtT;
	private JTextField txtC;
	private JTextField txtL;
	private JTextField txtV;
	private JTextField txtSub;
	private JTextField txtDesconto;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoPorcentagem dialog = new CalculoPorcentagem();
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
	public CalculoPorcentagem() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoPorcentagem.class.getResource("/img/desconto48x48.png")));
		setTitle("Calculos");
		setBounds(100, 100, 450, 407);
		getContentPane().setLayout(null);

		txtP = new JTextField();
		txtP.setBounds(53, 40, 50, 20);
		getContentPane().add(txtP);
		txtP.setColumns(10);

		JLabel lblNewLabel = new JLabel("% de");
		lblNewLabel.setBounds(113, 43, 46, 14);
		getContentPane().add(lblNewLabel);

		txtN = new JTextField();
		txtN.setBounds(150, 40, 50, 20);
		getContentPane().add(txtN);
		txtN.setColumns(10);

		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setBounds(330, 40, 60, 20);
		getContentPane().add(txtT);
		txtT.setColumns(10);

		JButton btnNewButton = new JButton("=");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				converter();
			}
		});
		btnNewButton.setBounds(234, 40, 80, 20);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Custo x Venda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(174, 102, 101, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Calculo de Porcentagem");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(150, 11, 141, 15);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Custo");
		lblNewLabel_3.setBounds(63, 153, 50, 14);
		getContentPane().add(lblNewLabel_3);

		txtC = new JTextField();
		txtC.setBounds(53, 127, 50, 20);
		getContentPane().add(txtC);
		txtC.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Lucro");
		lblNewLabel_4.setBounds(164, 150, 36, 14);
		getContentPane().add(lblNewLabel_4);

		txtL = new JTextField();
		txtL.setBounds(150, 127, 50, 20);
		getContentPane().add(txtL);
		txtL.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(201, 130, 23, 14);
		getContentPane().add(lblNewLabel_5);

		JButton btnNewButton_1 = new JButton("Cobrar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Venda();
			}
		});
		btnNewButton_1.setBounds(234, 127, 80, 20);
		getContentPane().add(btnNewButton_1);

		txtV = new JTextField();
		txtV.setEditable(false);
		txtV.setBounds(330, 127, 60, 20);
		getContentPane().add(txtV);
		txtV.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Calcular Desconto");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(174, 198, 101, 14);
		getContentPane().add(lblNewLabel_6);

		txtSub = new JTextField();
		txtSub.setBounds(53, 227, 50, 20);
		getContentPane().add(txtSub);
		txtSub.setColumns(10);

		txtDesconto = new JTextField();
		txtDesconto.setBounds(150, 227, 50, 20);
		getContentPane().add(txtDesconto);
		txtDesconto.setColumns(10);

		JButton btnNewButton_2 = new JButton("Total");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desconto();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBounds(234, 226, 80, 20);
		getContentPane().add(btnNewButton_2);

		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(330, 227, 60, 20);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Sub Total");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(57, 250, 56, 14);
		getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_5_1 = new JLabel("%");
		lblNewLabel_5_1.setBounds(201, 230, 23, 14);
		getContentPane().add(lblNewLabel_5_1);

		JLabel lblNewLabel_8 = new JLabel("Desconto");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(154, 250, 60, 14);
		getContentPane().add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("R$");
		lblNewLabel_9.setBounds(36, 130, 23, 14);
		getContentPane().add(lblNewLabel_9);

		JLabel lblNewLabel_9_1 = new JLabel("R$");
		lblNewLabel_9_1.setBounds(36, 230, 23, 14);
		getContentPane().add(lblNewLabel_9_1);

		JLabel lblNewLabel_9_1_1 = new JLabel("-");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1_1.setBounds(124, 230, 23, 14);
		getContentPane().add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("+");
		lblNewLabel_9_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1_1_1.setBounds(122, 128, 23, 14);
		getContentPane().add(lblNewLabel_9_1_1_1);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(CalculoPorcentagem.class.getResource("/img/limpar48x48.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(190, 288, 48, 48);
		getContentPane().add(btnLimpar);

	}// Calcular Porcentagem

	void converter() {
		// variaveis
		double p, n, t;
		// entrada
		p = Double.parseDouble(txtP.getText());
		n = Double.parseDouble(txtN.getText());
		// processamento
		t = (p * n) / 100;
		// saida
		txtT.setText(String.valueOf(t));

	}// Calcular valor de venda

	void Venda() {
		// variaveis
		double c, l, v;
		// entrada
		c = Double.parseDouble(txtC.getText());
		l = Double.parseDouble(txtL.getText());
		// processamento
		v = c + ((c * l) / 100);
		// saida
		txtV.setText(String.valueOf(v));

	}// Calcular Desconto

	void Desconto() {
		// variaveis
		double sub, desconto, total;
		// entrada
		sub = Double.parseDouble(txtSub.getText());
		desconto = Double.parseDouble(txtDesconto.getText());
		// processamento
		total = sub - ((desconto / 100) * sub);
		// saida
		txtTotal.setText(String.valueOf(total));

	}
	
	void limpar() {
		txtP.setText(null);
		txtN.setText(null);
		txtC.setText(null);
		txtL.setText(null);
		txtT.setText(null);
		txtV.setText(null);
		txtSub.setText(null);
		txtDesconto.setText(null);
		txtTotal.setText(null);
		txtP.requestFocus();		
	}
		
	
}

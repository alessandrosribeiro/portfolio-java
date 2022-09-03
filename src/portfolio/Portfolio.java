package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portfolio() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				//evento ativar janela
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
				lblStatus.setText(formatador.format(data));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Botão Sobre
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/sobre.png")));
		btnNewButton_1.setToolTipText("Sobre");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no botão
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(291, 384, 70, 70);
		contentPane.add(btnNewButton_1);

		// Botão Media
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Calculadora da m\u00E9dia");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(25, 11, 70, 70);
		contentPane.add(btnNewButton_2);

		// Botão Temperatura
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/temperatura.png")));
		btnNewButton_3.setToolTipText("Convers\u00E3o de Temperatura");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversao = new ConversaoTemperatura();
				conversao.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_3.setBounds(117, 11, 70, 70);
		contentPane.add(btnNewButton_3);

		// Botão Calculo de Porcentagem
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/desconto.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPorcentagem calculos = new CalculoPorcentagem();
				calculos.setVisible(true);
			}
		});
		btnNewButton_4.setToolTipText("Calculo de Porcentagem");
		btnNewButton_4.setBounds(291, 11, 70, 70);
		contentPane.add(btnNewButton_4);

		// Botão APP Serviço
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setToolTipText("Calculo Valor Hora de Servi\u00E7o");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppServico servico = new AppServico();
				servico.setVisible(true);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/calculahora.png")));
		btnNewButton_5.setBounds(25, 110, 70, 70);
		contentPane.add(btnNewButton_5);

		// Botão APP Combustivel
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setToolTipText("Vantagem Alcool ou Gasolina");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/gasolina.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gasolina gasolina = new Gasolina();
				gasolina.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(117, 110, 70, 70);
		contentPane.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Necessidade Vota\u00E7\u00E3o");
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/vota\u00E7\u00E3o.png")));
		btnNewButton_7.setBounds(205, 110, 70, 70);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setToolTipText("Jogo Jokenpo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaJogo telajogo = new TelaJogo();
				telajogo.setVisible(true);

			}
		});
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/m\u00E3o64x64.png")));
		btnNewButton.setBounds(205, 11, 70, 70);
		contentPane.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 462, 385, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblStatus = new JLabel("New Label");
		lblStatus.setBounds(0, 0, 385, 31);
		panel.add(lblStatus);
		lblStatus.setForeground(SystemColor.text);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setToolTipText("Cartas");
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/img/carta68x68.png")));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carta carta = new Carta();
				carta.setVisible(true);				
			}
		});
		btnNewButton_8.setBounds(293, 112, 70, 70);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setToolTipText("CEP");
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/img/cep68x68.png")));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cep cep = new Cep();
				cep.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(25, 217, 70, 70);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setToolTipText("Tabuada");
		btnNewButton_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_10.setIcon(new ImageIcon(Portfolio.class.getResource("/img/tabuada68x68.png")));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnNewButton_10.setBounds(117, 217, 70, 70);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setToolTipText("IMC");
		btnNewButton_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_11.setIcon(new ImageIcon(Portfolio.class.getResource("/img/imc64x64.png")));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIMC telaimc = new TelaIMC();
				telaimc.setVisible(true);
			}
		});
		btnNewButton_11.setBounds(205, 217, 70, 70);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_12.setToolTipText("Calculadora");
		btnNewButton_12.setIcon(new ImageIcon(Portfolio.class.getResource("/img/calculadora64x64.png")));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora1 calculadora = new calculadora1();
				calculadora.setVisible(true);
			}
		});
		btnNewButton_12.setBounds(296, 217, 70, 70);
		contentPane.add(btnNewButton_12);

	}// fim do construtor
}// fim do codigo

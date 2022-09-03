package portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class TelaJogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnPedra;
	private JRadioButton rdbtnPapel;
	private JRadioButton rdbtnTesoura;
	private JLabel lblPC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
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
	public TelaJogo() {
		setTitle("Jokenpo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pedra.png")));
		lblNewLabel.setBounds(35, 11, 64, 64);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/papel.png")));
		lblNewLabel_1.setBounds(128, 11, 64, 64);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/tesoura.png")));
		lblNewLabel_2.setBounds(212, 11, 64, 64);
		contentPane.add(lblNewLabel_2);

		lblPC = new JLabel("");
		lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pc.png")));
		lblPC.setBounds(81, 231, 171, 139);
		contentPane.add(lblPC);

		rdbtnPedra = new JRadioButton("");
		buttonGroup.add(rdbtnPedra);
		rdbtnPedra.setBackground(Color.WHITE);
		rdbtnPedra.setBounds(57, 82, 21, 23);
		contentPane.add(rdbtnPedra);

		rdbtnPapel = new JRadioButton("");
		buttonGroup.add(rdbtnPapel);
		rdbtnPapel.setBackground(Color.WHITE);
		rdbtnPapel.setBounds(150, 82, 21, 23);
		contentPane.add(rdbtnPapel);

		rdbtnTesoura = new JRadioButton("");
		buttonGroup.add(rdbtnTesoura);
		rdbtnTesoura.setBackground(Color.WHITE);
		rdbtnTesoura.setBounds(233, 82, 21, 23);
		contentPane.add(rdbtnTesoura);

		JButton btnPOW = new JButton("POW");
		btnPOW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pow();
			}
		});
		btnPOW.setBounds(117, 157, 89, 23);
		contentPane.add(btnPOW);
	}// fim do construtor

	void pow() {
		// validação
		if (!rdbtnPedra.isSelected() && !rdbtnPapel.isSelected() && !rdbtnTesoura.isSelected()) {
			JOptionPane.showMessageDialog(null, "Selecione uma opção");

		} else {
			// logica principal
			Random random = new Random();
			int pc = random.nextInt(3);
			// System.out.println(pc);
			// substituir por icone
			switch (pc) {
			case 0:
				lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpapel.png")));
				break;
			case 1:
				lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpedra.png")));
				break;
			case 2:
				lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pctesoura.png")));
				break;
			}
			// comparações para detectar empate ou vencedor
			if ((rdbtnPedra.isSelected() && pc == 1) || (rdbtnPapel.isSelected() && pc == 0)
					|| (rdbtnTesoura.isSelected() && pc == 2)) {
				JOptionPane.showMessageDialog(null, "EMPATE");

			} else if ((rdbtnPedra.isSelected() && pc == 2) || (rdbtnPapel.isSelected() && pc == 1)
					|| (rdbtnTesoura.isSelected() && pc == 0)) {
				JOptionPane.showMessageDialog(null, "JOGADOR VENCEU");
			} else {
				JOptionPane.showMessageDialog(null, "PC VENCEU");
			}
			// limpar os campos
			lblPC.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pc.png")));
			buttonGroup.clearSelection();
		}
	}

}// fim do codigo

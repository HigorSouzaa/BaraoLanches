package telas;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaAdministracao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdministracao frame = new TelaAdministracao("Barao Lanches - Administração");
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
	public TelaAdministracao(String title) throws HeadlessException {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
			
			JButton btLogar_1_2_1 = new JButton("");
			btLogar_1_2_1.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoAdmistraçâo.png")));
			btLogar_1_2_1.setContentAreaFilled(false);
			btLogar_1_2_1.setBorderPainted(false);
			btLogar_1_2_1.setBounds(585, 551, 230, 60);
			contentPane.add(btLogar_1_2_1);
			
			JButton btLogar_1_1_1 = new JButton("");
			btLogar_1_1_1.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoAdmistraçâo.png")));
			btLogar_1_1_1.setContentAreaFilled(false);
			btLogar_1_1_1.setBorderPainted(false);
			btLogar_1_1_1.setBounds(585, 480, 230, 60);
			contentPane.add(btLogar_1_1_1);
			
			JButton btLogar_2 = new JButton("");
			btLogar_2.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoAdmistraçâo.png")));
			btLogar_2.setContentAreaFilled(false);
			btLogar_2.setBorderPainted(false);
			btLogar_2.setBounds(585, 341, 230, 60);
			contentPane.add(btLogar_2);
			
			JButton btLogar_1_3 = new JButton("");
			btLogar_1_3.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoAdmistraçâo.png")));
			btLogar_1_3.setContentAreaFilled(false);
			btLogar_1_3.setBorderPainted(false);
			btLogar_1_3.setBounds(585, 412, 230, 60);
			contentPane.add(btLogar_1_3);
			
			JButton btLogar_1_2 = new JButton("");
			btLogar_1_2.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoAdmistraçâo.png")));
			btLogar_1_2.setContentAreaFilled(false);
			btLogar_1_2.setBorderPainted(false);
			btLogar_1_2.setBounds(76, 551, 230, 60);
			contentPane.add(btLogar_1_2);
			
			JButton btLogar_1_1 = new JButton("");
			btLogar_1_1.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoFuncionarios.png")));
			btLogar_1_1.setContentAreaFilled(false);
			btLogar_1_1.setBorderPainted(false);
			btLogar_1_1.setBounds(76, 480, 230, 60);
			contentPane.add(btLogar_1_1);
			
			JButton btLogar_1 = new JButton("");
			btLogar_1.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/BotaoLogar.png")));
			btLogar_1.setContentAreaFilled(false);
			btLogar_1.setBorderPainted(false);
			btLogar_1.setBounds(76, 412, 230, 60);
			contentPane.add(btLogar_1);
		
			JButton btLogar = new JButton("");
			btLogar.setContentAreaFilled(false);
			btLogar.setBorderPainted(false);
			btLogar.setIcon(new ImageIcon(Login.class.getResource("/arquivos/BotaoLogar.png")));
			btLogar.setBounds(76, 341, 230, 60);
			contentPane.add(btLogar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaAdministracao.class.getResource("/arquivos/TelaAdmistração.png")));
		lblNewLabel.setBounds(0, 0, 881, 661);
		contentPane.add(lblNewLabel);
	}

}

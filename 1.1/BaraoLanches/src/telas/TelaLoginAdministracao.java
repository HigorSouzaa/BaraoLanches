package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLoginAdministracao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginAdministracao frame = new TelaLoginAdministracao("Barao Lanches - Login Administração");
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
	public TelaLoginAdministracao (String title) throws HeadlessException {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btVoltar = new JButton("");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login("Barao Lanches - Login Adm");
				lg.setVisible(true);
				setVisible(false);
			}
		});
		btVoltar.setIcon(new ImageIcon(TelaLoginAdministracao.class.getResource("/arquivos/BotaoVoltar.png")));
		btVoltar.setContentAreaFilled(false);
		btVoltar.setBorderPainted(false);
		btVoltar.setBounds(607, 422, 230, 60);
		contentPane.add(btVoltar);
		
		JButton btLogar = new JButton("");
		btLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdministracao adm = new TelaAdministracao("Barao Lanches - Admisnistracao");
				adm.setVisible(true);
				setVisible(false);
			}
		});
		btLogar.setContentAreaFilled(false);
		btLogar.setBorderPainted(false);
		btLogar.setIcon(new ImageIcon(Login.class.getResource("/arquivos/BotaoLogar.png")));
		btLogar.setBounds(607, 512, 230, 60);
		contentPane.add(btLogar);
		
		JTextField txtSenha = new JTextField();
		txtSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSenha.setColumns(10);
		txtSenha.setBounds(115, 525, 294, 31);
		contentPane.add(txtSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsuario.setBounds(115, 314, 294, 31);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(TelaLoginAdministracao.class.getResource("/arquivos/TelaLoginAdminstração.png")));
		lblNewLabel.setBounds(0, 0, 884, 661);
		contentPane.add(lblNewLabel);
	}
}

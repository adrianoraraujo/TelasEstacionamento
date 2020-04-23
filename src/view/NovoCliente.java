package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NovoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public NovoCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEstacionar = new JMenu("Estacionamento");
		menuBar.add(mnEstacionar);
		
		JMenuItem mntmEstacionar = new JMenuItem("Entrar");
		mntmEstacionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Entrada().setVisible(true);
				dispose();
			}
		});
		mnEstacionar.add(mntmEstacionar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Saida().setVisible(true);
				dispose();
				
			}
		});
		mnEstacionar.add(mntmSair);
		
		JMenuItem mntmPagar = new JMenuItem("Pagar");
		mntmPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PagarMensal().setVisible(true);
				dispose();
			}
		});
		mnEstacionar.add(mntmPagar);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmNovoCliente = new JMenuItem("Novo Cliente");
		mntmNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NovoCliente().setVisible(true);
				dispose();
			}
		});
		mnCliente.add(mntmNovoCliente);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mntmEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarClientes().setVisible(true);
				dispose();
			}
		});
		mnCliente.add(mntmEditar);
		
		JMenu mnRelatrios = new JMenu("Relatórios");
		menuBar.add(mnRelatrios);
		
		JMenuItem mntmPorCliente = new JMenuItem("Clientes");
		mntmPorCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Relatório gerado com sucesso!");
			}
		});
		mnRelatrios.add(mntmPorCliente);
		
		JMenuItem mntmPorPagamento = new JMenuItem("Pagamentos");
		mntmPorPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Relatório gerado com sucesso!");
			}
		});
		mnRelatrios.add(mntmPorPagamento);
		
		JMenuItem mntmVeculos = new JMenuItem("Veículos");
		mntmVeculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Relatório gerado com sucesso!");
			}
		});
		mnRelatrios.add(mntmVeculos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 35, 66, 15);
		panel.add(lblNome);
		
		JLabel lblCnh = new JLabel("CNH");
		lblCnh.setBounds(12, 81, 66, 15);
		panel.add(lblCnh);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(12, 124, 66, 15);
		panel.add(lblPlaca);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 79, 140, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 122, 140, 19);
		panel.add(textField_2);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Cadastro concluído com sucesso!");
				new Estacionamento().setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(153, 190, 114, 25);
		panel.add(btnCadastrar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(127, 33, 254, 19);
		panel.add(textField);
	}

}

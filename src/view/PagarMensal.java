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
import javax.swing.JButton;
import javax.swing.JTextField;

public class PagarMensal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String valorMensal="R$ 80,00";

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PagarMensal() {
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
		
		JLabel lblPagamentoMensal = new JLabel("Pagamento Mensal");
		lblPagamentoMensal.setBounds(141, 12, 162, 15);
		panel.add(lblPagamentoMensal);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(12, 47, 66, 15);
		panel.add(lblPlaca);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(12, 91, 66, 15);
		panel.add(lblValor);
		
		JLabel lblNewLabel = new JLabel(valorMensal);
		lblNewLabel.setBounds(114, 91, 66, 15);
		panel.add(lblNewLabel);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Pagamento Realizado com Sucesso!");
				new Estacionamento().setVisible(true);
				dispose();
			}
		});
		btnPagar.setBounds(166, 174, 114, 25);
		panel.add(btnPagar);
		
		textField = new JTextField();
		textField.setBounds(104, 45, 199, 25);
		panel.add(textField);
		textField.setColumns(10);
	}
}

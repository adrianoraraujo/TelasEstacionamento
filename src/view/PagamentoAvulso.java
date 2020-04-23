package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class PagamentoAvulso extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	String valor = "R$ 5,00";
	String numeroPlaca = "PPP3342";

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PagamentoAvulso() {
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
		
		MaskFormatter mascaraValor = null;

        try{
               
               mascaraValor = new MaskFormatter("###,##");
               mascaraValor.setPlaceholderCharacter('_');
        }
        catch(ParseException excp) {
               System.err.println("Erro na formatação: " + excp.getMessage());
               System.exit(-1);
        }
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(34, 60, 66, 17);
		panel.add(lblPlaca);
		JLabel lblnPlaca = new JLabel(numeroPlaca);
		lblnPlaca.setBounds(101, 59, 226, 19);
		panel.add(lblnPlaca);
		
		JLabel label = new JLabel("Valor");
		label.setBounds(34, 125, 66, 17);
		panel.add(label);
		
		JLabel lblvalor = new JLabel(valor);
		lblvalor.setBounds(101, 125, 226, 19);
		panel.add(lblvalor);
		
		JLabel lblMensalista = new JLabel("");
		lblMensalista.setBounds(12, 129, 66, 15);
		panel.add(lblMensalista);
		
		JLabel lblEntradaNoEstacionamento = new JLabel("Pagamento Avulso");
		lblEntradaNoEstacionamento.setBounds(115, 12, 224, 15);
		panel.add(lblEntradaNoEstacionamento);
		
		JButton btnConfirmar = new JButton("Pagar e Sair");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Saída realizada com sucesso!");
				new Estacionamento().setVisible(true);
				dispose();
			}
		});
		btnConfirmar.setBounds(160, 173, 150, 25);
		panel.add(btnConfirmar);
	}}
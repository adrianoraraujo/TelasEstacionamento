package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

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
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Entrada extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada frame = new Entrada();
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
	public Entrada() {
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
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(12, 60, 66, 17);
		panel.add(lblPlaca);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 58, 226, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel label = new JLabel("");
		label.setBounds(12, 115, 124, 15);
		panel.add(label);
		
		
		
		JLabel lblEntradaNoEstacionamento = new JLabel("Entrada no Estacionamento");
		lblEntradaNoEstacionamento.setBounds(108, 12, 224, 15);
		panel.add(lblEntradaNoEstacionamento);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Entrada realizada com Sucesso!");
				new Estacionamento().setVisible(true);
				dispose();
			}
		});
		btnConfirmar.setBounds(167, 173, 114, 25);
		panel.add(btnConfirmar);
		
		
	}	
}
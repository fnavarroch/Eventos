package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente frame = new VentanaCliente();
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
	public VentanaCliente() {
		setType(Type.POPUP);
		setResizable(false);
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 255, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregarCliente = new JButton("Agregar Cliente");
		btnAgregarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarCliente abrir = new InterfazAgregarCliente();
				abrir.setVisible(true);
				VentanaCliente.this.dispose();
			}
		});
		btnAgregarCliente.setBounds(66, 65, 129, 26);
		contentPane.add(btnAgregarCliente);
		
		JButton btnModificarCliente = new JButton("Modificar Cliente");
		btnModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarCliente abrir = new InterfazModificarCliente();
				abrir.setVisible(true);
				VentanaCliente.this.dispose();
			}
		});
		btnModificarCliente.setBounds(66, 99, 129, 26);
		contentPane.add(btnModificarCliente);
		
		JButton btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazEliminarCliente abrir = new InterfazEliminarCliente();
				abrir.setVisible(true);
				VentanaCliente.this.dispose();
			}
		});
		btnEliminarCliente.setBounds(66, 136, 129, 26);
		contentPane.add(btnEliminarCliente);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 MenuInicio abrir = new MenuInicio();
			 abrir.setVisible(true);
			 VentanaCliente.this.dispose();
			}
		});
		btnAtras.setBounds(86, 174, 98, 26);
		contentPane.add(btnAtras);
	}
}

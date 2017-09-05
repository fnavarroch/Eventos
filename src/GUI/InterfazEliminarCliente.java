package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazEliminarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtRut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEliminarCliente frame = new InterfazEliminarCliente();
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
	public InterfazEliminarCliente() {
		setResizable(false);
		setTitle("Eliminar Cliente");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 254, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRutCliente = new JLabel("Ingrese Rut Cliente que desea Eliminar");
		lblIngreseRutCliente.setBounds(12, 12, 218, 16);
		contentPane.add(lblIngreseRutCliente);
		
		txtRut = new JTextField();
		txtRut.setBounds(54, 40, 114, 20);
		contentPane.add(txtRut);
		txtRut.setColumns(10);
		
		JButton btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.setBounds(54, 88, 122, 26);
		contentPane.add(btnEliminarCliente);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCliente abrir = new VentanaCliente();
				abrir.setVisible(true);
				InterfazEliminarCliente.this.dispose();
			}
		});
		btnAtras.setBounds(70, 142, 98, 26);
		contentPane.add(btnAtras);
	}
}

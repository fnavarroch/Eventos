package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Clases.Cliente;
import Clases.ListaCliente;



@SuppressWarnings("serial")
public class InterfazAgregarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtRut;
	private JTextField txtEdad;
	private ListaCliente lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAgregarCliente frame = new InterfazAgregarCliente();
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
	public InterfazAgregarCliente() {
		
		setResizable(false);
		setTitle("Agregar Cliente");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 346, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 35, 147, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(10, 82, 147, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtRut = new JTextField();
		txtRut.setBounds(10, 127, 107, 20);
		panel.add(txtRut);
		txtRut.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(185, 35, 43, 20);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
		
		JButton btnAgregarCliente = new JButton("Agregar Cliente");
		btnAgregarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente nuevo = new Cliente();
				nuevo.setRut(txtRut.getText());
				nuevo.setNombre(txtNombre.getText());
				nuevo.setApellido(txtApellido.getText());
				nuevo.setEdad(Integer.parseInt(txtEdad.getText()));
				if(lista.agregarCliente(nuevo)) {
					JOptionPane.showMessageDialog(null, "Cliente Agregado Correctamente");
				}
				else {
					JOptionPane.showMessageDialog(null, "Cliente ya existe en la lista");
				}
				
				
			}
		});
		btnAgregarCliente.setBounds(185, 126, 122, 26);
		panel.add(btnAgregarCliente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 10, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 66, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblRut = new JLabel("Rut");
		lblRut.setBounds(10, 113, 46, 14);
		panel.add(lblRut);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(185, 10, 46, 14);
		panel.add(lblEdad);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCliente abrir = new VentanaCliente();
				abrir.setVisible(true);
				InterfazAgregarCliente.this.dispose();
			}
		});
		btnAtras.setBounds(195, 158, 98, 26);
		panel.add(btnAtras);
	}
}

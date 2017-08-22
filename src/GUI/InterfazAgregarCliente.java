package GUI;
import Clases.Cliente;
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



@SuppressWarnings("serial")
public class InterfazAgregarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtRut;
	private JTextField txtEdad;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				Cliente datosCliente = new Cliente();
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String rut = txtRut.getText();
				int edad = Integer.parseInt(txtRut.getText());
				datosCliente.setNombre(nombre);
				datosCliente.setApellido(apellido);
				datosCliente.setRut(rut);
				datosCliente.setEdad(edad);
				if(datosCliente.buscarClientePorRut(rut)!=null){
					datosCliente.agregarCliente(datosCliente);
					JOptionPane.showMessageDialog(null,"Cliente Agregado Correctamente");
				}
				else
					JOptionPane.showMessageDialog(null, "Cliente Ya existe");
				
				
			}
		});
		btnAgregarCliente.setBounds(185, 126, 107, 23);
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
	}
}

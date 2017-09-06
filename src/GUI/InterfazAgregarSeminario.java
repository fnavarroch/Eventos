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
public class InterfazAgregarSeminario extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdSeminario;
	private JTextField txtSede;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAgregarSeminario frame = new InterfazAgregarSeminario();
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
	public InterfazAgregarSeminario() {
		setTitle("Agregar Seminario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 329, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdSeminario = new JLabel("Id Seminario");
		lblIdSeminario.setBounds(12, 12, 71, 16);
		contentPane.add(lblIdSeminario);
		
		txtIdSeminario = new JTextField();
		txtIdSeminario.setBounds(12, 33, 71, 20);
		contentPane.add(txtIdSeminario);
		txtIdSeminario.setColumns(10);
		
		JLabel lblSede = new JLabel("Sede");
		lblSede.setBounds(134, 12, 29, 16);
		contentPane.add(lblSede);
		
		txtSede = new JTextField();
		txtSede.setBounds(134, 33, 114, 20);
		contentPane.add(txtSede);
		txtSede.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 66, 45, 16);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(12, 95, 90, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(12, 128, 55, 16);
		contentPane.add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(12, 157, 90, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(134, 66, 34, 16);
		contentPane.add(lblFecha);
		
		textField = new JTextField();
		textField.setBounds(134, 95, 80, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAgregarSeminario = new JButton("Agregar Seminario");
		btnAgregarSeminario.setBounds(147, 154, 141, 26);
		contentPane.add(btnAgregarSeminario);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaSeminario abrir = new VentanaSeminario();
				abrir.setVisible(true);
				InterfazAgregarSeminario.this.dispose();
			}
		});
		btnAtras.setBounds(167, 192, 98, 26);
		contentPane.add(btnAtras);
	}
}

package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class InterfazAgregarCharla extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JTextField txtSede;
	private JTextField txtFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAgregarCharla frame = new InterfazAgregarCharla();
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
	public InterfazAgregarCharla() {
		setTitle("Agregar Charla");
		setBackground(new Color(240, 240, 240));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaCharlas abrir = new VentanaCharlas();
				abrir.setVisible(true);
				InterfazAgregarCharla.this.dispose();
			}
		});
		btnAtras.setBounds(325, 217, 89, 23);
		panel.add(btnAtras);
		
		txtId = new JTextField();
		txtId.setBounds(10, 35, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblIdCharla = new JLabel("Id Charla");
		lblIdCharla.setBounds(10, 11, 61, 14);
		panel.add(lblIdCharla);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 93, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 68, 46, 14);
		panel.add(lblNewLabel);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(10, 143, 86, 20);
		panel.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad");
		lblNewLabel_1.setBounds(10, 124, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtSede = new JTextField();
		txtSede.setBounds(157, 35, 86, 20);
		panel.add(txtSede);
		txtSede.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(157, 93, 86, 20);
		panel.add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblSede = new JLabel("Sede");
		lblSede.setBounds(157, 11, 46, 14);
		panel.add(lblSede);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(157, 68, 46, 14);
		panel.add(lblFecha);
		
		JButton btnAgregarCharla = new JButton("Agregar Charla");
		btnAgregarCharla.setBounds(157, 217, 131, 23);
		panel.add(btnAgregarCharla);
	}
}

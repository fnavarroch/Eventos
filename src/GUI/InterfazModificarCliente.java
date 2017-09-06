package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class InterfazModificarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtRutAValidar;
	private JTextField txtNombre;
	private JTextField txtRut;
	private JTextField txtApellido;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarCliente frame = new InterfazModificarCliente();
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
	public InterfazModificarCliente() {
		setTitle("Modificar Cliente");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRutDel = new JLabel("Ingrese Rut del Cliente a Modificar");
		lblIngreseRutDel.setBounds(10, 11, 193, 16);
		contentPane.add(lblIngreseRutDel);
		
		txtRutAValidar = new JTextField();
		txtRutAValidar.setBounds(10, 37, 114, 20);
		contentPane.add(txtRutAValidar);
		txtRutAValidar.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 74, 434, 2);
		contentPane.add(separator);
		
		JLabel lblSeleccioneLosCampos = new JLabel("Seleccione los campos a Editar e Ingrese los Nuevos Valores");
		lblSeleccioneLosCampos.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSeleccioneLosCampos.setBounds(10, 82, 346, 16);
		contentPane.add(lblSeleccioneLosCampos);
		
		JCheckBox chckbxRut = new JCheckBox("Rut");
		chckbxRut.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtRut.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtRut.setEnabled(false);
				}
			}
		});
		chckbxRut.setBounds(6, 118, 44, 24);
		contentPane.add(chckbxRut);
		
		JCheckBox chckbxNombre = new JCheckBox("Nombre");
		chckbxNombre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtNombre.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtNombre.setEnabled(false);
				}
			}
		});
		chckbxNombre.setBounds(6, 145, 70, 24);
		contentPane.add(chckbxNombre);
		
		JCheckBox chckbxApellido = new JCheckBox("Apellido");
		chckbxApellido.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtApellido.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtApellido.setEnabled(false);
				}
			}
		});
		chckbxApellido.setBounds(6, 172, 70, 24);
		contentPane.add(chckbxApellido);
		
		JCheckBox chckbxEdad = new JCheckBox("Edad");
		chckbxEdad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtEdad.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtEdad.setEnabled(false);
				}
			}
		});
		chckbxEdad.setBounds(6, 199, 53, 24);
		contentPane.add(chckbxEdad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(82, 147, 114, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setEnabled(false);
		
		txtRut = new JTextField();
		txtRut.setBounds(82, 120, 114, 20);
		contentPane.add(txtRut);
		txtRut.setColumns(10);
		txtRut.setEnabled(false);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(82, 174, 114, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		txtApellido.setEnabled(false);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(82, 201, 114, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		txtEdad.setEnabled(false);
		
		JButton btnModificarCliente = new JButton("Modificar Cliente");
		btnModificarCliente.setBounds(276, 117, 133, 26);
		contentPane.add(btnModificarCliente);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCliente abrir = new VentanaCliente();
				abrir.setVisible(true);
				InterfazModificarCliente.this.dispose();
			}
		});
		btnAtras.setBounds(299, 171, 98, 26);
		contentPane.add(btnAtras);
	}
}

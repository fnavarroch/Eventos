package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazModificarSeminario extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDSeminario;
	private JTextField txtIDNuevo;
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
					InterfazModificarSeminario frame = new InterfazModificarSeminario();
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
	public InterfazModificarSeminario() {
		setTitle("Modificar Seminario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 372, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseIdDel = new JLabel("Ingrese ID del Seminario que desea Editar");
		lblIngreseIdDel.setBounds(10, 11, 236, 16);
		contentPane.add(lblIngreseIdDel);
		
		txtIDSeminario = new JTextField();
		txtIDSeminario.setColumns(10);
		txtIDSeminario.setBounds(10, 39, 114, 20);
		contentPane.add(txtIDSeminario);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 70, 334, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("Seleccionar las casillas a editar e Ingresar los nuevos datos");
		label.setFont(new Font("Dialog", Font.ITALIC, 12));
		label.setBounds(14, 77, 341, 16);
		contentPane.add(label);
		
		JCheckBox chckBxID = new JCheckBox("ID");
		chckBxID.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtIDNuevo.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtIDNuevo.setEnabled(false);
				}
			}
		});
		chckBxID.setBounds(10, 116, 45, 24);
		contentPane.add(chckBxID);
		
		txtIDNuevo = new JTextField();
		txtIDNuevo.setFocusCycleRoot(true);
		txtIDNuevo.setEnabled(false);
		txtIDNuevo.setColumns(10);
		txtIDNuevo.setBounds(86, 118, 114, 20);
		contentPane.add(txtIDNuevo);
		
		JCheckBox checkBoxNombre = new JCheckBox("Nombre");
		checkBoxNombre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtNombre.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtNombre.setEnabled(false);
				}
			}
		});
		checkBoxNombre.setBounds(10, 157, 70, 24);
		contentPane.add(checkBoxNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(86, 159, 114, 20);
		contentPane.add(txtNombre);
		
		JCheckBox checkBoxCiudad = new JCheckBox("Ciudad");
		checkBoxCiudad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtCiudad.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtCiudad.setEnabled(false);
				}
			}
		});
		checkBoxCiudad.setBounds(10, 198, 64, 24);
		contentPane.add(checkBoxCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setEnabled(false);
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(86, 200, 114, 20);
		contentPane.add(txtCiudad);
		
		JCheckBox checkBoxSede = new JCheckBox("Sede");
		checkBoxSede.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtSede.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtSede.setEnabled(false);
				}
			}
		});
		checkBoxSede.setBounds(10, 233, 54, 24);
		contentPane.add(checkBoxSede);
		
		txtSede = new JTextField();
		txtSede.setEnabled(false);
		txtSede.setColumns(10);
		txtSede.setBounds(86, 235, 114, 20);
		contentPane.add(txtSede);
		
		JCheckBox checkBoxFecha = new JCheckBox("Fecha");
		checkBoxFecha.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtFecha.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtFecha.setEnabled(false);
				}
			}
		});
		checkBoxFecha.setBounds(10, 263, 59, 24);
		contentPane.add(checkBoxFecha);
		
		txtFecha = new JTextField();
		txtFecha.setEnabled(false);
		txtFecha.setColumns(10);
		txtFecha.setBounds(86, 267, 114, 20);
		contentPane.add(txtFecha);
		
		JButton button = new JButton("Modificar");
		button.setBounds(60, 303, 98, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSeminario abrir = new VentanaSeminario();
				abrir.setVisible(true);
				InterfazModificarSeminario.this.dispose();
			}
		});
		button_1.setBounds(189, 303, 98, 26);
		contentPane.add(button_1);
	}
}

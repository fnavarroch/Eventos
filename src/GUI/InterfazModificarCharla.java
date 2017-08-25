package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FocusTraversalPolicy;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazModificarCharla extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JTextField txtSede;
	private JTextField txtFecha;
	private JTextField txtIdCharla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarCharla frame = new InterfazModificarCharla();
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
	public InterfazModificarCharla() {
		setExtendedState(Frame.ICONIFIED);
		setTitle("Modificar Charla");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 389, 406);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 88, 424, 2);
		contentPane.add(separator);
		
		JCheckBox chckbxId = new JCheckBox("ID");
		chckbxId.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtId.setEnabled(true);
					
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtId.setEnabled(false);
				}
			}
		});
		chckbxId.setBounds(6, 127, 45, 24);
		contentPane.add(chckbxId);
		
		txtId = new JTextField();
		txtId.setFocusCycleRoot(true);
		txtId.setBounds(82, 129, 114, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		txtId.setEnabled(false);
		
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
		chckbxNombre.setBounds(6, 168, 70, 24);
		contentPane.add(chckbxNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(82, 170, 114, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setEnabled(false);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ciudad");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtCiudad.setEnabled(true);
					
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtCiudad.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox.setBounds(6, 209, 64, 24);
		contentPane.add(chckbxNewCheckBox);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(82, 211, 114, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		txtCiudad.setEnabled(false);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Sede");
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtSede.setEnabled(true);
					
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtSede.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox_1.setBounds(6, 244, 54, 24);
		contentPane.add(chckbxNewCheckBox_1);
		
		txtSede = new JTextField();
		txtSede.setBounds(82, 246, 114, 20);
		contentPane.add(txtSede);
		txtSede.setColumns(10);
		txtSede.setEnabled(false);
		
		JCheckBox chckbxFecha = new JCheckBox("Fecha");
		chckbxFecha.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtFecha.setEnabled(true);
					
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtFecha.setEnabled(false);
				}
			}
		});
		chckbxFecha.setBounds(6, 274, 59, 24);
		contentPane.add(chckbxFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(82, 278, 114, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		txtFecha.setEnabled(false);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(98, 312, 98, 26);
		contentPane.add(btnModificar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCharlas abrir = new VentanaCharlas();
				abrir.setVisible(true);
				InterfazModificarCharla.this.dispose();
			}
		});
		btnAtras.setBounds(227, 312, 98, 26);
		contentPane.add(btnAtras);
		
		JLabel lblSeleccionarLasCasillas = new JLabel("Seleccionar las casillas a editar e Ingresar los nuevos datos");
		lblSeleccionarLasCasillas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSeleccionarLasCasillas.setBounds(10, 88, 341, 16);
		contentPane.add(lblSeleccionarLasCasillas);
		
		txtIdCharla = new JTextField();
		txtIdCharla.setBounds(10, 56, 114, 20);
		contentPane.add(txtIdCharla);
		txtIdCharla.setColumns(10);
		
		
		JLabel lblIngreseIdDe = new JLabel("Ingrese ID de la Charla que desea Editar");
		lblIngreseIdDe.setBounds(10, 28, 225, 16);
		contentPane.add(lblIngreseIdDe);
		

	}
}
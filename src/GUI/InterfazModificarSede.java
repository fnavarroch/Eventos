package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Asiento;
import Clases.ListaAsiento;
import Clases.Local;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class InterfazModificarSede extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDSede;
	private JTextField txtAsientosGral;
	private JTextField txtAsientosAbuelo;
	private JTextField txtAsientosNiños;
	private JTextField txtReservaGral;
	private JTextField txtReservaAbuelo;
	private JTextField txtReservaNiños;
	private JTextField txtCiudadSede;
	private JTextField txtNombreSede;
	private JTextField txtNuevoIdSede;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarSede frame = new InterfazModificarSede();
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
	public InterfazModificarSede() {
		setTitle("Modificar Sede");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 414, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseIdSede = new JLabel("Ingrese ID sede");
		lblIngreseIdSede.setBounds(10, 11, 88, 16);
		contentPane.add(lblIngreseIdSede);
		
		txtIDSede = new JTextField();
		txtIDSede.setBounds(10, 34, 60, 20);
		contentPane.add(txtIDSede);
		txtIDSede.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 63, 386, 2);
		contentPane.add(separator);
		
		JCheckBox chckbxIdSede = new JCheckBox("Id Sede");
		chckbxIdSede.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtNuevoIdSede.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtNuevoIdSede.setEnabled(false);
				}
			}
		});
		chckbxIdSede.setBounds(10, 90, 67, 24);
		contentPane.add(chckbxIdSede);
		
		JCheckBox chckbxNombreSede = new JCheckBox("Nombre Sede");
		chckbxNombreSede.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtNombreSede.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtNombreSede.setEnabled(false);
				}
			}
		});
		chckbxNombreSede.setBounds(10, 118, 102, 24);
		contentPane.add(chckbxNombreSede);
		
		JCheckBox chckbxCiudadSede = new JCheckBox("Ciudad Sede");
		chckbxCiudadSede.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtCiudadSede.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtCiudadSede.setEnabled(false);
				}
			}
		});
		chckbxCiudadSede.setBounds(10, 146, 96, 24);
		contentPane.add(chckbxCiudadSede);
		
		JCheckBox chckbxCostoReservaNios = new JCheckBox("Costo Reserva Ni\u00F1os");
		chckbxCostoReservaNios.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtReservaNiños.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtReservaNiños.setEnabled(false);
				}
			}
		});
		chckbxCostoReservaNios.setBounds(10, 174, 143, 24);
		contentPane.add(chckbxCostoReservaNios);
		
		JCheckBox chckbxCostoReservaedad = new JCheckBox("Costo Reserva 3\u00B0Edad");
		chckbxCostoReservaedad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtReservaAbuelo.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtReservaAbuelo.setEnabled(false);
				}
			}
		});
		chckbxCostoReservaedad.setBounds(10, 202, 151, 24);
		contentPane.add(chckbxCostoReservaedad);
		
		JCheckBox chckbxCostoReservaGeneral = new JCheckBox("Costo Reserva General");
		chckbxCostoReservaGeneral.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtReservaGral.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtReservaGral.setEnabled(false);
				}
			}
		});
		chckbxCostoReservaGeneral.setBounds(10, 230, 155, 24);
		contentPane.add(chckbxCostoReservaGeneral);
		
		JCheckBox chckbxCantidadAsientosNios = new JCheckBox("Cantidad Asientos Ni\u00F1os");
		chckbxCantidadAsientosNios.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtAsientosNiños.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtAsientosNiños.setEnabled(false);
				}
			}
		});
		chckbxCantidadAsientosNios.setBounds(10, 258, 163, 24);
		contentPane.add(chckbxCantidadAsientosNios);
		
		JCheckBox chckbxCantidadAsientosedad = new JCheckBox("Cantidad Asientos 3\u00B0Edad");
		chckbxCantidadAsientosedad.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtAsientosAbuelo.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtAsientosAbuelo.setEnabled(false);
				}
			}
		});
		chckbxCantidadAsientosedad.setBounds(10, 284, 171, 24);
		contentPane.add(chckbxCantidadAsientosedad);
		
		JCheckBox chckbxCantidadAsientosGeneral = new JCheckBox("Cantidad Asientos General");
		chckbxCantidadAsientosGeneral.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtAsientosGral.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtAsientosGral.setEnabled(false);
				}
			}
		});
		chckbxCantidadAsientosGeneral.setBounds(10, 312, 175, 24);
		contentPane.add(chckbxCantidadAsientosGeneral);
		
		txtAsientosGral = new JTextField();
		txtAsientosGral.setBounds(193, 314, 114, 20);
		contentPane.add(txtAsientosGral);
		txtAsientosGral.setColumns(10);
		txtAsientosGral.setEnabled(false);
		
		txtAsientosAbuelo = new JTextField();
		txtAsientosAbuelo.setBounds(193, 286, 114, 20);
		contentPane.add(txtAsientosAbuelo);
		txtAsientosAbuelo.setColumns(10);
		txtAsientosAbuelo.setEnabled(false);
		
		txtAsientosNiños = new JTextField();
		txtAsientosNiños.setBounds(193, 260, 114, 20);
		contentPane.add(txtAsientosNiños);
		txtAsientosNiños.setColumns(10);
		txtAsientosNiños.setEnabled(false);
		
		txtReservaGral = new JTextField();
		txtReservaGral.setBounds(193, 232, 114, 20);
		contentPane.add(txtReservaGral);
		txtReservaGral.setColumns(10);
		txtReservaGral.setEnabled(false);
		
		txtReservaAbuelo = new JTextField();
		txtReservaAbuelo.setBounds(193, 204, 114, 20);
		contentPane.add(txtReservaAbuelo);
		txtReservaAbuelo.setColumns(10);
		txtReservaAbuelo.setEnabled(false);
		
		txtReservaNiños = new JTextField();
		txtReservaNiños.setBounds(193, 176, 114, 20);
		contentPane.add(txtReservaNiños);
		txtReservaNiños.setColumns(10);
		txtReservaNiños.setEnabled(false);
		
		txtCiudadSede = new JTextField();
		txtCiudadSede.setBounds(193, 146, 114, 20);
		contentPane.add(txtCiudadSede);
		txtCiudadSede.setColumns(10);
		txtCiudadSede.setEnabled(false);
		
		txtNombreSede = new JTextField();
		txtNombreSede.setBounds(193, 120, 114, 20);
		contentPane.add(txtNombreSede);
		txtNombreSede.setColumns(10);
		txtNombreSede.setEnabled(false);
		
		txtNuevoIdSede = new JTextField();
		txtNuevoIdSede.setBounds(193, 92, 114, 20);
		contentPane.add(txtNuevoIdSede);
		txtNuevoIdSede.setColumns(10);
		txtNuevoIdSede.setEnabled(false);
		
		JButton btnModificarSede = new JButton("Modificar Sede");
		btnModificarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Local nuevolocal = new Local();
				ListaAsiento nuevoAsiento = new ListaAsiento();
				Asiento asientoAbuelo = new Asiento();
				Asiento asientoNiño = new Asiento();
				Asiento asientoGeneral = new Asiento();
				
				nuevolocal.setId(Integer.parseInt(txtNuevoIdSede.getText()));
				nuevolocal.setNombre(txtNombreSede.getText());
				nuevolocal.setUbicacion(txtCiudadSede.getText());
				asientoAbuelo.setTipo("Abuelo");
				asientoAbuelo.setPrecio(Integer.parseInt(txtReservaAbuelo.getText()));
				asientoAbuelo.setTotalAsientos(Integer.parseInt(txtAsientosAbuelo.getText()));
				nuevoAsiento.agregarAsientoaLista(asientoAbuelo);
				asientoNiño.setTipo("Niño");
				asientoNiño.setPrecio(Integer.parseInt(txtReservaNiños.getText()));
				asientoNiño.setTotalAsientos(Integer.parseInt(txtAsientosNiños.getText()));
				nuevoAsiento.agregarAsientoaLista(asientoNiño);
				asientoGeneral.setTipo("General");
				asientoGeneral.setPrecio(Integer.parseInt(txtReservaGral.getText()));
				asientoGeneral.setTotalAsientos(Integer.parseInt(txtAsientosGral.getText()));
			}
		});
		btnModificarSede.setBounds(34, 365, 119, 26);
		contentPane.add(btnModificarSede);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSede abrir = new VentanaSede();
				abrir.setVisible(true);
				InterfazModificarSede.this.dispose();
			}
		});
		btnAtras.setBounds(263, 365, 98, 26);
		contentPane.add(btnAtras);
		
		JLabel lblSeleccioneLosCampos = new JLabel("Seleccione los campos a Editar e Ingrese nuevos Valores ");
		lblSeleccioneLosCampos.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblSeleccioneLosCampos.setBounds(10, 66, 328, 16);
		contentPane.add(lblSeleccioneLosCampos);
	}
}

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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazModificarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtRutReserva;
	private JTextField txtNiños;
	private JTextField txtAbuelo;
	private JTextField txtGral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazModificarReserva frame = new InterfazModificarReserva();
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
	public InterfazModificarReserva() {
		setTitle("Modificar Reserva");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRutDe = new JLabel("Ingrese Rut De la Reserva");
		lblIngreseRutDe.setBounds(10, 11, 146, 16);
		contentPane.add(lblIngreseRutDe);
		
		txtRutReserva = new JTextField();
		txtRutReserva.setBounds(174, 9, 114, 20);
		contentPane.add(txtRutReserva);
		txtRutReserva.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-22, 38, 466, 2);
		contentPane.add(separator);
		
		JLabel lblSeleccioneLosCampos = new JLabel("Seleccione los campos a editar e Ingrese los nuevos Valores");
		lblSeleccioneLosCampos.setBounds(10, 47, 345, 16);
		contentPane.add(lblSeleccioneLosCampos);
		
		JCheckBox chckbxNios = new JCheckBox("Ni\u00F1os");
		chckbxNios.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtNiños.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtNiños.setEnabled(false);
				}
			}
		});
		chckbxNios.setBounds(10, 75, 57, 24);
		contentPane.add(chckbxNios);
		
		txtNiños = new JTextField();
		txtNiños.setBounds(73, 77, 44, 20);
		contentPane.add(txtNiños);
		txtNiños.setColumns(10);
		txtNiños.setEnabled(false);
		
		JCheckBox chckbxDiscapacitados = new JCheckBox("Discapacitados / 3\u00B0 Edad");
		chckbxDiscapacitados.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtAbuelo.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtAbuelo.setEnabled(false);
				}
			}
		});
		chckbxDiscapacitados.setBounds(10, 102, 165, 24);
		contentPane.add(chckbxDiscapacitados);
		
		txtAbuelo = new JTextField();
		txtAbuelo.setBounds(182, 104, 44, 20);
		contentPane.add(txtAbuelo);
		txtAbuelo.setColumns(10);
		txtAbuelo.setEnabled(false);
		
		JCheckBox chckbxGeneral = new JCheckBox("General");
		chckbxGeneral.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()== ItemEvent.SELECTED) {
					txtGral.setEnabled(true);
				}
				else if(e.getStateChange() == ItemEvent.DESELECTED) {
					txtGral.setEnabled(false);
				}
			}
		});
		chckbxGeneral.setBounds(10, 130, 69, 24);
		contentPane.add(chckbxGeneral);
		
		txtGral = new JTextField();
		txtGral.setBounds(89, 133, 44, 20);
		contentPane.add(txtGral);
		txtGral.setColumns(10);
		txtGral.setEnabled(false);
		
		JButton btnModificarReserva = new JButton("Modificar reserva");
		btnModificarReserva.setBounds(22, 191, 134, 26);
		contentPane.add(btnModificarReserva);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReserva abrir = new VentanaReserva();
				abrir.setVisible(true);
				InterfazModificarReserva.this.dispose();
			}
		});
		btnAtras.setBounds(242, 191, 98, 26);
		contentPane.add(btnAtras);
	}
}

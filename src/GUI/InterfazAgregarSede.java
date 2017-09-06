package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazAgregarSede extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdSede;
	private JTextField txtNombreSede;
	private JTextField txtCostoNiños;
	private JTextField txtCiudadSede;
	private JTextField txtAsientoNiños;
	private JTextField txtCostoAbuelo;
	private JTextField txtAsientoAbuelo;
	private JTextField txtCostoGral;
	private JTextField txtAsientosGral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAgregarSede frame = new InterfazAgregarSede();
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
	public InterfazAgregarSede() {
		setResizable(false);
		setTitle("Agregar Sede");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSede abrir = new VentanaSede();
				abrir.setVisible(true);
				InterfazAgregarSede.this.dispose();
			}
		});
		btnAtras.setBounds(319, 377, 89, 23);
		contentPane.add(btnAtras);
		
		JLabel lblIdSede = new JLabel("Id Sede");
		lblIdSede.setBounds(12, 12, 42, 16);
		contentPane.add(lblIdSede);
		
		txtIdSede = new JTextField();
		txtIdSede.setBounds(12, 33, 60, 20);
		contentPane.add(txtIdSede);
		txtIdSede.setColumns(10);
		
		JLabel lblNombreSede = new JLabel("Nombre Sede");
		lblNombreSede.setBounds(175, 12, 77, 16);
		contentPane.add(lblNombreSede);
		
		JLabel lblCiudadSede = new JLabel("Ciudad Sede");
		lblCiudadSede.setBounds(175, 65, 71, 16);
		contentPane.add(lblCiudadSede);
		
		JLabel lblCostoReservaNios = new JLabel("Costo Reserva Ni\u00F1os");
		lblCostoReservaNios.setBounds(12, 65, 118, 16);
		contentPane.add(lblCostoReservaNios);
		
		JLabel lblCantidadAsientosNios = new JLabel("Cantidad Asientos Ni\u00F1os");
		lblCantidadAsientosNios.setBounds(12, 126, 138, 16);
		contentPane.add(lblCantidadAsientosNios);
		
		JLabel lblCostoReservaedad = new JLabel("Costo Reserva 3\u00B0Edad / Discapacitados");
		lblCostoReservaedad.setBounds(12, 187, 223, 16);
		contentPane.add(lblCostoReservaedad);
		
		JLabel lblCantifadAsientosedad = new JLabel("Cantidad Asientos 3\u00B0Edad / Discapacitados");
		lblCantifadAsientosedad.setBounds(12, 244, 243, 16);
		contentPane.add(lblCantifadAsientosedad);
		
		JLabel lblCostoReservaGeneral = new JLabel("Costo Reserva General");
		lblCostoReservaGeneral.setBounds(12, 303, 130, 16);
		contentPane.add(lblCostoReservaGeneral);
		
		JLabel lblCantidadAsientosGeneral = new JLabel("Cantidad Asientos General");
		lblCantidadAsientosGeneral.setBounds(12, 350, 150, 16);
		contentPane.add(lblCantidadAsientosGeneral);
		
		txtNombreSede = new JTextField();
		txtNombreSede.setBounds(175, 33, 144, 20);
		contentPane.add(txtNombreSede);
		txtNombreSede.setColumns(10);
		
		txtCostoNiños = new JTextField();
		txtCostoNiños.setBounds(22, 93, 89, 20);
		contentPane.add(txtCostoNiños);
		txtCostoNiños.setColumns(10);
		
		JLabel label = new JLabel("$");
		label.setBounds(10, 93, 7, 16);
		contentPane.add(label);
		
		txtCiudadSede = new JTextField();
		txtCiudadSede.setBounds(175, 93, 144, 20);
		contentPane.add(txtCiudadSede);
		txtCiudadSede.setColumns(10);
		
		txtAsientoNiños = new JTextField();
		txtAsientoNiños.setBounds(12, 154, 60, 20);
		contentPane.add(txtAsientoNiños);
		txtAsientoNiños.setColumns(10);
		
		txtCostoAbuelo = new JTextField();
		txtCostoAbuelo.setBounds(22, 212, 89, 20);
		contentPane.add(txtCostoAbuelo);
		txtCostoAbuelo.setColumns(10);
		
		JLabel label_1 = new JLabel("$");
		label_1.setBounds(12, 212, 7, 16);
		contentPane.add(label_1);
		
		txtAsientoAbuelo = new JTextField();
		txtAsientoAbuelo.setBounds(12, 271, 60, 20);
		contentPane.add(txtAsientoAbuelo);
		txtAsientoAbuelo.setColumns(10);
		
		JLabel label_2 = new JLabel("$");
		label_2.setBounds(12, 331, 7, 16);
		contentPane.add(label_2);
		
		txtCostoGral = new JTextField();
		txtCostoGral.setBounds(22, 329, 89, 20);
		contentPane.add(txtCostoGral);
		txtCostoGral.setColumns(10);
		
		txtAsientosGral = new JTextField();
		txtAsientosGral.setBounds(12, 378, 62, 20);
		contentPane.add(txtAsientosGral);
		txtAsientosGral.setColumns(10);
		
		JButton btnAgregarSede = new JButton("Agregar Sede");
		btnAgregarSede.setBounds(309, 345, 112, 26);
		contentPane.add(btnAgregarSede);
	}

}

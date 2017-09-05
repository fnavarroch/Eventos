package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtRutCliente;
	private JTextField txtCantNiños;
	private JTextField txtStockNiños;
	private JTextField txtSubtotalNiños;
	private JTextField txtCantAbuelo;
	private JTextField txtStockAbuelo;
	private JTextField txtSubtotalAbuelo;
	private JTextField txtCantGral;
	private JTextField txtStockGral;
	private JTextField txtSubtotalGral;
	private JTextField txtTotalReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazReserva frame = new InterfazReserva();
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
	public InterfazReserva() {
		setTitle("Reservar Asientos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 367, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRutCliente = new JLabel("Ingrese Rut Cliente");
		lblIngreseRutCliente.setBounds(10, 11, 107, 16);
		contentPane.add(lblIngreseRutCliente);
		
		txtRutCliente = new JTextField();
		txtRutCliente.setBounds(10, 38, 114, 20);
		contentPane.add(txtRutCliente);
		txtRutCliente.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 64, 444, 4);
		contentPane.add(separator);
		
		JLabel lblIngreseLasCantidades = new JLabel("Ingrese las cantidades de cada tipo de asiento a reservar");
		lblIngreseLasCantidades.setBounds(10, 69, 325, 16);
		contentPane.add(lblIngreseLasCantidades);
		
		JLabel lblNiosas = new JLabel("Ni\u00F1os(as)");
		lblNiosas.setBounds(10, 96, 55, 16);
		contentPane.add(lblNiosas);
		
		txtCantNiños = new JTextField();
		txtCantNiños.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantNiños.setText("0");
		txtCantNiños.setBounds(75, 94, 25, 20);
		contentPane.add(txtCantNiños);
		txtCantNiños.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(101, 96, 3, 16);
		contentPane.add(label);
		
		txtStockNiños = new JTextField();
		txtStockNiños.setEditable(false);
		txtStockNiños.setBounds(110, 94, 34, 20);
		contentPane.add(txtStockNiños);
		txtStockNiños.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("Subtotal $");
		lblSubtotal.setBounds(20, 123, 57, 16);
		contentPane.add(lblSubtotal);
		
		txtSubtotalNiños = new JTextField();
		txtSubtotalNiños.setEditable(false);
		txtSubtotalNiños.setBounds(80, 121, 90, 20);
		contentPane.add(txtSubtotalNiños);
		txtSubtotalNiños.setColumns(10);
		
		JLabel lblDiscapacitados = new JLabel("Discapacitados /");
		lblDiscapacitados.setBounds(10, 168, 94, 16);
		contentPane.add(lblDiscapacitados);
		
		JLabel lblEdad = new JLabel("3\u00B0 Edad");
		lblEdad.setBounds(10, 183, 43, 16);
		contentPane.add(lblEdad);
		
		txtCantAbuelo = new JTextField();
		txtCantAbuelo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantAbuelo.setText("0");
		txtCantAbuelo.setBounds(107, 180, 25, 20);
		contentPane.add(txtCantAbuelo);
		txtCantAbuelo.setColumns(10);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(136, 180, 3, 16);
		contentPane.add(label_1);
		
		txtStockAbuelo = new JTextField();
		txtStockAbuelo.setEditable(false);
		txtStockAbuelo.setBounds(142, 181, 34, 20);
		contentPane.add(txtStockAbuelo);
		txtStockAbuelo.setColumns(10);
		
		JLabel lblSubtotal_1 = new JLabel("Subtotal $");
		lblSubtotal_1.setBounds(20, 211, 57, 16);
		contentPane.add(lblSubtotal_1);
		
		txtSubtotalAbuelo = new JTextField();
		txtSubtotalAbuelo.setEditable(false);
		txtSubtotalAbuelo.setBounds(80, 209, 90, 20);
		contentPane.add(txtSubtotalAbuelo);
		txtSubtotalAbuelo.setColumns(10);
		
		JLabel lblGeneral = new JLabel("General");
		lblGeneral.setBounds(10, 256, 44, 16);
		contentPane.add(lblGeneral);
		
		txtCantGral = new JTextField();
		txtCantGral.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantGral.setText("0");
		txtCantGral.setBounds(75, 256, 25, 20);
		contentPane.add(txtCantGral);
		txtCantGral.setColumns(10);
		
		JLabel label_2 = new JLabel("/");
		label_2.setBounds(101, 256, 3, 16);
		contentPane.add(label_2);
		
		txtStockGral = new JTextField();
		txtStockGral.setEditable(false);
		txtStockGral.setBounds(110, 256, 34, 20);
		contentPane.add(txtStockGral);
		txtStockGral.setColumns(10);
		
		JLabel lblSubtotal_2 = new JLabel("Subtotal $");
		lblSubtotal_2.setBounds(20, 287, 57, 16);
		contentPane.add(lblSubtotal_2);
		
		txtSubtotalGral = new JTextField();
		txtSubtotalGral.setEditable(false);
		txtSubtotalGral.setBounds(80, 285, 90, 20);
		contentPane.add(txtSubtotalGral);
		txtSubtotalGral.setColumns(10);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setBounds(225, 131, 98, 26);
		contentPane.add(btnReservar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReserva abrir = new VentanaReserva();
				abrir.setVisible(true);
				InterfazReserva.this.dispose();
			}
		});
		btnAtras.setBounds(225, 178, 98, 26);
		contentPane.add(btnAtras);
		
		JLabel lblCostoTotalReserva = new JLabel("Costo Total Reserva");
		lblCostoTotalReserva.setBounds(62, 328, 114, 16);
		contentPane.add(lblCostoTotalReserva);
		
		JLabel label_3 = new JLabel("$");
		label_3.setBounds(75, 350, 7, 16);
		contentPane.add(label_3);
		
		txtTotalReserva = new JTextField();
		txtTotalReserva.setEditable(false);
		txtTotalReserva.setBounds(84, 350, 90, 20);
		contentPane.add(txtTotalReserva);
		txtTotalReserva.setColumns(10);
	}
}

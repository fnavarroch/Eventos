package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazEliminarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtRutReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEliminarReserva frame = new InterfazEliminarReserva();
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
	public InterfazEliminarReserva() {
		setTitle("Eliminar Reserva");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 262, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRutDel = new JLabel("Ingrese Rut del Cliente ");
		lblIngreseRutDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseRutDel.setBounds(58, 11, 130, 16);
		contentPane.add(lblIngreseRutDel);
		
		txtRutReserva = new JTextField();
		txtRutReserva.setBounds(68, 38, 114, 20);
		contentPane.add(txtRutReserva);
		txtRutReserva.setColumns(10);
		
		JButton btnEliminarReserva = new JButton("Eliminar Reserva");
		btnEliminarReserva.setBounds(58, 86, 130, 26);
		contentPane.add(btnEliminarReserva);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReserva abrir = new VentanaReserva();
				abrir.setVisible(true);
				InterfazEliminarReserva.this.dispose();
			}
		});
		btnAtras.setBounds(75, 123, 98, 26);
		contentPane.add(btnAtras);
	}

}

package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaReserva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaReserva frame = new VentanaReserva();
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
	public VentanaReserva() {
		setTitle("Menu Reserva");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 242, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazReserva abrir = new InterfazReserva();
				abrir.setVisible(true);
				VentanaReserva.this.dispose();
			}
		});
		btnRealizarReserva.setBounds(54, 16, 137, 26);
		contentPane.add(btnRealizarReserva);
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazEliminarReserva abrir = new InterfazEliminarReserva();
				abrir.setVisible(true);
				VentanaReserva.this.dispose();
			}
		});
		btnCancelarReserva.setBounds(54, 91, 137, 26);
		contentPane.add(btnCancelarReserva);
		
		JButton btnModificarReserva = new JButton("Modificar Reserva");
		btnModificarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarReserva abrir = new InterfazModificarReserva();
				abrir.setVisible(true);
				VentanaReserva.this.dispose();
			}
		});
		btnModificarReserva.setBounds(54, 54, 137, 26);
		contentPane.add(btnModificarReserva);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				VentanaReserva.this.dispose();
			}
		});
		btnAtras.setBounds(78, 128, 98, 26);
		contentPane.add(btnAtras);
	}
}

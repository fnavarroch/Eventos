package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

@SuppressWarnings("serial")
public class VentanaCharlas extends JFrame {

	private JPanel contentPane;
	private JTable tablaCharlas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCharlas frame = new VentanaCharlas();
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
	public VentanaCharlas() {
		setResizable(false);
		setTitle("Charlas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 446, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblListaDeCharlas = new JLabel("Lista de Charlas Disponibles");
		lblListaDeCharlas.setBounds(10, 11, 233, 14);
		panel.add(lblListaDeCharlas);
		
		JLabel lblParaRealizarReservas = new JLabel("Para Realizar Reservas de una Charla, Seleccione la Charla y ");
		lblParaRealizarReservas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblParaRealizarReservas.setBounds(10, 37, 379, 16);
		panel.add(lblParaRealizarReservas);
		
		tablaCharlas = new JTable();
		tablaCharlas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Ciudad", "Sede", "Fecha"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaCharlas.getColumnModel().getColumn(0).setResizable(false);
		tablaCharlas.getColumnModel().getColumn(1).setResizable(false);
		tablaCharlas.getColumnModel().getColumn(1).setPreferredWidth(156);
		tablaCharlas.getColumnModel().getColumn(2).setResizable(false);
		tablaCharlas.getColumnModel().getColumn(2).setPreferredWidth(99);
		tablaCharlas.getColumnModel().getColumn(3).setResizable(false);
		tablaCharlas.getColumnModel().getColumn(3).setPreferredWidth(106);
		tablaCharlas.getColumnModel().getColumn(4).setResizable(false);
		tablaCharlas.setBounds(12, 88, 393, 132);
		panel.add(tablaCharlas);
		
		JLabel label = new JLabel("luego presione el boton \"Menu Reserva\"");
		label.setFont(new Font("Dialog", Font.PLAIN, 12));
		label.setBounds(10, 50, 228, 16);
		panel.add(label);
		/**
		 * Acceso a menu de reserva segun el evento seleccionado
		 * se pasa por parametro el id del evento para realizar la reserva
		 */
		JButton btnMenuReserva = new JButton("Menu Reserva");
		btnMenuReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaReserva abrir = new VentanaReserva();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnMenuReserva.setBounds(10, 232, 115, 26);
		panel.add(btnMenuReserva);
		/**
		 * Acceso al Menu Cliente para Agregar modificar o Eliminar a un cliente
		 */
		JButton btnMenuCliente = new JButton("Menu Cliente");
		btnMenuCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCliente abrir = new VentanaCliente();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnMenuCliente.setBounds(145, 232, 107, 26);
		panel.add(btnMenuCliente);
		/**
		 * Acceso al menu de Charlas para Agregar, modificar o eliminar una charla especifica
		 */
		JButton btnMenuCharla = new JButton("Menu Charla");
		btnMenuCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazCharla abrir = new InterfazCharla();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnMenuCharla.setBounds(277, 232, 105, 26);
		panel.add(btnMenuCharla);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnAtras.setBounds(307, 280, 98, 26);
		panel.add(btnAtras);
		
		JButton btnMenuSede = new JButton("Menu Sede");
		btnMenuSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSede abrir = new VentanaSede();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnMenuSede.setBounds(10, 270, 115, 26);
		panel.add(btnMenuSede);
	}
}

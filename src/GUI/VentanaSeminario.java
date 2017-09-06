package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class VentanaSeminario extends JFrame {

	private JPanel contentPane;
	private JTable tablaSeminario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSeminario frame = new VentanaSeminario();
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
	public VentanaSeminario() {
		setTitle("Seminarios");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 428, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeSeminarios = new JLabel("Lista de Seminarios Disponibles");
		lblListaDeSeminarios.setBounds(10, 11, 182, 16);
		contentPane.add(lblListaDeSeminarios);
		
		tablaSeminario = new JTable();
		tablaSeminario.setModel(new DefaultTableModel(
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
		tablaSeminario.getColumnModel().getColumn(0).setResizable(false);
		tablaSeminario.getColumnModel().getColumn(1).setResizable(false);
		tablaSeminario.getColumnModel().getColumn(1).setPreferredWidth(141);
		tablaSeminario.getColumnModel().getColumn(2).setResizable(false);
		tablaSeminario.getColumnModel().getColumn(2).setPreferredWidth(102);
		tablaSeminario.getColumnModel().getColumn(3).setResizable(false);
		tablaSeminario.getColumnModel().getColumn(3).setPreferredWidth(100);
		tablaSeminario.getColumnModel().getColumn(4).setResizable(false);
		tablaSeminario.setBounds(10, 89, 393, 132);
		contentPane.add(tablaSeminario);
		/**
		 * Acesso al menu de Reserva segun el evento Seleccionado
		 * Se envia Por parametro el id del Evento seleccionado Para realizar la reserva
		 */
		JButton btnReservar = new JButton("Menu Reserva");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaReserva abrir = new VentanaReserva();
				abrir.setVisible(true);
				VentanaSeminario.this.dispose();
			}
		});
		btnReservar.setBounds(10, 252, 115, 26);
		contentPane.add(btnReservar);
		/**
		 * Acceso al menu de cliente para Manejar los distintos datos de los Clientes
		 */
		JButton btnMenuCliente = new JButton("Menu Cliente");
		btnMenuCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCliente abrir = new VentanaCliente();
				abrir.setVisible(true);
				VentanaSeminario.this.dispose();
			}
		});
		btnMenuCliente.setBounds(145, 252, 107, 26);
		contentPane.add(btnMenuCliente);
		/**
		 * Boton de acceder al menu del Seminario donde se se pueden Agregar modificar o eliminar los seminarios
		 */
		JButton btnMenuSeminario = new JButton("Menu Seminario");
		btnMenuSeminario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazSeminario abrir = new InterfazSeminario();
				abrir.setVisible(true);
				VentanaSeminario.this.dispose();
			}
		});
		btnMenuSeminario.setBounds(268, 252, 126, 26);
		contentPane.add(btnMenuSeminario);
		/**
		 * Regresa al Menu Principal
		 */
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				VentanaSeminario.this.dispose();
			}
		});
		btnAtras.setBounds(312, 296, 98, 26);
		contentPane.add(btnAtras);
		
		JLabel lblParaRealizarReservas = new JLabel("Para Realizar Reservas de un Seminario Seleccione el seminario y ");
		lblParaRealizarReservas.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblParaRealizarReservas.setBounds(12, 39, 379, 16);
		contentPane.add(lblParaRealizarReservas);
		
		JLabel lblLuegoPresioneEl = new JLabel("luego presione el boton \"Menu Reserva\"");
		lblLuegoPresioneEl.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblLuegoPresioneEl.setBounds(12, 52, 228, 16);
		contentPane.add(lblLuegoPresioneEl);
		
		JButton btnMenuSede = new JButton("Menu Sede");
		btnMenuSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSede abrir = new VentanaSede();
				abrir.setVisible(true);
				VentanaSeminario.this.dispose();
			}
		});
		btnMenuSede.setBounds(10, 290, 115, 26);
		contentPane.add(btnMenuSede);
	}
}

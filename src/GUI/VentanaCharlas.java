package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaCharlas extends JFrame {

	private JPanel contentPane;

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
		setTitle("Charlas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBounds(10, 29, 177, 20);
		panel.add(comboBox);
		
		JLabel lblListaDeCharlas = new JLabel("Lista de Charlas Disponibles");
		lblListaDeCharlas.setBounds(10, 11, 233, 14);
		panel.add(lblListaDeCharlas);
		
		JButton btnAgregarNuevaCharla = new JButton("Agregar Nueva Charla");
		btnAgregarNuevaCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarCharla abrir = new InterfazAgregarCharla();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnAgregarNuevaCharla.setBounds(186, 134, 158, 26);
		panel.add(btnAgregarNuevaCharla);
		
		JButton btnModificarCharla = new JButton("Modificar Charla");
		btnModificarCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarCharla abrir = new InterfazModificarCharla();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnModificarCharla.setBounds(186, 174, 155, 23);
		panel.add(btnModificarCharla);
		
		JButton btnEliminarCharla = new JButton("Eliminar Charla");
		btnEliminarCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazEliminarCharla abrir = new InterfazEliminarCharla();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnEliminarCharla.setBounds(186, 208, 155, 23);
		panel.add(btnEliminarCharla);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				VentanaCharlas.this.dispose();
			}
		});
		btnAtras.setBounds(225, 248, 89, 23);
		panel.add(btnAtras);
	}
}

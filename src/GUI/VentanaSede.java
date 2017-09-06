package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaSede extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSede frame = new VentanaSede();
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
	public VentanaSede() {
		setResizable(false);
		setTitle("Sedes");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 231, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregarSede = new JButton("Agregar Sede");
		btnAgregarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarSede abrir = new InterfazAgregarSede();
				abrir.setVisible(true);
				VentanaSede.this.dispose();
			}
		});
		btnAgregarSede.setBounds(50, 53, 119, 26);
		contentPane.add(btnAgregarSede);
		
		JButton btnModificarSede = new JButton("Modificar Sede");
		btnModificarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarSede abrir = new InterfazModificarSede();
				abrir.setVisible(true);
				VentanaSede.this.dispose();
			}
		});
		btnModificarSede.setBounds(50, 90, 119, 26);
		contentPane.add(btnModificarSede);
		
		JButton btnEliminarSede = new JButton("Eliminar Sede");
		btnEliminarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazEliminarSede abrir = new InterfazEliminarSede();
				abrir.setVisible(true);
				VentanaSede.this.dispose();
			}
		});
		btnEliminarSede.setBounds(50, 127, 119, 26);
		contentPane.add(btnEliminarSede);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				VentanaSede.this.dispose();
			}
		});
		btnAtras.setBounds(60, 164, 98, 26);
		contentPane.add(btnAtras);
	}

}

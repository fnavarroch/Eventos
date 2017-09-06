package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazCharla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCharla frame = new InterfazCharla();
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
	public InterfazCharla() {
		setTitle("Menu Charla");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 217, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregarCharla = new JButton("Agregar Charla");
		btnAgregarCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarCharla abrir = new InterfazAgregarCharla();
				abrir.setVisible(true);
				InterfazCharla.this.dispose();
			}
		});
		btnAgregarCharla.setBounds(34, 33, 127, 26);
		contentPane.add(btnAgregarCharla);
		
		JButton btnModificarCharla = new JButton("Modificar Charla");
		btnModificarCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarReserva abrir = new InterfazModificarReserva();
				abrir.setVisible(true);
				InterfazCharla.this.dispose();
			}
		});
		btnModificarCharla.setBounds(34, 70, 127, 26);
		contentPane.add(btnModificarCharla);
		
		JButton btnEliminarCharla = new JButton("Eliminar Charla");
		btnEliminarCharla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazEliminarCharla abrir = new InterfazEliminarCharla();
				abrir.setVisible(true);
				InterfazCharla.this.dispose();
			}
		});
		btnEliminarCharla.setBounds(34, 106, 127, 26);
		contentPane.add(btnEliminarCharla);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				InterfazCharla.this.dispose();
			}
		});
		btnAtras.setBounds(49, 143, 98, 26);
		contentPane.add(btnAtras);
	}
}

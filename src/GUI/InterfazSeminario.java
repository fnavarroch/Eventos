package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazSeminario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazSeminario frame = new InterfazSeminario();
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
	public InterfazSeminario() {
		setTitle("Menu Seminario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 239, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregarSeminario = new JButton("Agregar Seminario");
		btnAgregarSeminario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazAgregarSeminario abrir = new InterfazAgregarSeminario();
				abrir.setVisible(true);
				InterfazSeminario.this.dispose();
			}
		});
		btnAgregarSeminario.setBounds(41, 39, 148, 26);
		contentPane.add(btnAgregarSeminario);
		
		JButton btnModificarSeminario = new JButton("Modificar Seminario");
		btnModificarSeminario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazModificarSeminario abrir = new InterfazModificarSeminario();
				abrir.setVisible(true);
				InterfazSeminario.this.dispose();
			}
		});
		btnModificarSeminario.setBounds(41, 76, 148, 26);
		contentPane.add(btnModificarSeminario);
		
		JButton btnEliminarSeminario = new JButton("Eliminar Seminario");
		btnEliminarSeminario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazEliminarSeminario abrir = new InterfazEliminarSeminario();
				abrir.setVisible(true);
				InterfazSeminario.this.dispose();
			}
		});
		btnEliminarSeminario.setBounds(41, 113, 148, 26);
		contentPane.add(btnEliminarSeminario);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio abrir = new MenuInicio();
				abrir.setVisible(true);
				InterfazSeminario.this.dispose();
			}
		});
		btnAtras.setBounds(69, 150, 98, 26);
		contentPane.add(btnAtras);
	}

}

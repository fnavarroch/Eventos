package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class InterfazEliminarCharla extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEliminarCharla frame = new InterfazEliminarCharla();
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
	public InterfazEliminarCharla() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 214, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCharlas abrir = new VentanaCharlas();
				abrir.setVisible(true);
				InterfazEliminarCharla.this.dispose();
			}
		});
		btnAtras.setBounds(49, 136, 89, 23);
		panel.add(btnAtras);
		
		JButton btnEliminarCharla = new JButton("Eliminar Charla");
		btnEliminarCharla.setBounds(24, 102, 140, 23);
		panel.add(btnEliminarCharla);
		
		txtIDEliminar = new JTextField();
		txtIDEliminar.setToolTipText("");
		txtIDEliminar.setBounds(52, 56, 86, 20);
		panel.add(txtIDEliminar);
		txtIDEliminar.setColumns(10);
		
		JLabel lblIngreseIdDe = new JLabel("Ingrese Id de Charla a Eliminar");
		lblIngreseIdDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseIdDe.setBounds(10, 11, 184, 34);
		panel.add(lblIngreseIdDe);
	}

}

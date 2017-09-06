package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazEliminarSeminario extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdSeminario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEliminarSeminario frame = new InterfazEliminarSeminario();
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
	public InterfazEliminarSeminario() {
		setTitle("Eliminar Seminario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 241, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseIdDel = new JLabel("Ingrese Id del Seminario a Eliminar");
		lblIngreseIdDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseIdDel.setBounds(10, 11, 196, 16);
		contentPane.add(lblIngreseIdDel);
		
		txtIdSeminario = new JTextField();
		txtIdSeminario.setToolTipText("");
		txtIdSeminario.setColumns(10);
		txtIdSeminario.setBounds(66, 51, 86, 20);
		contentPane.add(txtIdSeminario);
		
		JButton btnEliminarSeminario = new JButton("Eliminar Seminario");
		btnEliminarSeminario.setBounds(42, 99, 141, 26);
		contentPane.add(btnEliminarSeminario);
		
		JButton button_1 = new JButton("Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaSeminario abrir = new VentanaSeminario();
				abrir.setVisible(true);
				InterfazEliminarSeminario.this.dispose();
			}
		});
		button_1.setBounds(66, 137, 89, 23);
		contentPane.add(button_1);
	}
}

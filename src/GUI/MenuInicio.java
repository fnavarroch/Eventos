package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

@SuppressWarnings("serial")
public class MenuInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuInicio frame = new MenuInicio();
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
	public MenuInicio() {
		setTitle("Comaticket");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 301, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAccesoCharlas = new JButton("Charlas");
		btnAccesoCharlas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAccesoCharlas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaCharlas abrir = new VentanaCharlas();
				abrir.setVisible(true);
				MenuInicio.this.dispose();
			}
		});
		btnAccesoCharlas.setBounds(70, 141, 155, 51);
		panel.add(btnAccesoCharlas);
		
		JButton btnAccesoSeminarios = new JButton("Seminarios");
		btnAccesoSeminarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSeminario abrir = new VentanaSeminario();
				abrir.setVisible(true);
				MenuInicio.this.dispose();
			}
		});
		btnAccesoSeminarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAccesoSeminarios.setBounds(70, 204, 155, 51);
		panel.add(btnAccesoSeminarios);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCerrar.setBounds(103, 267, 98, 26);
		panel.add(btnCerrar);
		
		JLabel lblBievenidosA = new JLabel("Bievenidos a ");
		lblBievenidosA.setBounds(105, 50, 75, 16);
		panel.add(lblBievenidosA);
		
		JLabel lblComaticket = new JLabel("COMATICKET");
		lblComaticket.setForeground(Color.BLUE);
		lblComaticket.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		lblComaticket.setBounds(53, 78, 194, 33);
		panel.add(lblComaticket);
	}
}

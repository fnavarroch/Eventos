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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		btnAccesoCharlas.setBounds(92, 49, 106, 51);
		panel.add(btnAccesoCharlas);
		
		JButton btnAccesoSeminarios = new JButton("Seminarios");
		btnAccesoSeminarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAccesoSeminarios.setBounds(70, 133, 155, 51);
		panel.add(btnAccesoSeminarios);
	}
}

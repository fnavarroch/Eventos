package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.ListaLocal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InterfazEliminarSede extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdSede;
	private ListaLocal lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEliminarSede frame = new InterfazEliminarSede();
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
	public InterfazEliminarSede() {
		setTitle("Eliminar Sede");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 259, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseElCodigo = new JLabel("Ingrese el Codigo Identificador de la sede");
		lblIngreseElCodigo.setBounds(10, 42, 233, 16);
		contentPane.add(lblIngreseElCodigo);
		
		txtIdSede = new JTextField();
		txtIdSede.setBounds(57, 83, 114, 20);
		contentPane.add(txtIdSede);
		txtIdSede.setColumns(10);
		
		JButton btnEliminarSede = new JButton("Eliminar Sede");
		btnEliminarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lista.eliminarSedes(Integer.parseInt(txtIdSede.getText()))) {
					JOptionPane.showMessageDialog(null, "Sede Eliminada Correctamente");
				}
				else {
					JOptionPane.showMessageDialog(null, "No existe la Sede");
				}
			}
		});
		btnEliminarSede.setBounds(57, 127, 112, 26);
		contentPane.add(btnEliminarSede);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSede abrir = new VentanaSede();
				abrir.setVisible(true);
				InterfazEliminarSede.this.dispose();
			}
		});
		btnAtras.setBounds(57, 181, 114, 26);
		contentPane.add(btnAtras);
	}

}

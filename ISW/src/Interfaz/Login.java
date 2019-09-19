package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

import Clases.Sesion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txtusuario;
	private JTextField txtcontrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbluser = new JLabel("Usuario");
		lbluser.setBounds(34, 68, 47, 29);
		frame.getContentPane().add(lbluser);

		txtusuario = new JTextField();
		txtusuario.setBounds(108, 72, 127, 20);
		frame.getContentPane().add(txtusuario);
		txtusuario.setColumns(10);

		JLabel lblpassword = new JLabel("Contrase\u00F1a");
		lblpassword.setBounds(34, 108, 70, 14);
		frame.getContentPane().add(lblpassword);

		txtcontrasenia = new JTextField();
		txtcontrasenia.setBounds(108, 105, 127, 20);
		frame.getContentPane().add(txtcontrasenia);
		txtcontrasenia.setColumns(10);

		JButton ingresar = new JButton("Ingresar");
		ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String[] usuarios = { "admin" };
				String[] contrasenia = new String[1];
				contrasenia[0]= "123";
				

				String usuario = txtusuario.getText();
				String password = txtcontrasenia.getText();
				boolean mensaje = false;
				
for(int i = 0; i<usuarios.length; i++) {
				
				if (usuarios[i].equals(usuario) && contrasenia[i].equals(password)) {
					mensaje=true;					
				}
}
				if (mensaje) {

					bienvenida frm = new bienvenida();
					frm.setVisible(true);
					this.dispose();

				} else {
					JOptionPane.showMessageDialog(null, "usuario o contraseña incorrectos");
					txtusuario.setText("");
					txtcontrasenia.setText("");

				}

			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		ingresar.setBounds(267, 172, 89, 23);
		frame.getContentPane().add(ingresar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(34, 172, 89, 23);
		frame.getContentPane().add(btnSalir);
	}
}

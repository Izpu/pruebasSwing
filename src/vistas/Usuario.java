package vistas;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Usuario {
	private JFrame jf;
	private JPanel jp, jpN, jpA, jpU, jpP;
	private JLabel jlN,jlA,jlU,jlP;
	private JTextField jtN, jtA, jtU,jtP;
	private Container con, conp, conN, conA, conU, conP;
public Usuario()
{
	jf=new JFrame("Gestión de usuarios");
	con=jf.getContentPane();
	jp=new JPanel(new GridLayout(4, 1));
	
	montarJPanel();
	con.add(jp);
	jf.setVisible(true);
//	jf.pack();
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
}
private void montarJPanel()
{
	Dimension d=new Dimension();
	d=Toolkit.getDefaultToolkit().getScreenSize();
	jf.setSize(d);
	jf.setLocation(0, 0);
	montarNombre();
	montarApellido();
	montarUsuario();
	montarPassword();
//	jpN.repaint();
//	jpN.setVisible(true);
}
private void montarNombre()
{
	jpN=new JPanel(new GridLayout(2, 1));
	jlN=new JLabel("Nombre");
	jpN.add(jlN);
	jtN=new JTextField();
	jtN.setText("Introduzca el nombre real del usuario");
	jpN.add(jtN);
	jp.add(jpN);
}
private void montarApellido()
{
	jpA=new JPanel(new GridLayout(2, 1));
	jlA=new JLabel("Apellidos");
	jpA.add(jlA);
	jtA=new JTextField();
	jtA.setText("Introduzca los apellidos del usuario");
	jpA.add(jtA);
	jp.add(jpA);
}
private void montarUsuario()
{
	jpU=new JPanel(new GridLayout(2, 1));
	jlU=new JLabel("Nombre de Usuario");
	jpU.add(jlU);
	jtU=new JTextField();
	jtU.setText("Introduzca el usuario de acceso a la aplicación");
	jpU.add(jtU);
	jp.add(jpU);
}
private void montarPassword()
{
	jpP=new JPanel(new GridLayout(2, 1));
	jlP=new JLabel("Contraseña de acceso");
	jpP.add(jlP);
	jtP=new JTextField();
	jtP.setText("Introduzca la contraseña de acceso a la aplicación");
	jpP.add(jtP);
	jp.add(jpP);
}
}

import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame{
	JFormattedTextField format1 = new JFormattedTextField();
	public VentanaPrincipal() {
		
		getContentPane().setLayout(null);
		setSize(700,550);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panelUno = new JPanel(null);
		panelUno.setBackground(Color.WHITE);
		panelUno.setBounds(0, 0,700, 550);
		
		
		JLabel lbl1=new JLabel("The Classic Form includes all visible fields for");
		lbl1.setBounds(15, 15, 270, 25);
		panelUno.add(lbl1);
		
		JLabel lbl2=new JLabel("this list");
		lbl2.setBounds(15, 28, 270, 25);
		panelUno.add(lbl2);
		
		JLabel lbl3=new JLabel("Form options");
		lbl3.setBounds(15, 45, 150, 35);
		lbl3.setFont(new Font("Arial Black", Font.BOLD, 16));
		panelUno.add(lbl3);
		
		JLabel lbl4=new JLabel("invlude the following");
		lbl4.setBounds(15, 70, 150, 25);
		panelUno.add(lbl4);
		
		
		
		//
		add(panelUno);
	}
	

}//class

public class PruebaFormularioNullLayout {
public static void main(String[] args) {
	new VentanaPrincipal();
}
}

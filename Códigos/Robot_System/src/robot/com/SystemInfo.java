package robot.com;

import java.awt.Font;

import javax.swing.*;

@SuppressWarnings("serial")
public class SystemInfo extends JFrame {
	
	private JLabel espacoLabel, labelProgram;
	
	public SystemInfo(){
		
		
		this.setVisible(true);
		this.setBounds(300, 250, 400, 300);
		this.setTitle("System Informations");
		this.getContentPane().setLayout(null);
		
		espacoLabel = new JLabel();
		espacoLabel.setText("<html><div width='423' height='450'></div></html>");
		espacoLabel.setBounds(0, 2, 500, 110);
		espacoLabel.setFont(new Font("Sannserif", 1, 20));
		this.add(espacoLabel);
		
		labelProgram = new JLabel();
		labelProgram.setBounds(5, 5, 250, 120);
		labelProgram.setText("<html>Informações do programa<br><br/>"
				+ "Versao: 1.0</html>");
		espacoLabel.add(labelProgram);
		
		
	}
}

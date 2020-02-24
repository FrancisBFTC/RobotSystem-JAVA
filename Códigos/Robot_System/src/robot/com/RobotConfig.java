package robot.com;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

@SuppressWarnings("serial")
public class RobotConfig extends JFrame {
	
		private JLabel espacoMoviment, espacoProgramming, espaco2, moviment, eixoNorte, eixoSul, eixoLeste, eixoOeste;
		private JLabel downLine, downLine2, downLine3;
		private JTextField norte, sul, leste, oeste;
		private JButton salvar;
		
		public RobotConfig(){
		
			this.setBounds(500, 150, 400, 500);
			this.setTitle("Configuração do Robô");
			this.getContentPane().setLayout(null);
			
			espacoMoviment = new JLabel();
			espacoMoviment.setText("<html><div width='423' height='450'></div></html>");
			espacoMoviment.setBounds(0, 2, 383, 110);
			espacoMoviment.setFont(new Font("Sannserif", 1, 20));
			this.add(espacoMoviment);
			
			espacoProgramming = new JLabel();
			espacoProgramming.setText("<html><div width='473' height='450'></div></html>");
			espacoProgramming.setBounds(0, 110, 383, 110);
			espacoProgramming.setFont(new Font("Sannserif", 1, 20));
			this.add(espacoProgramming);
			
			espaco2 = new JLabel();
			espaco2.setText("<html><div width='473' height='450'></div></html>");
			espaco2.setBounds(0, 223, 383, 110);
			espaco2.setFont(new Font("Sannserif", 1, 20));
			this.add(espaco2);
			
			moviment = new JLabel();
			moviment.setText("movimento em graus");
			moviment.setBounds(5, 5, 150, 20);
			espacoMoviment.add(moviment);
			
			
			
			eixoNorte = new JLabel();
			eixoNorte.setText("Up");
			eixoNorte.setBounds(5, 30, 150, 20);
			espacoMoviment.add(eixoNorte);
			
			norte = new JTextField();
			norte.setBounds(40, 30, 40, 20);
			norte.setBackground(Color.lightGray);
			espacoMoviment.add(norte);
			
			
			eixoSul = new JLabel();
			eixoSul.setText("Down");
			eixoSul.setBounds(5, 70, 150, 20);
			espacoMoviment.add(eixoSul);
			
			sul = new JTextField();
			sul.setBounds(40, 70, 40, 20);
			sul.setBackground(Color.lightGray);
			espacoMoviment.add(sul);
			
			eixoLeste = new JLabel();
			eixoLeste.setText("Right");
			eixoLeste.setBounds(90, 30, 150, 20);
			espacoMoviment.add(eixoLeste);
			
			leste = new JTextField();
			leste.setBounds(130, 30, 40, 20);
			leste.setBackground(Color.lightGray);
			espacoMoviment.add(leste);
			
			eixoOeste = new JLabel();
			eixoOeste.setText("Left");
			eixoOeste.setBounds(90, 70, 150, 20);
			espacoMoviment.add(eixoOeste);
			
			oeste = new JTextField();
			oeste.setBounds(130, 70, 40, 20);
			oeste.setBackground(Color.lightGray);
			espacoMoviment.add(oeste);
			
			downLine = new JLabel();
			downLine.setText("______________________________________________________");
			downLine.setForeground(Color.lightGray);
			downLine.setBounds(2, 90, 400, 20);
			downLine.isOpaque();
			espacoMoviment.add(downLine);
			
			downLine2 = new JLabel();
			downLine2.setText("______________________________________________________");
			downLine2.setForeground(Color.lightGray);
			downLine2.setBounds(2, 90, 400, 20);
			espacoProgramming.add(downLine2);
			
			downLine3 = new JLabel();
			downLine3.setText("______________________________________________________");
			downLine3.setForeground(Color.lightGray);
			downLine3.setBounds(2, 90, 400, 20);
			espaco2.add(downLine3);
			
			salvar = new JButton();
			salvar.setBounds(280, 435, 100, 20);
			salvar.setText("salvar");
			this.add(salvar);
		}
}

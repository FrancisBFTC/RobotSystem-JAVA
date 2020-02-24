package robot.com;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Conversation extends JFrame{
	
	private JLabel titulo, label;
	private JTextField texto;
	private JTextArea textoPainel;
	public JButton botao;
	public String msg;
	public String txt;
	
	public Conversation(){
			
			this.setBounds(300, 250, 400, 300);
			this.setTitle("Conversação Robótica");
			this.getContentPane().setLayout(null);
			
		
			
			titulo = new JLabel();
			titulo.setText("<html><div bgcolor='Red' width='500' height='50'>Painel de comunicação</div></html>");
			titulo.setBounds(0, 2, 380, 55);
			titulo.setForeground(Color.blue);
			titulo.setFont(new Font("Sannserif", 1, 20));
			this.add(titulo);
			
			label = new JLabel();
			label.setText("Digite algo:");
			label.setBounds(50, 50, 130 , 40);
			label.setForeground(Color.red);
			this.add(label);
			
			texto = new JTextField();
			texto.setBounds(50, 80, 190 , 20);
			this.add(texto);
			
			botao = new JButton();	
			botao.setText("Enviar");
			botao.setBounds(270, 80, 70 , 20);	
			this.add(botao);
			
			textoPainel = new JTextArea();
			textoPainel.setBounds(50, 120, 290 , 120);
			textoPainel.setBorder(null);
			textoPainel.setForeground(Color.white);
			textoPainel.setBackground(Color.black);
			this.add(textoPainel);
			
			texto.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
					
				}
				
				@Override
				public void keyReleased(KeyEvent arg0) {
					
					
				}
				
				@Override
				public void keyPressed(KeyEvent arg0) {
					if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
						String text = texto.getText();
						if(text.isEmpty()){
							texto.setText(null);
						erroVazio();
						}else{
							texto.setText(null);
							textoPainel.setText(text);
						}
					}
					
				}
			});
			
			
			botao.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					txt = texto.getText();
					textoPainel.setText(txt);
			
					
				}
			});
			
	}

		private void erroVazio(){
			
			JOptionPane.showMessageDialog(this, "<html><font color='red'>Erro! não contém nenhum texto aqui! :(</font></html>");
			
		}
	
	
}

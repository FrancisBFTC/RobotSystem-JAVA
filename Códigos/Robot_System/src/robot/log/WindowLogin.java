package robot.log;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import robot.com.Comunication;

@SuppressWarnings("serial")
public class WindowLogin extends JFrame {
	
	private JLabel label;
	private JLabel labelLog;
	private JLabel labelName;
	private JLabel labelPass;
	private JLabel textLabel;
	private JTextField userField;
	private JTextField passField;
	private JButton buttonLog;
	private String user;
	private String pass;
	
	public static void main(String[] args) {
		
		WindowLogin winlogin = new WindowLogin();
		winlogin.setVisible(true);
	
		
	
		
		

	}
	
	public WindowLogin(){
		
		
		this.setBounds(300, 250, 400, 300);
		this.setTitle("Janela de login");
		this.getContentPane().setLayout(null);
		
		ImageIcon icon;
		icon = new ImageIcon(getClass().getResource("/robot/img/RobotSystemPng.png"));
		this.setIconImage(icon.getImage());
		
		
		label = new JLabel();
		label.setText("<html><div bgcolor='Gray' width='500' height='50'>RobotSystem</div></html>");
		label.setBounds(0, 2, 380, 55);
		label.setForeground(Color.red);
		label.setFont(new Font("Sannserif", 1, 20));
		this.add(label);
		
		labelLog = new JLabel();
		labelLog.setText("Log In");
		labelLog.setForeground(Color.black);
		labelLog.setBounds(190, 65, 60, 40);
		labelLog.setFont(new Font("Sannserif", 1, 15));
		this.add(labelLog);
		
		labelName = new JLabel();
		labelName.setText("Nome:");
		labelName.setBounds(190, 110, 60, 40);
		this.add(labelName);
		
		labelPass = new JLabel();
		labelPass.setText("Senha:");
		labelPass.setBounds(190, 140, 60, 40);
		this.add(labelPass);
		
		userField = new JTextField();
		userField.setBounds(235, 122, 140, 20);
		this.add(userField);
		
		passField = new JTextField();
		passField.setBounds(235, 152, 140, 20);
		this.add(passField);
		
		buttonLog = new JButton();
		buttonLog.setText("Sign In");
		buttonLog.setBounds(190, 180, 90, 30);
		this.add(buttonLog);
		
		textLabel = new JLabel();
		textLabel.setBounds(180, 92, 200, 20);
		textLabel.setForeground(Color.red);
		this.add(textLabel);
		
		
		
		userField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
					
					user = userField.getText();
					pass = passField.getText();
					
					if(user.equals("wenderson") && pass.equals("1234")){
						Comunication com = new Comunication();
						com.setVisible(true);
						
						textLabel.setText(null);
						setVisible(false);
						
					}else{
						textLabel.setText("O usuario ou senha esta incorreto");
						userField.setText(null);
						passField.setText(null);
						
					}
				}
				
			}
		});
		
		passField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
					
					user = userField.getText();
					pass = passField.getText();
					
					if(user.equals("wenderson") && pass.equals("1234")){
						Comunication com = new Comunication();
						com.setVisible(true);
						
						textLabel.setText(null);
						setVisible(false);
						
					}else{
						textLabel.setText("O usuario ou senha esta incorreto");
						userField.setText(null);
						passField.setText(null);
						
					}
				}
				
			}
		});
		
		buttonLog.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				user = userField.getText();
				pass = passField.getText();
				
				if(user.equals("wenderson") && pass.equals("1234")){
					Comunication com = new Comunication();
					com.setVisible(true);
					
					textLabel.setText(null);
					setVisible(false);
					
				}else{
					textLabel.setText("O usuario ou senha esta incorreto");
					userField.setText(null);
					passField.setText(null);
					
				}
				
			}
		});
		
		
		
		
		
		
	}

	
	
	

}

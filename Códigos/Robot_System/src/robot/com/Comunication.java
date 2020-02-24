package robot.com;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import robot.log.*;
import java.awt.AWTException;  
import java.awt.Robot;
import java.awt.Rectangle;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.IOException;
import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class Comunication extends JFrame {
	
	//VARIAVEIS
	
	private JMenuBar menubar;
	private JMenu file_robot, edit, configuracao, help, about;
	private JMenuItem comunicacao, open_camera, save_camera, android_control, logout;
	private JMenuItem comunicacao1, open_camera1, save_camera1, android_control1;
	private JMenuItem edit_code, fonte_display, gravacao;
	private JMenuItem configurar_robo, configurar_audio, configurar_camera;
	private JMenuItem edit_code1, fonte_display1, gravacao1;
	private JMenuItem configurar_robo1, configurar_audio1, configurar_camera1;
	private JMenuItem manualProgram, systemInfo, seeMore, HowToCreate, ardroid;
	private JLabel label;
	private JPanel painel;
	private JButton comButton, camButton, audButton, robButton, disButton, codButton, ajuButton, outButton;
	private JButton comButton1, camButton1, audButton1, robButton1, disButton1, codButton1;
	private JButton comHide, camHide, audHide, robHide, disHide, codHide;
	private JButton ativButton, deslButton;
	private JButton grayBall, blueBall;
	private JLabel ativLabel;
	private JTextArea binLife1, binLife2, binLife3;
	
	public Comunication() {
		
		//INICIO
		
		this.setBounds(190, 150, 700, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Janela de Comunicação");
		
		this.setMinimumSize(new Dimension(700, 450));
		this.setMaximizedBounds(new Rectangle(190, 150, 700, 480));
		
	
		
		
		
		this.add(menubar = new JMenuBar());
		this.add(painel = new JPanel());
		Container container;
		painel.setBackground(Color.red);
		
		container = this.getContentPane();
		container.add(menubar, "North");
		label = new JLabel();
		label.setText("<html><div bgcolor='Gray' width='673' height='395'><h2 align='center'><font color='red'>Bem-vindo ao RobotSystem</font></h2><p align='center'><font color='white' size='3'>Você está no programa que manipula o ardroidmax, o termo 'ardroid' é a mistura de arduino e android, Porque o sistema robótico é composto por varios arduinos e programados para agir remotamente e android é pra lembrar que o sistema usa alguns aplicativos de celular como o droidcam que é a 'visão' do robô e explorer client que é a manipulação do android.Max é seu nome e max foi desenvolvido pra atender as necessidades humanas com uma inteligência amais, aproveite!</font></p></div></html>");
		label.setBounds(0, 2, 380, 55);
		label.setFont(new Font("Sannserif", 1, 20));
		
		painel.add(label);
		
		//BOTÕES.COM
		
		comButton = new JButton();
		comButton.setText("Comunication");
		comButton.setBounds(10, 160, 115, 30);
		comButton.setVisible(false);
		label.add(comButton);
		
		comHide = new JButton();
		comHide.setText("Close");
		comHide.setBounds(10, 160, 115, 30);
		comHide.setForeground(Color.blue);
		comHide.setVisible(false);
		label.add(comHide);
		
		
		
		comButton1 = new JButton();
		comButton1.setText("Comunication");
		comButton1.setBounds(10, 160, 115, 30);
		comButton1.setForeground(Color.LIGHT_GRAY);
		label.add(comButton1);
		comButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Comunicação Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}
		});
		
		comButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				comButton.setText("wait...");
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				comButton.setText("Comunication");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				comButton.setBackground(Color.red);
				comButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				comButton.setBackground(null);
				comButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		comButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				comHide.setVisible(true);
				comButton.setVisible(false);
				binLife1.setText("Comunicação está em execução...");
				binLife1.setForeground(Color.green);
				Conversation robotConversation;
				robotConversation = new Conversation();
				robotConversation.setVisible(true);
				

				comHide.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						binLife1.setText("A comunicação foi fechada!");
						binLife1.setForeground(Color.red);
						comButton.setVisible(true);
						comHide.setVisible(false);
						robotConversation.setVisible(false);
						String Taskkill_Other_bat = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Taskkill_Other_bat.bat";
						try {
							
							Runtime.getRuntime().exec(Taskkill_Other_bat);
							Thread.sleep(2000);
				           
				        } catch (Exception arg) {
				            arg.printStackTrace();
				        }
					}
				});
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						robotConversation.setVisible(false);
						
					}
				});
				String Taskkill_Other_bat = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Taskkill_Other_bat.bat";
				try {
					
					Runtime.getRuntime().exec(Taskkill_Other_bat);
					Thread.sleep(2000);
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
				String Batch_File_Com = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Batch_File_Com.bat";
				try {
		            
					Runtime.getRuntime().exec(Batch_File_Com);
		            
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
			}

		});
		

		camButton = new JButton();
		camButton.setText("Camera");
		camButton.setBounds(10, 210, 115, 30);
		camButton.setVisible(false);
		label.add(camButton);
		
		camHide = new JButton();
		camHide.setText("Close");
		camHide.setBounds(10, 210, 115, 30);
		camHide.setForeground(Color.blue);
		camHide.setVisible(false);
		label.add(camHide);
		
		
		
		camButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				camButton.setBackground(Color.red);
				camButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				camButton.setBackground(null);
				camButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		camButton1 = new JButton();
		camButton1.setText("Camera");
		camButton1.setBounds(10, 210, 115, 30);
		camButton1.setForeground(Color.LIGHT_GRAY);
		label.add(camButton1);
		camButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Filmagem Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}
		});

		camButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				camButton.setVisible(false);
				camHide.setVisible(true);
				binLife1.setText("Camera está em execução...");
				binLife1.setForeground(Color.green);
				String droidCam = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/DroidCam/DroidCamApp.exe";
				
				try {
		            
		 
		            
		            Runtime.getRuntime().exec(droidCam);
		           
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
		        
		        
				
				
			}
		});
		
		camHide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("A camera foi fechada!");
				binLife1.setForeground(Color.red);
				camButton.setVisible(true);
				camHide.setVisible(false);
				String taskkill_cam = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/taskkill_cam.bat";
				try {
					Runtime.getRuntime().exec(taskkill_cam);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		audButton = new JButton();
		audButton.setText("Audio");
		audButton.setBounds(10, 260, 115, 30);
		audButton.setVisible(false);
		label.add(audButton);
		
		audHide = new JButton();
		audHide.setText("Close");
		audHide.setBounds(10, 260, 115, 30);
		audHide.setForeground(Color.blue);
		audHide.setVisible(false);
		label.add(audHide);
		
		
		
		audButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				audButton.setBackground(Color.red);
				audButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				audButton.setBackground(null);
				audButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		audButton1 = new JButton();
		audButton1.setText("Audio");
		audButton1.setBounds(10, 260, 115, 30);
		audButton1.setForeground(Color.LIGHT_GRAY);
		label.add(audButton1);
		audButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Edição Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}
		});

		audButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				audButton.setVisible(false);
				audHide.setVisible(true);
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(300, 250, 400, 300);
				frame.setTitle("Configuração do audio");
				
				audHide.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						binLife1.setText("A edição foi fechada!");
						binLife1.setForeground(Color.red);
						audButton.setVisible(true);
						audHide.setVisible(false);
						frame.setVisible(false);
					}
				});
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						
					}
				});
				
			}
		});
		
		robButton = new JButton();
		robButton.setText("Robot");
		robButton.setBounds(547, 160, 115, 30);
		robButton.setVisible(false);
		label.add(robButton);
		
		robHide = new JButton();
		robHide.setText("Close");
		robHide.setBounds(547, 160, 115, 30);
		robHide.setForeground(Color.blue);
		robHide.setVisible(false);
		label.add(robHide);
		
		
		
		robButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				robButton.setBackground(Color.red);
				robButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				robButton.setBackground(null);
				robButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		robButton1 = new JButton();
		robButton1.setText("Robot");
		robButton1.setBounds(547, 160, 115, 30);
		robButton1.setForeground(Color.LIGHT_GRAY);
		label.add(robButton1);
		robButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Configuração Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}
		});

		robButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				robButton.setVisible(false);
				robHide.setVisible(true);
				binLife1.setText("Robô em configuração...");
				binLife1.setForeground(Color.green);
				RobotConfig robotConfig = new RobotConfig();
				robotConfig.setVisible(true);
				
				robHide.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						binLife1.setText("A configuração foi fechada!");
						binLife1.setForeground(Color.red);
						robButton.setVisible(true);
						robHide.setVisible(false);
						robotConfig.setVisible(false);
					}
				});
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						robotConfig.setVisible(false);
						
					}
				});
				
			}
		});

		disButton = new JButton();
		disButton.setText("Display");
		disButton.setBounds(547, 210, 115, 30);
		disButton.setVisible(false);
		label.add(disButton);
		
		disHide = new JButton();
		disHide.setText("Close");
		disHide.setBounds(547, 210, 115, 30);
		disHide.setForeground(Color.blue);
		disHide.setVisible(false);
		label.add(disHide);
		
		
		
		disButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				disButton.setBackground(Color.red);
				disButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				disButton.setBackground(null);
				disButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		disButton1 = new JButton();
		disButton1.setText("Display");
		disButton1.setBounds(547, 210, 115, 30);
		disButton1.setForeground(Color.LIGHT_GRAY);
		label.add(disButton1);
		disButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Edição Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}
		});

		disButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				disButton.setVisible(false);
				disHide.setVisible(true);
				binLife1.setText("Display robótico em edição...");
				binLife1.setForeground(Color.green);
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(300, 250, 400, 300);
				frame.setTitle("Editor do display");
				
				disHide.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						binLife1.setText("O display foi fechado!");
						binLife1.setForeground(Color.red);
						disButton.setVisible(true);
						disHide.setVisible(false);
						frame.setVisible(false);
					}
				});
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						
					}
				});
				
			}
		});
		
		codButton = new JButton();
		codButton.setText("code");
		codButton.setBounds(547, 260, 115, 30);
		codButton.setVisible(false);
		label.add(codButton);
		
		codHide = new JButton();
		codHide.setText("Close");
		codHide.setBounds(547, 260, 115, 30);
		codHide.setForeground(Color.blue);
		codHide.setVisible(false);
		label.add(codHide);
		
		
		
		codButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				codButton.setBackground(Color.red);
				codButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				codButton.setBackground(null);
				codButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		codButton1 = new JButton();
		codButton1.setText("code");
		codButton1.setBounds(547, 260, 115, 30);
		codButton1.setForeground(Color.LIGHT_GRAY);
		label.add(codButton1);
		codButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Edição Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}
		});

		codButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				codButton.setVisible(false);
				codHide.setVisible(true);
				binLife1.setText("Código em edição...");
				binLife1.setForeground(Color.green);
				EditCode editCode = new EditCode();
				editCode.setVisible(true);
				
				codHide.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						binLife1.setText("A edição foi fechada!");
						binLife1.setForeground(Color.red);
						codButton.setVisible(true);
						codHide.setVisible(false);
						editCode.setVisible(false);
					}
				});
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						editCode.setVisible(false);
						
					}
				});
				
			}
		});
		
		ajuButton = new JButton();
		ajuButton.setText("Help");
		ajuButton.setBounds(10, 310, 115, 30);
		label.add(ajuButton);
		
		ajuButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				ajuButton.setBackground(Color.red);
				ajuButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				ajuButton.setBackground(null);
				ajuButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		ajuButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(300, 250, 400, 300);
				frame.setTitle("Suporte do programa");
				
			}
		});
		
		outButton = new JButton();
		outButton.setText("Logout");
		outButton.setBounds(547, 310, 115, 30);
		label.add(outButton);
		
		outButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				outButton.setBackground(Color.red);
				outButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				outButton.setBackground(null);
				outButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		outButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				WindowLogin login = new WindowLogin();
				login.setVisible(true);
				setVisible(false);
				
			}
		});
		
		ativButton = new JButton();
		ativButton.setText("Ligar");
		ativButton.setBounds(260, 348, 130, 30);
		label.add(ativButton);
		
		
		ativButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				ativButton.setBackground(Color.red);
				ativButton.setForeground(Color.white);
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				ativButton.setBackground(null);
				ativButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				ativButton.setText("wait...");
				binLife1.setText("wait...");
				binLife1.setForeground(Color.red);				
			
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				ativButton.setText("ligar");
				
			}
		});
		
		JButton screenButton = new JButton();
        screenButton.setText("Screenshots");
        screenButton.setBounds(420, 348, 130, 30);
        screenButton.setVisible(false);
		label.add(screenButton);
		
		ativLabel = new JLabel();
		ativLabel.setText(null);
		ativLabel.setBounds(250, 373, 170, 30);
		label.add(ativLabel);
		
		binLife2 = new JTextArea();
		binLife2.setBounds(135, 150, 195, 190);
		binLife2.setBorder(null);
		binLife2.setVisible(false);
		binLife2.setForeground(Color.white);
		binLife2.setBackground(Color.black);
		label.add(binLife2);
		
		binLife3 = new JTextArea();
		binLife3.setBounds(135, 150, 195, 190);
		binLife3.setBorder(null);
		binLife3.setVisible(true);
		binLife3.setForeground(Color.white);
		binLife3.setBackground(Color.black);
		label.add(binLife3);
		
		binLife1 = new JTextArea();
		binLife1.setBounds(335, 150, 200, 190);
		binLife1.setBorder(null);
		binLife1.setText(null);
		binLife1.setForeground(Color.white);
		binLife1.setBackground(Color.black);
		label.add(binLife1);
		
		
			
		
		
		
		
		//ATIVAÇÃO
		
		deslButton = new JButton();
		deslButton.setText("Desligar");
		deslButton.setBounds(260, 348, 130, 30);
		label.add(deslButton);
		
		deslButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				deslButton.setBackground(Color.red);
				deslButton.setForeground(Color.white);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				deslButton.setBackground(null);
				deslButton.setForeground(null);
				
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
		});
		
		ativButton.addActionListener(new ActionListener() {
			
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife2.setVisible(true);
				binLife3.setVisible(false);
				comButton1.setVisible(false);
				camButton1.setVisible(false);
				audButton1.setVisible(false);
				robButton1.setVisible(false);
				disButton1.setVisible(false);
				codButton1.setVisible(false);
				comButton.setVisible(true);
				camButton.setVisible(true);
				audButton.setVisible(true);
				robButton.setVisible(true);
				disButton.setVisible(true);
				codButton.setVisible(true);
				deslButton.setVisible(true);
				
				comunicacao1.setVisible(false);
				open_camera1.setVisible(false);
				save_camera1.setVisible(false);
				android_control1.setVisible(false);
				comunicacao.setVisible(true);
				open_camera.setVisible(true);
				save_camera.setVisible(true);
				android_control.setVisible(true);
				
				edit_code1.setVisible(false);
				fonte_display1.setVisible(false);
				gravacao1.setVisible(false);
				edit_code.setVisible(true);
				fonte_display.setVisible(true);
				gravacao.setVisible(true);
				
				configurar_audio1.setVisible(false);
				configurar_robo1.setVisible(false);
				configurar_camera1.setVisible(false);
				configurar_audio.setVisible(true);
				configurar_robo.setVisible(true);
				configurar_camera.setVisible(true);
				
				
				
				binLife1.setText("O ardroid acabou de ser ligado!");
				binLife1.setForeground(Color.green);
				
				try{
			        
		           	Robot robot = new Robot(); 
		/*Espaços*/ robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_SPACE);
		/*Espaços*/ robot.keyRelease(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_SPACE);
/*Espaços/titulo*/  robot.keyRelease(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_N);
		/*titulo*/  robot.keyPress(KeyEvent.VK_F);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_M);robot.keyPress(KeyEvent.VK_A);robot.keyPress(KeyEvent.VK_C);robot.keyPress(KeyEvent.VK_O);
		/*titulo*/  robot.keyPress(KeyEvent.VK_E);robot.keyPress(KeyEvent.VK_S);robot.keyPress(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_D);
		/*titulo*/  robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_SPACE);robot.keyPress(KeyEvent.VK_P);robot.keyPress(KeyEvent.VK_R);
		/*titulo*/  robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_G); robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_A);
		/*titulo*/  robot.keyPress(KeyEvent.VK_M);robot.keyPress(KeyEvent.VK_A);
		/*Enter*/   robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);robot.keyPress(KeyEvent.VK_ENTER);
		/*linha1*/ robot.keyRelease(KeyEvent.VK_ENTER);robot.keyPress(KeyEvent.VK_V);robot.keyPress(KeyEvent.VK_E);
		/*linha1*/ robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_S); robot.keyPress(KeyEvent.VK_A);robot.keyPress(KeyEvent.VK_O);
		/*linha1*/ robot.keyPress(KeyEvent.VK_EQUALS); robot.keyPress(KeyEvent.VK_1);robot.keyPress(KeyEvent.VK_PERIOD);robot.keyPress(KeyEvent.VK_0);robot.keyPress(KeyEvent.VK_ENTER);robot.keyPress(KeyEvent.VK_S);robot.keyPress(KeyEvent.VK_T);
		/*linha2*/ robot.keyPress(KeyEvent.VK_A);robot.keyPress(KeyEvent.VK_T);robot.keyPress(KeyEvent.VK_U);robot.keyPress(KeyEvent.VK_S);robot.keyPress(KeyEvent.VK_EQUALS);
		/*linha2*/ robot.keyPress(KeyEvent.VK_L);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_G);robot.keyPress(KeyEvent.VK_A);
		/*linha2*/ robot.keyPress(KeyEvent.VK_D);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_ENTER);
		/*linha3*/ robot.keyPress(KeyEvent.VK_T);robot.keyPress(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_P);robot.keyPress(KeyEvent.VK_O); robot.keyPress(KeyEvent.VK_EQUALS);
		/*linha3*/ robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_B);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_T);robot.keyPress(KeyEvent.VK_I);
		/*linha3*/ robot.keyPress(KeyEvent.VK_C);robot.keyPress(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_ENTER);
		            
		            
		        } catch (AWTException arg) {
		            arg.printStackTrace();
		        }
				
				String Taskkill_Other_bat = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Taskkill_Other_bat.bat";
				try {
					
					Runtime.getRuntime().exec(Taskkill_Other_bat);
		            Thread.sleep(1000);
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
				String Batch_File_Rob = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Batch_File_Rob.bat";
				try {
					Thread.sleep(1000);
					Runtime.getRuntime().exec(Batch_File_Rob);
		            
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
				
				
				
				
				
				
				
				ativButton.setVisible(false);
				
				ativLabel.setText("<html><font color='Blue'>O ardroidmax está ligado!</font></html>");
			
			}
		});
		
		
		
		deslButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife2.setVisible(false);
				binLife3.setVisible(true);
				comButton.setVisible(false);
				camButton.setVisible(false);
				audButton.setVisible(false);
				robButton.setVisible(false);
				disButton.setVisible(false);
				codButton.setVisible(false);
				comButton1.setVisible(true);
				camButton1.setVisible(true);
				audButton1.setVisible(true);
				robButton1.setVisible(true);
				disButton1.setVisible(true);
				codButton1.setVisible(true);
				
				comunicacao1.setVisible(true);
				open_camera1.setVisible(true);
				save_camera1.setVisible(true);
				android_control1.setVisible(true);
				comunicacao.setVisible(false);
				open_camera.setVisible(false);
				save_camera.setVisible(false);
				android_control.setVisible(false);
				comunicacao.setForeground(null);
				open_camera.setForeground(null);
				android_control.setForeground(null);
				save_camera.setForeground(null);
				
				edit_code1.setVisible(true);
				fonte_display1.setVisible(true);
				gravacao1.setVisible(true);
				edit_code.setVisible(false);
				fonte_display.setVisible(false);
				gravacao.setVisible(false);
				edit_code.setForeground(null);
				fonte_display.setForeground(null);
				gravacao.setForeground(null);
				
				configurar_audio1.setVisible(true);
				configurar_robo1.setVisible(true);
				configurar_camera1.setVisible(true);
				configurar_audio.setVisible(false);
				configurar_robo.setVisible(false);
				configurar_camera.setVisible(false);
				configurar_audio.setForeground(null);
				configurar_robo.setForeground(null);
				configurar_camera.setForeground(null);
				screenButton.setVisible(false);
				
				binLife1.setText(null);
				binLife2.setText(null);
				String Taskkill_Other_bat = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Taskkill_Other_bat.bat";
				try {
					
					Runtime.getRuntime().exec(Taskkill_Other_bat);
		            
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
				
				ativLabel.setText("<html><font color='Red'>O ardroidmax está desligado!</font></html>");
				ativButton.setVisible(true);
				deslButton.setVisible(false);
				
				
			}
		});
		
		// BARRA DE MENU
		 
		file_robot = new JMenu("File");
		edit = new JMenu("Edit");
		configuracao = new JMenu("configurations");
		help = new JMenu("Help");
		about = new JMenu("About...");
		
		
		comunicacao = new JMenuItem("Open Comunication"+"    F1");
		comunicacao.setVisible(false);
		open_camera = new JMenuItem("Open Camera..."+"    F2");
		open_camera.setVisible(false);
		save_camera = new JMenuItem("Save Camera..."+"    F3");
		save_camera.setVisible(false);
		android_control = new JMenuItem("Android Control"+"    F4");
		android_control.setVisible(false);
		comunicacao1 = new JMenuItem("Open Comunication");
		open_camera1 = new JMenuItem("Open Camera...");
		save_camera1 = new JMenuItem("Save Camera...");
		android_control1 = new JMenuItem("Android Control");
		
		
		edit_code = new JMenuItem("Code Edit"+"    F6");
		edit_code.setVisible(false);
		fonte_display = new JMenuItem("Display Edit");
		fonte_display.setVisible(false);
		gravacao = new JMenuItem("gravação"+"    F8");
		gravacao.setVisible(false);
		edit_code1 = new JMenuItem("Code Edit");
		fonte_display1 = new JMenuItem("Display Edit");
		gravacao1 = new JMenuItem("gravação");
		
		
		configurar_robo = new JMenuItem("Robot Configurations"+"    F9");
		configurar_robo.setVisible(false);
		configurar_audio = new JMenuItem("Configurate Audio"+"    F11");
		configurar_audio.setVisible(false);
		configurar_camera = new JMenuItem("Configurate Camera"+"    F12");
		configurar_camera.setVisible(false);
		configurar_robo1 = new JMenuItem("Robot Configurations");
		configurar_audio1 = new JMenuItem("Configurate Audio");
		configurar_camera1 = new JMenuItem("Configurate Camera");
		
		manualProgram = new JMenuItem("Program Manual"+"    F7");
		systemInfo = new JMenuItem("System Informations");
		seeMore = new JMenuItem("See More...");
		HowToCreate = new JMenuItem("How to create?");
		ardroid = new JMenuItem("Ardroidmax Projects");
		
		menubar.add(file_robot);
		menubar.add(edit);
		menubar.add(configuracao);
		menubar.add(help);
		
		
		file_robot.add(comunicacao);
		file_robot.add(open_camera);
		file_robot.add(save_camera);
		file_robot.add(android_control);
		
		file_robot.add(comunicacao1);
		file_robot.add(open_camera1);
		file_robot.add(save_camera1);
		file_robot.add(android_control1);
		edit.add(edit_code);
		edit.add(fonte_display);
		edit.add(gravacao);
		
		edit.add(edit_code1);
		edit.add(fonte_display1);
		edit.add(gravacao1);
		configuracao.add(configurar_robo);
		configuracao.add(configurar_audio);
		configuracao.add(configurar_camera);
		
		configuracao.add(configurar_robo1);
		configuracao.add(configurar_audio1);
		configuracao.add(configurar_camera1);
		help.add(about);
		help.add(seeMore);
		help.add(ardroid);
		about.add(manualProgram);
		about.add(systemInfo);
		about.add(HowToCreate);
		
		
		logout = new JMenuItem("logout"+"    F5");
		file_robot.add(logout);
		
		//FUNÇÕES MENU
		
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				WindowLogin login = new WindowLogin();
				login.setVisible(true);
				setVisible(false);
				
			}
		});
		
		ardroid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
					
				ArdroidMax ardroid = new ArdroidMax();
				ardroid.setVisible(true);
				
			}
		});
		
		manualProgram.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
					
				ManualProgram manual = new ManualProgram();
				manual.setVisible(true);
				
			}
		});
		
		systemInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				SystemInfo info = new SystemInfo();
				info.setVisible(true);
			}
		});
		
		seeMore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String sourceManual = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Readmore.htm";
				
				try {
					Runtime.getRuntime().exec(sourceManual);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		});
		
		HowToCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String howtocreate = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/HowToCreate.htm";
				
				try {
					Runtime.getRuntime().exec(howtocreate);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		
		comunicacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Conversation robotConversation;
				robotConversation = new Conversation();
				robotConversation.setVisible(true);
				
				String Taskkill_Other_bat = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Taskkill_Other_bat.bat";
				try {
					
					Runtime.getRuntime().exec(Taskkill_Other_bat);
					Thread.sleep(2000);
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
				String Batch_File_Com = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Batch_File_Com.bat";
				try {
		            
					Runtime.getRuntime().exec(Batch_File_Com);
		            
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				binLife1.setText("Comunicação está em execução...");
				binLife1.setForeground(Color.green);
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						robotConversation.setVisible(false);
						
					}
				});
				
				comunicacao.setForeground(Color.red);
			}
			
			

		});
		
		binLife2.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			
			public void keyPressed(KeyEvent e) {
				int f1 = KeyEvent.VK_F1;
				int tecla = e.getKeyCode();
				if(tecla == f1){
					
					Conversation robotConversation;
					robotConversation = new Conversation();
					robotConversation.setVisible(true);
					
					String Taskkill_Other_bat = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Taskkill_Other_bat.bat";
					try {
						
						Runtime.getRuntime().exec(Taskkill_Other_bat);
						Thread.sleep(2000);
			           
			        } catch (Exception arg) {
			            arg.printStackTrace();
			        }
					
					String Batch_File_Com = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Files/Batch_File_Com.bat";
					try {
			            
						Runtime.getRuntime().exec(Batch_File_Com);
			            
			           
			        } catch (Exception arg) {
			            arg.printStackTrace();
			        }
					binLife1.setText("Comunicação está em execução...");
					binLife1.setForeground(Color.green);
					
					deslButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							robotConversation.setVisible(false);
							
						}
					});
					
					comunicacao.setForeground(Color.red);
				}
				
			}
		});
		binLife2.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			
			public void keyPressed(KeyEvent e) {
				int f2 = KeyEvent.VK_F2;
				int tecla = e.getKeyCode();
				if(tecla == f2){
					binLife1.setText("Camera está em execução...");
					binLife1.setForeground(Color.green);
					String droidCam = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/DroidCam/DroidCamApp.exe";
					// String myPhoneExplorer = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/MyPhoneExplorer/MyPhoneExplorer.exe";
					try {
			            
			 
			           // Runtime.getRuntime().exec(myPhoneExplorer);
			            Runtime.getRuntime().exec(droidCam);
			            
			           
			        } catch (Exception arg) {
			            arg.printStackTrace();
			        }
					
			        
			        open_camera.setForeground(Color.red);
					
				}
				
			}
		});
		binLife2.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			
			public void keyPressed(KeyEvent e) {
				int f3 = KeyEvent.VK_F3;
				int tecla = e.getKeyCode();
				if(tecla == f3){
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
							e1.printStackTrace();
					}
							
							try {
								Robot robot = new Robot();
					            robot.mouseMove(5, 65);
					            robot.mousePress(InputEvent.BUTTON1_MASK);
								
					                BufferedImage bi = robot.createScreenCapture(new Rectangle(5, 70, 400, 300));  
					                try {
										ImageIO.write(bi, "JPEG", new File("C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Images/CameraRobotSystem.JPEG"));
									} catch (IOException e1) {
										
										e1.printStackTrace();
								
					                  
									
					            }
							} catch (AWTException e1) {
								
								e1.printStackTrace();
							}  
				            
				            
				            screenButton.setVisible(true);
				            
				           
				            
							binLife1.setText("Screenshot salvo com sucesso!");
							binLife1.setForeground(Color.green);
							
				       
							deslButton.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent arg0) {
									screenButton.setVisible(false);
									
								}
							});
					    
							save_camera.setForeground(Color.red);
				}
				
			}
		});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
	
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f4 = KeyEvent.VK_F4;
		int tecla = e.getKeyCode();
		if(tecla == f4){
			
			String myPhoneExplorer = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/MyPhoneExplorer/MyPhoneExplorer.exe";
			try {
				Runtime.getRuntime().exec(myPhoneExplorer);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
			binLife1.setText("O android está acessível");
			binLife1.setForeground(Color.green);
			android_control.setForeground(Color.red);
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f5 = KeyEvent.VK_F5;
		int tecla = e.getKeyCode();
		if(tecla == f5){
			
			WindowLogin login = new WindowLogin();
			login.setVisible(true);
			setVisible(false);
		}
		
	}
});
binLife3.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f5 = KeyEvent.VK_F5;
		int tecla = e.getKeyCode();
		if(tecla == f5){
			
			WindowLogin login = new WindowLogin();
			login.setVisible(true);
			setVisible(false);
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f6 = KeyEvent.VK_F6;
		int tecla = e.getKeyCode();
		if(tecla == f6){
			
			binLife1.setText("Código em edição...");
			binLife1.setForeground(Color.green);
			EditCode editCode = new EditCode();
			editCode.setVisible(true);
			
			deslButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					editCode.setVisible(false);
					
				}
			});
			
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f7 = KeyEvent.VK_F7;
		int tecla = e.getKeyCode();
		if(tecla == f7){
			
			ManualProgram manual = new ManualProgram();
			manual.setVisible(true);
			
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f8 = KeyEvent.VK_F8;
		int tecla = e.getKeyCode();
		if(tecla == f8){
			
			binLife1.setText("O ardroidmax está gravando!");
			binLife1.setForeground(Color.green);
			gravacao.setForeground(Color.red);
			
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f9 = KeyEvent.VK_F9;
		int tecla = e.getKeyCode();
		if(tecla == f9){
			
			binLife1.setText("Robô em configuração...");
			binLife1.setForeground(Color.green);
			RobotConfig robotConfig = new RobotConfig();
			robotConfig.setVisible(true);
			
			deslButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					robotConfig.setVisible(false);
					
				}
			});
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f11 = KeyEvent.VK_F11;
		int tecla = e.getKeyCode();
		if(tecla == f11){
			
			binLife1.setText("Audio em configuração...");
			binLife1.setForeground(Color.green);
			JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setBounds(300, 250, 400, 300);
			frame.setTitle("Configuração do audio");
			
			deslButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frame.setVisible(false);
					
				}
			});
		}
		
	}
});
binLife2.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		int f12 = KeyEvent.VK_F12;
		int tecla = e.getKeyCode();
		if(tecla == f12){
			
			JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setBounds(300, 250, 400, 300);
			frame.setTitle("Configuração da camera");
			
			deslButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frame.setVisible(false);
					
				}
			});
		}
		
	}
});
		
		open_camera.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				binLife1.setText("Camera está em execução...");
				binLife1.setForeground(Color.green);
				String droidCam = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/DroidCam/DroidCamApp.exe";
				// String myPhoneExplorer = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/MyPhoneExplorer/MyPhoneExplorer.exe";
				try {
		            
		 
		           // Runtime.getRuntime().exec(myPhoneExplorer);
		            Runtime.getRuntime().exec(droidCam);
		            
		           
		        } catch (Exception arg) {
		            arg.printStackTrace();
		        }
				
		        
		        open_camera.setForeground(Color.red);
				
				
			}
		});
		
		save_camera.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
						
						try {
							Robot robot = new Robot();
				            robot.mouseMove(5, 65);
				            robot.mousePress(InputEvent.BUTTON1_MASK);
							
				                BufferedImage bi = robot.createScreenCapture(new Rectangle(5, 70, 400, 300));  
				                try {
									ImageIO.write(bi, "JPEG", new File("C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Images/CameraRobotSystem.JPEG"));
								} catch (IOException e1) {
									
									e1.printStackTrace();
							
				                  
								
				            }
						} catch (AWTException e) {
							
							e.printStackTrace();
						}  
			            
			            
			            screenButton.setVisible(true);
			            
			           
			            
						binLife1.setText("Screenshot salvo com sucesso!");
						binLife1.setForeground(Color.green);
						
			       
						deslButton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								screenButton.setVisible(false);
								
							}
						});
				    
						save_camera.setForeground(Color.red);
					}
				});
		
				save_camera.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						binLife1.setText("Screenshot salvo com sucesso!");
						binLife1.setForeground(Color.green);
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						binLife1.setText("salvando screenshot...");
						binLife1.setForeground(Color.white);
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						save_camera.setBackground(null);
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						save_camera.setBackground(Color.white);
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
				
						
					}
				});
				
		 	screenButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					String sourceScreen = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Images/CameraRobotSystem.JPEG";
					try {
						Runtime.getRuntime().exec(sourceScreen);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
				}
			});
		 
				edit_code.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						binLife1.setText("Código em edição...");
						binLife1.setForeground(Color.green);
						EditCode editCode = new EditCode();
						editCode.setVisible(true);
						
						deslButton.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								editCode.setVisible(false);
								
							}
						});
						
						edit_code.setForeground(Color.red);
					}
				});
				
				android_control.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						String myPhoneExplorer = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Aplications/MyPhoneExplorer/MyPhoneExplorer.exe";
						try {
							Runtime.getRuntime().exec(myPhoneExplorer);
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						
						binLife1.setText("O android está acessível");
						binLife1.setForeground(Color.green);
						android_control.setForeground(Color.red);
					}
				});
				
				
		
		fonte_display.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Display robótico em edição...");
				binLife1.setForeground(Color.green);
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(300, 250, 400, 300);
				frame.setTitle("Editor do display");
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						
					}
				});
				
				fonte_display.setForeground(Color.red);
			}
		});
		
		gravacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("O ardroidmax está gravando!");
				binLife1.setForeground(Color.green);
				gravacao.setForeground(Color.red);
			}
		});
		
		configurar_robo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Robô em configuração...");
				binLife1.setForeground(Color.green);
				RobotConfig robotConfig = new RobotConfig();
				robotConfig.setVisible(true);
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						robotConfig.setVisible(false);
						
					}
				});
				
				configurar_robo.setForeground(Color.red);
			}
		});
		
		configurar_audio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				binLife1.setText("Audio em configuração...");
				binLife1.setForeground(Color.green);
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(300, 250, 400, 300);
				frame.setTitle("Configuração do audio");
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						
					}
				});
				
				configurar_audio.setForeground(Color.red);
			}
		});
		
		configurar_camera.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(300, 250, 400, 300);
				frame.setTitle("Configuração da camera");
				
				deslButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.setVisible(false);
						
					}
				});
				
				
				configurar_camera.setForeground(Color.red);
				
			}
		});
		
		comunicacao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				binLife1.setText("Comunicação Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
			}

		});
		
		open_camera1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				binLife1.setText("Filmagem Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
			}
		});
		
		save_camera1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("Impossível salvar!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
					}
				});
		
		android_control1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				binLife1.setText("Controle inacessível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
			}
		});
		
			edit_code1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						binLife1.setText("Edição Impossível!\n"
								+ "O ardroid está desligado!");
						binLife1.setForeground(Color.red);
				}
			});
		
		fonte_display1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("Edição Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
			}
		});
		
		gravacao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("Gravação Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
			}
		});
		
		configurar_robo1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("Configuração Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
			}
		});
		
		configurar_audio1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("Configuração Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
			}
		});
		
		configurar_camera1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				binLife1.setText("Configuração Impossível!\n"
						+ "O ardroid está desligado!");
				binLife1.setForeground(Color.red);
				
				
			}
		});
		
		
		grayBall = new JButton();
		grayBall.setBounds(10, 360, 25, 25);
		grayBall.setBorderPainted(false);
		grayBall.setFocusPainted(false);
		grayBall.setBackground(Color.DARK_GRAY);
		label.add(grayBall);
		
		blueBall = new JButton();
		blueBall.setBounds(10, 360, 25, 25);
		blueBall.setBorderPainted(false);
		blueBall.setFocusPainted(false);
		blueBall.setBackground(Color.DARK_GRAY);
		label.add(blueBall);
		
		
		
		
		
		
	}

	
	
}


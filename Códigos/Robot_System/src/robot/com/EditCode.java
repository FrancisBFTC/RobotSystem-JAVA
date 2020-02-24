package robot.com;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EtchedBorder;



@SuppressWarnings("serial")
public class EditCode extends JFrame {
	private JTextArea textArea; 
	private JPanel painel;
	private JButton comunication;
	protected Color colors;
	protected File files;
	protected int sour;
	@SuppressWarnings("unused")
	private int policy;

	public EditCode(){
		
		

		this.setBounds(290, 150, 100, 200);
		this.setTitle("Editor de códigos");
		this.setMinimumSize(new Dimension(700, 450));
		this.add(painel = new JPanel());
		
		
		JLabel label = new JLabel();
		label.setText("<html><div bgcolor='lightgray' width='673' height='395'></div></html>");
		label.setBounds(0, 2, 380, 55);
		painel.add(label);
		painel.setBackground(Color.darkGray);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 30, 640, 350);
		textArea.getMargin();
		textArea.getAccessibleContext();
		textArea.setText(null);
		textArea.setForeground(colors);
		textArea.setEditable(true);
		textArea.setFont(new Font("Arial", 1, 9));
		
		JScrollPane scroll = new JScrollPane(textArea);
		policy = scroll.getVerticalScrollBarPolicy();
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		scroll.setBounds(5, 30, 670, 340);
		label.add(scroll);
		
		JButton aum = new JButton();
		aum.setBounds(590, 5, 60, 20);
		aum.setText(">");
		label.add(aum);
		
		JButton aum1 = new JButton();
		aum1.setBounds(590, 5, 60, 20);
		aum1.setText(">");
		label.add(aum1);
		
		JButton aum2 = new JButton();
		aum2.setBounds(590, 5, 60, 20);
		aum2.setText(">");
		label.add(aum2);
		
		JButton aum3 = new JButton();
		aum3.setBounds(590, 5, 60, 20);
		aum3.setText(">");
		label.add(aum3);
		
		JButton aum4 = new JButton();
		aum4.setBounds(590, 5, 60, 20);
		aum4.setText(">");
		label.add(aum4);
		
		JButton aum5 = new JButton();
		aum5.setBounds(590, 5, 60, 20);
		aum5.setText(">");
		label.add(aum5);
		
		JButton aum6 = new JButton();
		aum6.setBounds(590, 5, 60, 20);
		aum6.setText(">");
		label.add(aum6);
		
		JButton aum7 = new JButton();
		aum7.setBounds(590, 5, 60, 20);
		aum7.setText(">");
		label.add(aum7);
		JButton aum8 = new JButton();
		aum8.setBounds(590, 5, 60, 20);
		aum8.setText(">");
		label.add(aum8);
		JButton aum9 = new JButton();
		aum9.setBounds(590, 5, 60, 20);
		aum9.setText(">");
		label.add(aum9);
		JButton aum10 = new JButton();
		aum10.setBounds(590, 5, 60, 20);
		aum10.setText(">");
		aum10.setForeground(Color.lightGray);
		label.add(aum10);
		
		JButton dim1 = new JButton();
		dim1.setBounds(527, 5, 60, 20);
		dim1.setText("<");
		label.add(dim1);
		JButton dim2 = new JButton();
		dim2.setBounds(527, 5, 60, 20);
		dim2.setText("<");
		label.add(dim2);
		JButton dim3 = new JButton();
		dim3.setBounds(527, 5, 60, 20);
		dim3.setText("<");
		label.add(dim3);
		JButton dim4 = new JButton();
		dim4.setBounds(527, 5, 60, 20);
		dim4.setText("<");
		label.add(dim4);
		JButton dim5 = new JButton();
		dim5.setBounds(527, 5, 60, 20);
		dim5.setText("<");
		label.add(dim5);
		JButton dim6 = new JButton();
		dim6.setBounds(527, 5, 60, 20);
		dim6.setText("<");
		label.add(dim6);
		JButton dim7 = new JButton();
		dim7.setBounds(527, 5, 60, 20);
		dim7.setText("<");
		label.add(dim7);
		JButton dim8 = new JButton();
		dim8.setBounds(527, 5, 60, 20);
		dim8.setText("<");
		dim8.setForeground(Color.lightGray);
		label.add(dim8);
		
		int var = 8;
		
		
		aum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				aum.setVisible(false);
				aum1.setVisible(true);
				aum2.setVisible(false);
				aum3.setVisible(false);
				aum4.setVisible(false);
				aum5.setVisible(false);
				aum6.setVisible(false);
				aum7.setVisible(false);
				aum8.setVisible(false);
				aum9.setVisible(false);
				dim1.setVisible(true);
				int num;
				
				num = var + 1;
				
				textArea.setFont(new Font("Arial", 1, num));
				
				aum1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						aum.setVisible(false);
						aum1.setVisible(false);
						aum2.setVisible(true);
						aum3.setVisible(false);
						aum4.setVisible(false);
						aum5.setVisible(false);
						aum6.setVisible(false);
						aum7.setVisible(false);
						aum8.setVisible(false);
						aum9.setVisible(false);
						
						int numb;
						numb = num + 1;
						
						
						textArea.setFont(new Font("Arial", 1, numb));
						aum2.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								aum.setVisible(false);
								aum1.setVisible(false);
								aum2.setVisible(false);
								aum3.setVisible(true);
								aum4.setVisible(false);
								aum5.setVisible(false);
								aum6.setVisible(false);
								aum7.setVisible(false);
								aum8.setVisible(false);
								aum9.setVisible(false);
								
								int numb1;
								numb1 = numb + 1;
								
								textArea.setFont(new Font("Arial", 1, numb1));
								
								aum3.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent arg0) {
										aum.setVisible(false);
										aum1.setVisible(false);
										aum2.setVisible(false);
										aum3.setVisible(false);
										aum4.setVisible(true);
										aum5.setVisible(false);
										aum6.setVisible(false);
										aum7.setVisible(false);
										aum8.setVisible(false);
										aum9.setVisible(false);
										
										int numb2;
										numb2 = numb1 + 1;
										
										textArea.setFont(new Font("Arial", 1, numb2));
										
										aum4.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent arg0) {
												aum.setVisible(false);
												aum1.setVisible(false);
												aum2.setVisible(false);
												aum3.setVisible(false);
												aum4.setVisible(false);
												aum5.setVisible(true);
												aum6.setVisible(false);
												aum7.setVisible(false);
												aum8.setVisible(false);
												aum9.setVisible(false);
												
												
												int numb3;
												numb3 = numb2 + 1;
												
												textArea.setFont(new Font("Arial", 1, numb3));
												
												aum5.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent arg0) {
														aum.setVisible(false);
														aum1.setVisible(false);
														aum2.setVisible(false);
														aum3.setVisible(false);
														aum4.setVisible(false);
														aum5.setVisible(false);
														aum6.setVisible(true);
														aum7.setVisible(false);
														aum8.setVisible(false);
														aum9.setVisible(false);
														
														int numb4;
														numb4 = numb3 + 1;
														
														textArea.setFont(new Font("Arial", 1, numb4));
														
														aum6.addActionListener(new ActionListener() {
															
															@Override
															public void actionPerformed(ActionEvent arg0) {
																aum.setVisible(false);
																aum1.setVisible(false);
																aum2.setVisible(false);
																aum3.setVisible(false);
																aum4.setVisible(false);
																aum5.setVisible(false);
																aum6.setVisible(false);
																aum7.setVisible(true);
																aum8.setVisible(false);
																aum9.setVisible(false);
																
																int numb5;
																numb5 = numb4 + 1;
																
																textArea.setFont(new Font("Arial", 1, numb5));
																
																aum7.addActionListener(new ActionListener() {
																	
																	@Override
																	public void actionPerformed(ActionEvent arg0) {
																		aum.setVisible(false);
																		aum1.setVisible(false);
																		aum2.setVisible(false);
																		aum3.setVisible(false);
																		aum4.setVisible(false);
																		aum5.setVisible(false);
																		aum6.setVisible(false);
																		aum7.setVisible(false);
																		aum8.setVisible(true);
																		aum9.setVisible(false);
																		
																		int numb6;
																		numb6 = numb5 + 1;
																		
																		textArea.setFont(new Font("Arial", 1, numb6));
																		
																		aum8.addActionListener(new ActionListener() {
																			
																			@Override
																			public void actionPerformed(ActionEvent arg0) {
																				aum.setVisible(false);
																				aum1.setVisible(false);
																				aum2.setVisible(false);
																				aum3.setVisible(false);
																				aum4.setVisible(false);
																				aum5.setVisible(false);
																				aum6.setVisible(false);
																				aum7.setVisible(false);
																				aum8.setVisible(false);
																				aum9.setVisible(true);
																				
																				int numb7;
																				numb7 = numb6 + 1;
																				
																				textArea.setFont(new Font("Arial", 1, numb7));
																				
																				aum9.addActionListener(new ActionListener() {
																					
																					@Override
																					public void actionPerformed(ActionEvent arg0) {
																						aum.setVisible(false);
																						aum1.setVisible(false);
																						aum2.setVisible(false);
																						aum3.setVisible(false);
																						aum4.setVisible(false);
																						aum5.setVisible(false);
																						aum6.setVisible(false);
																						aum7.setVisible(false);
																						aum8.setVisible(false);
																						aum9.setVisible(false);
																						aum10.setVisible(true);
																						
																						int numb8;
																						numb8 = numb7 + 1;
																						
																						textArea.setFont(new Font("Arial", 1, numb8));
																						
																					}
																				});
																			}
																		});
																	}
																});
															}
														});
													}
												});
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
	
		
		
		dim1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dim1.setVisible(false);
				dim2.setVisible(true);
				dim3.setVisible(false);
				dim4.setVisible(false);
				dim5.setVisible(false);
				dim6.setVisible(false);
				dim7.setVisible(false);
				aum.setVisible(true);
				int numb1;
				numb1 = var;
				
				textArea.setFont(new Font("Arial", 1, numb1));
				dim2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dim1.setVisible(false);
						dim2.setVisible(false);
						dim3.setVisible(true);
						dim4.setVisible(false);
						dim5.setVisible(false);
						dim6.setVisible(false);
						dim7.setVisible(false);
						
						int numb2;
						numb2 = numb1 - 1;
						
						textArea.setFont(new Font("Arial", 1, numb2));
						dim3.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent arg0) {
								dim1.setVisible(false);
								dim2.setVisible(false);
								dim3.setVisible(false);
								dim4.setVisible(true);
								dim5.setVisible(false);
								dim6.setVisible(false);
								dim7.setVisible(false);
								
								int numb3;
								numb3 = numb2 - 1;
								
								textArea.setFont(new Font("Arial", 1, numb3));
								dim4.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent arg0) {
										
										dim1.setVisible(false);
										dim2.setVisible(false);
										dim3.setVisible(false);
										dim4.setVisible(false);
										dim5.setVisible(true);
										dim6.setVisible(false);
										dim7.setVisible(false);
										
										int numb4;
										numb4 = numb3 - 1;
										
										textArea.setFont(new Font("Arial", 1, numb4));
										dim5.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent arg0) {
												dim1.setVisible(false);
												dim2.setVisible(false);
												dim3.setVisible(false);
												dim4.setVisible(false);
												dim5.setVisible(false);
												dim6.setVisible(true);
												dim7.setVisible(false);
												
												int numb5;
												numb5 = numb4 - 1;
												
												textArea.setFont(new Font("Arial", 1, numb4));
												dim6.addActionListener(new ActionListener() {
													
													@Override
													public void actionPerformed(ActionEvent arg0) {
														dim1.setVisible(false);
														dim2.setVisible(false);
														dim3.setVisible(false);
														dim4.setVisible(false);
														dim5.setVisible(false);
														dim6.setVisible(false);
														dim7.setVisible(true);
														
														int numb6;
														numb6 = numb5 - 1;
														
														textArea.setFont(new Font("Arial", 1, numb6));
														dim7.addActionListener(new ActionListener() {
															
															@Override
															public void actionPerformed(ActionEvent arg0) {
																dim1.setVisible(false);
																dim2.setVisible(false);
																dim3.setVisible(false);
																dim4.setVisible(false);
																dim5.setVisible(false);
																dim6.setVisible(false);
																dim7.setVisible(false);
																dim8.setVisible(true);
																int numb7;
																numb7 = numb6 - 1;
																
																textArea.setFont(new Font("Arial", 1, numb7));
																
															}
														});
													}
												});
											}
										});
									}
								});

							}
						});
					}
				});
			}
		});


		JButton button = new JButton();
		button.setBounds(5, 5, 110, 20);
		button.setText("Editar Cores");
		label.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setBounds(200, 280, 650, 400);
				frame.setTitle("Edição de cores");
				JColorChooser color = new JColorChooser();
				frame.add(color);
			
				
				
				
				
				JButton salvar = new JButton();
				salvar.setText("Salve a cor do código");
				salvar.setBounds(250, 215, 130, 20);
				color.add(salvar, "North");
				
				JButton planFundo = new JButton();
				planFundo.setText("Plano de fundo");
				planFundo.setBounds(250, 215, 130, 20);
				color.add(planFundo, "East");
				
				salvar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						colors = color.getColor();
						textArea.setForeground(colors);
						
					}
				});
				
				planFundo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						colors = color.getColor();
						textArea.setBackground(colors);
						
					}
				});
				
				
			}
		});
		
		
		
		comunication = new JButton();
		comunication.setText("Comunication");
		comunication.setBounds(120, 5, 130, 20);
		label.add(comunication);
		
		JButton codSave = new JButton("Salvar");
		codSave.setBounds(390, 5, 130, 20);
		
		JButton codSave2 = new JButton("Salvar");
		codSave2.setBounds(390, 5, 130, 20);
		
		
		comunication.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String source = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Code/Comunication.java";
				
				try {
					Runtime.getRuntime().exec(source);
				
				} catch (IOException e2) {
					
					e2.printStackTrace();
					
				}
				
				Robot robot;
				
				try {
					robot = new Robot();
					robot.delay(300);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_ALT);
					robot.keyPress(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_ALT);
					robot.delay(500);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				} catch (AWTException e2) {
					
					e2.printStackTrace();
				}
				
				
				label.add(codSave);
				codSave2.setVisible(false);
				codSave.setVisible(true);
				
				try {
					Robot rob = new Robot();
					rob.mouseMove(700, 200);
					rob.mouseWheel(InputEvent.BUTTON1_MASK);
					rob.mouseMove(600, 300);
					rob.mousePress(InputEvent.BUTTON1_MASK);
					rob.mouseRelease(InputEvent.BUTTON1_MASK);
				} catch (AWTException e1) {
					
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		codSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				String notepad = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Code/Comunication.java";
				Robot robot;
				
					
				
					try {
						Runtime.getRuntime().exec(notepad);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				
				

               
                try {
					robot = new Robot();
					robot.delay(100);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.delay(500);
					robot.keyPress(KeyEvent.VK_ALT);
					robot.keyPress(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_ALT);
					
					
				} catch (AWTException e) {
					
					e.printStackTrace();
				}
				
				
				
				
				
			
			}
		});
		
		JButton conversation = new JButton("conversation");
		conversation.setBounds(255, 5, 130, 20);
		label.add(conversation);
		
		
		
		conversation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String source = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Code/conversation.java";
				
				try {
					Runtime.getRuntime().exec(source);
				
				} catch (IOException e2) {
					
					e2.printStackTrace();
					
				}
				
				Robot robot;
				
				try {
					robot = new Robot();
					robot.delay(300);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_ALT);
					robot.keyPress(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_ALT);
					robot.delay(500);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				} catch (AWTException e2) {
					
					e2.printStackTrace();
				}
				
				label.add(codSave2);
				codSave.setVisible(false);
				codSave2.setVisible(true);
				
				try {
					Robot rob = new Robot();
					rob.mouseMove(700, 200);
					rob.mouseWheel(InputEvent.BUTTON1_MASK);
					rob.mouseMove(600, 300);
					rob.mousePress(InputEvent.BUTTON1_MASK);
					rob.mouseRelease(InputEvent.BUTTON1_MASK);
				} catch (AWTException e1) {
					
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		codSave2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				String notepad = "cmd /c C:/Users/FAMILIA/Desktop/RobotSystem/ArdroidMax/Code/conversation.java";
				Robot robot;
				
				
					try {
						Runtime.getRuntime().exec(notepad);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				
				

               
                try {
                	robot = new Robot();
					robot.delay(100);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.delay(500);
					robot.keyPress(KeyEvent.VK_ALT);
					robot.keyPress(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_F4);
					robot.keyRelease(KeyEvent.VK_ALT);
					
					
				} catch (AWTException e) {
					
					e.printStackTrace();
				}
                
                
				
				
				
				
				
			
			}
		});
		
		
	}
}

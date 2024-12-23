import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Cofetarie {
	public static void main(String[] args) {
		
			
			JFrame frame = new JFrame();// creates a frame
			    frame.setTitle("Cofetaria Mihaela "); // sets title of frame
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
			    frame.setResizable(false); //prevent frame from being resized
				frame.setSize(250, 250); //sets the x-dimension, and y- dimension of frame
				frame.setVisible(true); //make frame visible
			
			JTextField username = new JTextField(20); // create a field of username
			JPasswordField password = new JPasswordField(20); // create a field of password
			       username.setCaretColor(Color.blue); 
			       password.setCaretColor(Color.blue);
			
			JButton login = new JButton("LOGIN");  //creates a button 
			     login.setSize(450,450); 
			     login.setBackground(new Color(204, 0, 204));
			     login.setLayout(null);  
			     login.setVisible(true); 
		    JButton reset=new JButton("RESET"); //creates a button
			       reset.setSize(450,450);
			       reset.setBackground(new Color(204, 0, 204));
			       reset.setLayout(null);
			       reset.setVisible(true);
			     
			      String nume_Admin = "Mihaela";  // correct username
				  String parola_Admin = "$elena$"; // correct password

					JPanel continut = new JPanel();
					
					JLabel username_Label = new JLabel();
				    username_Label.setText("Username:"); //set text of label 
					username_Label.setBackground(Color.black); 
					username_Label.setForeground(Color.black);
					username_Label.setFont(new Font("Consolas",Font.BOLD,20));
					username_Label.setBounds(160,140,150,95);
					username_Label.setHorizontalTextPosition(JLabel.CENTER); 
					
					JLabel password_Label = new JLabel();
					password_Label.setText("Password:"); // set text of label
					password_Label.setBackground(Color.black);  
					password_Label.setForeground(Color.black);
					password_Label.setFont(new Font("Consolas",Font.BOLD,20));
					password_Label.setBounds(120,100,200,25);
					JLabel errorLabel = new JLabel();
					continut.add(username_Label);
					continut.add(username);  
				    continut.setBackground (new Color (255, 153, 255)); 
				    continut.add(password_Label);
					continut.add(password);
					continut.add(errorLabel);
					continut.add(login);
				    continut.add(reset);
					frame.add(continut);
					frame.setVisible(true);
					Cofetarie.setLookAndFeel();
					
				    login.addActionListener(new ActionListener() {
				    	
               @Override
			
			public void actionPerformed(ActionEvent e) {

				String nume = username.getText();
				String parola = String.valueOf(password.getPassword());
				if (nume.equals(nume_Admin) && parola.equals(parola_Admin)) {
					frame.setVisible(false);


					JFrame title = new JFrame("COFETARIA MIHAELA - TORTURI");
					title.setBackground(Color.black);
					title.setForeground(new Color(255, 179, 179));
					JPanel continut_Panel = new JPanel();
					continut_Panel.setLayout(new BoxLayout(continut_Panel, BoxLayout.Y_AXIS));
					title.add(continut_Panel);
					
					JPanel sortimente_Panel = new JPanel(new GridLayout(0, 1));
					JLabel sortimente_Label = new JLabel();
					sortimente_Label.setText("SORTIMENTE DISPONIBILE");
					sortimente_Label.setBackground(Color.black); 
					sortimente_Label.setForeground(new Color(255, 26, 26));
					sortimente_Label.setFont(new Font("Consolas",Font.BOLD,20));
					sortimente_Label.setHorizontalTextPosition(JLabel.CENTER);
					sortimente_Label.setVerticalTextPosition(JLabel.TOP);
					sortimente_Panel.add(sortimente_Label);

				
					 JComboBox<sortimente> sortimenteTorturi = new JComboBox<sortimente>(ListaSortimente.getsortimenteTorturi());
				     sortimente_Panel.add(sortimenteTorturi);
					 
					 
					
						JLabel pret_Label = new JLabel();
						pret_Label.setText("PRET/KG:");
					    pret_Label.setForeground(new Color(255, 26, 26));
					    pret_Label.setFont(new Font("Consolas",Font.PLAIN,20));
						pret_Label.setHorizontalTextPosition(JLabel.CENTER);
						
						JTextField pret_Field = new JTextField(20);
						sortimente_Panel.add(pret_Label);
						sortimente_Panel.add(pret_Field);
						pret_Field.setEditable(false);
						
						
						JLabel gramaj_Label = new JLabel();
						gramaj_Label.setText("GRAMAJ(Kg):");
						gramaj_Label.setForeground(new Color(255, 26, 26));
					    gramaj_Label.setFont(new Font("Consolas",Font.PLAIN,20));
						gramaj_Label.setHorizontalTextPosition(JLabel.CENTER);
						
						JTextField gramaj_Field = new JTextField(20);
						sortimente_Panel.add(gramaj_Label);
						sortimente_Panel.add(gramaj_Field);
						continut_Panel.add(sortimente_Panel);
						gramaj_Field.setEditable(false);
						sortimente_Panel.setBackground(new Color(255, 204, 255));
					 
					 
					 
						JPanel vanzare_Panel= new JPanel(new GridLayout(0, 1));
						JLabel vanzare = new JLabel();
						vanzare.setText("COMANDA TORTURI");
						vanzare.setForeground(new Color(255, 26, 26));
						vanzare.setFont(new Font("Consolas",Font.BOLD,20));
						vanzare.setHorizontalTextPosition(JLabel.CENTER);
						
						JComboBox<sortimente> sortimenteTorturi1 = new JComboBox<sortimente>(ListaSortimente.getsortimenteTorturi());
						vanzare_Panel.add(vanzare);
						vanzare_Panel.add(sortimenteTorturi1);

					 
						JLabel gramaj = new JLabel();
						gramaj.setText("GRAMAJ(Kg):");
						gramaj.setForeground(new Color(255, 26, 26));
						gramaj.setFont(new Font("Consolas",Font.PLAIN,20));
						gramaj.setHorizontalTextPosition(JLabel.CENTER);
						
						JTextField gramaj_Field2 = new JTextField(20);
						vanzare_Panel.add(gramaj);
						vanzare_Panel.add(gramaj_Field2);
						gramaj_Field2.setEditable(false); 

						
						
						JLabel total_Label = new JLabel();
						JTextField total_Field = new JTextField(10);
						total_Label.setText("TOTAL:");
						total_Label.setForeground(new Color(255, 26, 26));
						total_Label.setFont(new Font("Consolas",Font.BOLD,20));
						total_Label.setHorizontalTextPosition(JLabel.CENTER);
						vanzare_Panel.add(total_Label);
						vanzare_Panel.add(total_Field);
					 
					 
					 
						JButton comandaButon = new JButton("COMANDA");
						comandaButon.setForeground(Color.black);
						comandaButon.setFont(new Font("Bell MT",Font.PLAIN,20));
						comandaButon.setSize(450,450); 
					    comandaButon.setBackground(new Color(255, 128, 255));
					    comandaButon.setLayout(null);  
					    comandaButon.setVisible(true); 
						vanzare_Panel.add(comandaButon);
						continut_Panel.add(vanzare_Panel);
						vanzare_Panel.setBackground(new Color(255, 204, 255));
					

				
						
			
	                  title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                
						
						
						
						
						comandaButon.addActionListener(new ActionListener() {
							
						@Override
						
						public void actionPerformed(ActionEvent e) {
							sortimente sortimenteVanzare = (sortimente) sortimenteTorturi1.getSelectedItem();
							
							float gramaj = Float.parseFloat(gramaj_Field.getText());
							total_Field.setText(sortimenteVanzare.pret * gramaj + "");
							ListaSortimente.scadeGramaj(sortimenteVanzare, gramaj);
						}
					});


						sortimenteTorturi1.addActionListener(new ActionListener() {
						
						@Override
						
						public void actionPerformed(ActionEvent e) {
							sortimente selectedItem = (sortimente) sortimenteTorturi1.getSelectedItem();
							
							gramaj_Field.setText(selectedItem.gramaj + "");
							pret_Field.setText(selectedItem.pret + "");
							
						}

					});
					
						title.setVisible(true);
						title.pack();
					
				}
				
				else 
					
				{
				errorLabel.setText("INCORRECT USERNAME OR PASSWORD!");
				}
			}
		});
	} 

	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}

}
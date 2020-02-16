// anvendes ikke i denne l�sning 
package io;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
	public class Gui implements ActionListener{
		
		private funk.IFunk f;
		
		private JFrame frame;
		private JTextField cprnr;
		private JLabel userid;
		private Container contentPane;          
				
		public Gui(funk.IFunk f){
			this.f= f;
			opretFrame();
			tilfoejKomponenter();            
		}

		public void dialog() {
			frame.setVisible(true);
		}

		private void opretFrame(){
			frame= new JFrame("Udregn BMI");             
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
			frame.setSize(450, 300);                                
			frame.setLocation(200, 200);                            
		}
	
		private void tilfoejKomponenter()   {
			contentPane= frame.getContentPane();                    
			contentPane.setLayout(new FlowLayout());                
			JLabel ledetekst= new JLabel("Indtast cpr-nr:");
			contentPane.add(ledetekst);          
			cprnr= new JTextField(12);                       
			contentPane.add(cprnr);
			cprnr.addActionListener(this);                         
			userid= new JLabel("                         ");              
			contentPane.add(userid);
			userid.setForeground(Color.DARK_GRAY);
		}

		
		
		public void actionPerformed(ActionEvent e){
			String cpr= cprnr.getText();      // l�ser
			String bmi= f.getTextualBMI(cpr); //brufer f
			userid.setText("BMI: "+ bmi);     // skriver
			
		}
	}



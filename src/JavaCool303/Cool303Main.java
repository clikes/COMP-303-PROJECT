package JavaCool303;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;

public class Cool303Main {
	  private static void createAndShowGUI() {
	        JFrame.setDefaultLookAndFeelDecorated(true);

	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setSize(500, 500);
	        frame.setResizable(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Dimension minimumSize = new Dimension(500,500);
			frame.setMinimumSize(minimumSize );
			
	        JLabel label = new JLabel("Hello World",JLabel.CENTER);
	        frame.getContentPane().add(label);
	        JPanel panel = new JPanel();  
	        
	        JPanel[] panels = new JPanel[5];
	        
	        frame.add(panel);
	        //frame.setLayout(new FlowLayout());
	        panel.add(label);
	        panel.setLayout(new BoxLayout(panel, 3));
	        //frame.add(panel2);
	        
	        
	        ArrayList<JButton> buttons  = new ArrayList<JButton>();
	        Integer ButtonNumber = 1;
	        for (int j = 0 ; j<4; j++) {
	        	panels[j] = new JPanel();
	        	panels[j].setLayout(new BoxLayout(panels[j], 2));	
	          	for (int i = 0; i < 5; i++) {
	        		
		        	
		        	JButton Button = new JButton(ButtonNumber.toString());
		        	ButtonNumber++;
			       // Button.setBounds(100, 100, 100, 100);
		        	Button.setSize(new Dimension(50, 200));
			    buttons.add(Button);
			    panels[j].add(Button);
			    
			    panel.add(panels[j]);
				}
	          	
	        }
//	        
	        //frame.add(panels[0]);
//	        for (int i = 0; i < 10; i++) {
//	        	Integer ButtonNumber = i+1;
//	        	JButton Button = new JButton(ButtonNumber.toString());
//		       // Button.setBounds(100, 100, 100, 100);
//	        	Button.setSize(new Dimension(50, 50));
//				//Button.addAncestorListener(listener);
//		        buttons.add(Button);
//		        panel2.add(Button);
//			}
//	        
	        // ��ʾ����
	        //frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        // ��ʾӦ�� GUI
	    	
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}

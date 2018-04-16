package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
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
	        label.setText("hello");
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
	        
	        Color bg = new Color(100,200, 50);		
			//	        
	        buttons.get(0).setBackground(bg);
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
	        //frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	    	//createAndShowGUI();
//	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//	            public void run() {
//	                createAndShowGUI();
//	            }
//	        });
	    	Cool303Theme theme = new Cool303Theme();
	    	theme.setThemeColor(new Color(200, 200, 0));
	    	Cool303Root root = new Cool303Root(theme);
	    	Cool303Container container = null;
			try {
				container = new Cool303Container(theme , "Hello World");
			} catch (NullThemeExecption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			container.getComponent().setLayout(new BoxLayout(container.getComponent(), 3));	
			root.add(container);
	    	Cool303Container[] panels = new Cool303Container[4];
	    	ArrayList<Cool303Button> buttons = new ArrayList<Cool303Button>();
	    	Integer ButtonNumber = 1;
	    	try {
	    		 for (int j = 0 ; j<4; j++) {
			        	panels[j] = new Cool303Container(theme);
			        	panels[j].getComponent().setLayout(new BoxLayout(panels[j].getComponent(), 2));	
			          	for (int i = 0; i < 5; i++) {
			        		
				        	
			          		Cool303Button Button = new Cool303Button(theme,ButtonNumber.toString());
				        	ButtonNumber++;
					       // Button.setBounds(100, 100, 100, 100);
				        Button.getComponent().setSize(new Dimension(50, 200));
					    buttons.add(Button);
					    
					    panels[j].add(Button);
						}
			          	container.add(panels[j]);
			        }
			} catch (NullThemeExecption e) {
				// TODO: handle exception
			}
	    	root.paintTheme();
	    	root.setVisible(true);
	    	root.setSize(500, 500);
	    	JFrame roott = new JFrame("tt");
//	    	roott.add(new JButton());
//	    	roott.setVisible(true);
	    }
}

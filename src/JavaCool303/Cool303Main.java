package JavaCool303;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class Cool303Main {
	  private static void createAndShowGUI() {
	        // ȷ��һ��Ư������۷��
	        JFrame.setDefaultLookAndFeelDecorated(true);

	        // ���������ô���
	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setSize(500, 700);
	        frame.setResizable(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Dimension minimumSize = new Dimension(500,700);
			frame.setMinimumSize(minimumSize );
	        // ��� "Hello World" ��ǩ
	        JLabel label = new JLabel("                                                                   Hello World                                                                            ",JLabel.CENTER);
	        frame.getContentPane().add(label);
	        JPanel panel = new JPanel();  
	        JPanel panel2 = new JPanel();  
	        BoxLayout lo = new BoxLayout(panel,BoxLayout.Y_AXIS);
	        //lo.Y_AXIS
	        //panel.setLayout(lo);
	        // ������
	        frame.add(panel);
	        panel.add(label);
	        panel.add(panel2);
	        
	        
	        ArrayList<JButton> buttons  = new ArrayList<JButton>();
	        for (int i = 0; i < 10; i++) {
	        	Integer ButtonNumber = i+1;
	        	JButton Button = new JButton(ButtonNumber.toString());
		       // Button.setBounds(100, 100, 100, 100);
	        	Button.setSize(new Dimension(50, 200));
		        buttons.add(Button);
		        panel.add(Button);
			}
	        for (int i = 0; i < 10; i++) {
	        	Integer ButtonNumber = i+1;
	        	JButton Button = new JButton(ButtonNumber.toString());
		       // Button.setBounds(100, 100, 100, 100);
	        	Button.setSize(new Dimension(50, 200));
				Button.addAncestorListener(listener);
		        buttons.add(Button);
		        panel2.add(Button);
			}
	        
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

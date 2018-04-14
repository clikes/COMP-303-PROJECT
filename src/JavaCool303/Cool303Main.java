package JavaCool303;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class Cool303Main {
	  private static void createAndShowGUI() {
	        // 确保一个漂亮的外观风格
	        JFrame.setDefaultLookAndFeelDecorated(true);

	        // 创建及设置窗口
	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setSize(500, 700);
	        frame.setResizable(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Dimension minimumSize = new Dimension(500,700);
			frame.setMinimumSize(minimumSize );
	        // 添加 "Hello World" 标签
	        JLabel label = new JLabel("                                                                   Hello World                                                                            ",JLabel.CENTER);
	        frame.getContentPane().add(label);
	        JPanel panel = new JPanel();  
	        JPanel panel2 = new JPanel();  
	        BoxLayout lo = new BoxLayout(panel,BoxLayout.Y_AXIS);
	        //lo.Y_AXIS
	        //panel.setLayout(lo);
	        // 添加面板
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
	        
	        // 显示窗口
	        //frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        // 显示应用 GUI
	    	
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}

package JavaCool303;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Cool303Button extends Cool303Component{
	private JButton button;
	public Cool303Button(Cool303Theme Theme, String string) {
		setTheme(Theme);
		button = new BubbleButton(string); 
		setComponent(button);
		
	}
	public void setSize(Dimension d){
		getComponent().setSize(d);
	}
	
	public void addActionListener(String string){
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnClick(string);
			}
		});
	}
	public void OnClick(String string){
		System.out.println(string);
	}
}

/*
 * A Bubble Button that only can see by the class cool303Button
 */

class BubbleButton extends JButton{
	/*
	 * Add a label to Button otherwise the label is not exist
	 */
    public BubbleButton(String label) {  
        super(label);  
        this.add(new JLabel(label)); 
    }  
    // Call paintComponents to repaint the compoent
    protected void paintComponent(Graphics g) {  
        super.paintComponents(g);  
    }  
    // Draw a bubble border
    protected void paintBorder(Graphics g) {  
        g.setColor(getForeground());  
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);  
    }  
   
}
package JavaCool303;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Cool303Button extends Cool303Component{
	private JButton button;
	public Cool303Button(Cool303Theme Theme, String string) {
		setTheme(Theme);
		button = new JButton(string); 
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

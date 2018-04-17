package JavaCool303;

import java.awt.Label;

import javax.swing.JLabel;


public class Cool303Label extends Cool303Component implements Themeable{
	
	private JLabel label;
	
	public Cool303Label(Cool303Theme Theme, String string) {
		setTheme(Theme);
		label = new JLabel(string, Label.LEFT);
		setComponent(label);
	}
	
}

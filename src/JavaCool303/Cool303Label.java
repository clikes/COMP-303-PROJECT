package JavaCool303;

import javax.swing.JLabel;

public class Cool303Label extends Cool303Component implements Themeable{
	
	
	
	public Cool303Label(Cool303Theme Theme, String string) {
		setTheme(Theme);
		setComponent(new JLabel(string));
	}
		
}

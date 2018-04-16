package JavaCool303;

import javax.swing.JButton;

public class Cool303Button extends Cool303Component{
	public Cool303Button(Cool303Theme Theme, String string) {
		setTheme(Theme);
		setComponent(new JButton(string));
	}
}

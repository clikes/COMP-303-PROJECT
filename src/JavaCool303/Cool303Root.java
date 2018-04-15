package JavaCool303;

import javax.swing.JFrame;

public class Cool303Root extends JFrame implements Themeable{
	private Cool303Theme Theme;
	

	@Override
	public void setTheme(Cool303Theme Theme) {
		this.Theme = Theme;
	}

	@Override
	public Cool303Theme getTheme() {
		return Theme;
	}

	@Override
	public void paintTheme() {
		
	}

}

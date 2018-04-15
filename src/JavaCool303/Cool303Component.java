package JavaCool303;

import javax.swing.JComponent;

public abstract class Cool303Component extends JComponent implements Themeable{
	private Cool303Theme Theme;
	
	public Cool303Component() {}
	
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

package JavaCool303;

import java.awt.Color;

import javax.swing.JComponent;

public abstract class Cool303Component extends JComponent implements Themeable{
	private Cool303Theme Theme;
	private JComponent component;
	
	public Cool303Component() {}
	
	/*
	 * Getter and Setter should be protected, 
	 * class from outside package should not 
	 * touch the variable.
	 */
	protected JComponent getComponent() {
		return component;
	}

	protected void setComponent(JComponent component) {
		this.component = component;
	}
	
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
		component.setForeground(Color.white);
		component.setBackground(Theme.getThemeColor());
	}



}

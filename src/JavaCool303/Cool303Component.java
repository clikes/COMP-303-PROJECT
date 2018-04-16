package JavaCool303;

import javax.swing.JComponent;

public abstract class Cool303Component extends JComponent implements Themeable{
	private Cool303Theme Theme;
	private JComponent component;
	
	public Cool303Component() {}
	
	@Override
	public void setTheme(Cool303Theme Theme) {
		this.Theme = Theme;
	}
	
	

	public Cool303Component(JComponent component) {
		this.setComponent(component);
	}
	
	@Override
	public Cool303Theme getTheme() {
		return Theme;
	}

	@Override
	public void paintTheme() {
		component.setBackground(Theme.getThemeColor());
	}

	public JComponent getComponent() {
		return component;
	}

	public void setComponent(JComponent component) {
		this.component = component;
	}

}

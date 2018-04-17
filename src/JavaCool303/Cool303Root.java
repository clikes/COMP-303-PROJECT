package JavaCool303;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Cool303Root extends JFrame implements Themeable{
	private Cool303Theme Theme;
	private ArrayList<Cool303Component> components;
 
	public Cool303Root(Cool303Theme theme) {
		this.Theme = theme;
		components = new ArrayList<Cool303Component>();
	}
	
	/*
	 * Add feature to normal add
	 */
	public void add(Cool303Component comp) {
		components.add(comp);
		super.add(comp.getComponent());
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
		this.setBackground(getTheme().getThemeColor());
		for (Cool303Component cool303Component : components) {
			cool303Component.paintTheme();
		}
		
	}

}

package JavaCool303;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Cool303Container extends Cool303Component implements Themeable{
	JPanel Cool303Panel;
	ArrayList<Cool303Component> components;
	
	public Cool303Container(Cool303Theme Theme) throws NullThemeExecption {
		if (Theme == null) throw new NullThemeExecption();
		setTheme(Theme);
		Cool303Panel = new JPanel();
		components = new ArrayList<Cool303Component>();
	}
	
	public void add(Cool303Component component) {
		
		components.add(component);
		Cool303Panel.add(component);
		component.setTheme(getTheme());
	}
	
	@Override
	public void paintTheme() {
		
	}
}

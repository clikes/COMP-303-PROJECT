package JavaCool303;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Cool303Container extends Cool303Component{
	ArrayList<Cool303Component> components;
	
	public Cool303Container() {}
	
	public Cool303Container(Cool303Theme Theme) throws NullThemeExecption {
		if (Theme == null) throw new NullThemeExecption();
		components = new ArrayList<Cool303Component>();
		setTheme(Theme);
		setComponent(new JPanel());
		
	}
	
	public Cool303Container(Cool303Theme Theme, String title) throws NullThemeExecption {
		if (Theme == null) throw new NullThemeExecption();
		components = new ArrayList<Cool303Component>();
		setTheme(Theme);
		setComponent(new JPanel());
		Cool303Label Title = new Cool303Label(Theme, title);
		Title.getComponent().setFont(new Font(null,   1,   15));
		getComponent().add(Title.getComponent());
		
	}
	
	
	
	@Override
	public void setTheme(Cool303Theme Theme) {
		super.setTheme(Theme);
		for (Cool303Component cool303Component : components) {
			cool303Component.setTheme(Theme);
		}
	}
	
	
	
	public void add(Cool303Component component) {
		components.add(component);
		getComponent().add(component.getComponent());
	}
	
	@Override
	public void paintTheme() {
		super.paintTheme();
		for (Cool303Component cool303Component : components) {
			cool303Component.paintTheme();
		}
	}

	public void setBoxLayout(Cool303Container container, int i) {
		getComponent().setLayout(new BoxLayout(getComponent(), i));
		
	}
}


import JavaCool303.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;


public class Cool303Main {
	  private static void TestTheme(Cool303Theme theme) {
	    	
	    	Cool303Root root = new Cool303Root(theme);
	    	Cool303Container container = null;
			try {
				container = new Cool303Container(theme , "Hello World");
			} catch (NullThemeExecption e) {
				e.printStackTrace();
			}
			container.setLayout(new GridLayout(10, 10));
			root.add(container);
	    	Cool303Container[] panels = new Cool303Container[4];
	    	ArrayList<Cool303Button> buttons = new ArrayList<Cool303Button>();
	    	Integer ButtonNumber = 1;
	    	try {
	    		 for (int j = 0 ; j<4; j++) {
			        	panels[j] = new Cool303Container(theme);
			        	panels[j].setBoxLayout(panels[j], 2);	
			          	for (int i = 0; i < 5; i++) {
			          		Cool303Button Button = new Cool303Button(theme,ButtonNumber.toString());
			          		Button.addActionListener(ButtonNumber.toString());
				        	ButtonNumber++;
				        	Button.setSize(new Dimension(200, 200));
				        	buttons.add(Button);
				        	panels[j].add(Button);
						}
			          	container.add(panels[j]);
			        }
			} catch (NullThemeExecption e) {
				// TODO: handle exception
			}
	    	root.paintTheme();
	    	root.setVisible(true);
	    	root.setSize(500, 500);
	    }

	    public static void main(String[] args) {
	    	Cool303Pastel pastel = new Cool303Pastel();
	    	Cool303Summer summer = new Cool303Summer();
	    	Cool303Winter winter = new Cool303Winter();
	    	TestTheme(winter);
	    }
}

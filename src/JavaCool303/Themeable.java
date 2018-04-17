package JavaCool303;

public interface Themeable {
	/*
	 * A Themeable should have a theme to be paint
	 */
	public void setTheme(Cool303Theme Theme);
	
	/*
	 * Get the Theme to paint
	 */
	public Cool303Theme getTheme();
	
	/*
	 * A method to paint every child component
	 */
	public void paintTheme();
}

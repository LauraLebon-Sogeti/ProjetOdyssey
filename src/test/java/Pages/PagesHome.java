package Pages;

import org.openqa.selenium.WebDriver;

import ressources.Menu;

public class PagesHome extends GenericPage {
	
	private Menu bMenu;
	
	public PagesHome() {
		
	}
	
	public PagesHome(WebDriver driver) {
		super.driver=driver;
		
	}

	public Menu getbMenu() {
		return bMenu;
	}
	

}

package ressources;

import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.testng.reporters.*;

import Pages.GenericPage;

public class Menu extends GenericPage{
	private By menuHeader = By.xpath("//div[@class='header-menu']");
	private By menuComputer = By.xpath("//div[@class='header-menu']/ul[@class='mob-top-menu']//a[@href='/computers']");
	private By submenuDesktop = By.xpath("//div[@class='header-menu']/ul[@class='mob-top-menu']//a[@href='/desktops']");
	
	
	public void cliquerElementMenu(By elementMenu) {
		boolean verif;
		
		
		try {
			verifierVisibiliteMenu(elementMenu);
			driver.findElement(elementMenu).click();

		}
		catch(Exception e){
			Reporter.log("impossible de cliquer sur le menu");
		}
	}
	
	//Accès par menu
	public void accederMenuComputers() {
		cliquerElementMenu(menuComputer);
		//TODO : vérification de la page affichée
		// vérifier que texte du xpath = partie du titre après chargement
	}
	
	public void accederSubMenuDesktops() {
		cliquerElementMenu(submenuDesktop);
		//TODO : vérification de la page affichée
		// vérifier que texte du xpath = partie du titre après chargement
	}
	
	//fonction de vérification
	
	public void verifierVisibiliteMenu(By elementMenu) {
		boolean verif;
		
		try {
			verif = driver.findElement(elementMenu).isDisplayed();
			Assert.assertTrue(verif);
		}
		catch(Exception e){
			Reporter.log("le menu n'est pas visible");
		}
	}
}

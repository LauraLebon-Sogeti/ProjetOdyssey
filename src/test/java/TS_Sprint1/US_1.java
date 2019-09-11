package TS_Sprint1;

import org.testng.annotations.Test;

import Pages.GenericPage;
import Pages.PagesHome;

public class US_1 extends GenericPage {
	
	@Test
	public void test_01() throws Exception{
		
		driver = OuvrirNavigateur("chrome");
		ChargerPageAccueil();
		
		//Etape 1 : Ouvrir le menu "computers"
		PagesHome pHome = new PagesHome();
		pHome.getbMenu().accederMenuComputers();
		
		//Etape 2 : ouvrir le sous-menu "desktops"
		pHome.getbMenu().accederSubMenuDesktops();
		
	}
	
}

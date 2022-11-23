package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLogin;

public class TestCase1 extends BaseClass{
 
	@Test
	public void tc1() {
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddToCartPage ad=new AddToCartPage(driver);
		driverutilies.doubleclick(driver, ad.getPlus());
		ad.cartbutton();
		
		driverutilies.alertpopup(driver);
	}
}

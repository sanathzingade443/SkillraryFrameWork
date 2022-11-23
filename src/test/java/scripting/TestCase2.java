package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;
import pomPages.TsstingPage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
				s.gearsbutton();
				s.skillrarydemoapp();
				
				driverutilies.switchtabs(driver);
				
				SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
				driverutilies.dropdown(sd.getCoursedd(),pdata.getdata("dropdownopt"));
				
				TsstingPage tp=new TsstingPage(driver);
				driverutilies.draganddrop(driver, tp.getSeleniumtraining(), tp.getCart());
				
				Point loc = tp.getTwitter().getLocation();
				int x=loc.getX();
				int y=loc.getY();
				
				driverutilies.scrollBar(driver, x, y);
				
				tp.twitterlogo();
						
	}

}

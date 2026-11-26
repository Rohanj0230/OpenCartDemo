package Testclass;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.HomePageEl;

public class TestID_001 extends Setup {

	@Test
	public void TestAccountRegistration() throws Exception {
		
		HomePageEl hm = new HomePageEl(driver);
		hm.MyAccount();
		hm.Register();
		AccountRegistrationPage Ac = new AccountRegistrationPage(driver);
		Ac.FirstName(RandomeString());
		Ac.LastName(RandomeString());
		Ac.Email(RandomeString() + "@gmail.com");
		Ac.Password(RandomNumber() + "@" + RandomeString());

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(866, 856)");
		Thread.sleep(4000);
		Ac.Agrbtn();
		Ac.sub();

	}

}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageEl extends PageBase {

	

	public HomePageEl(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//span[@class='d-none d-lg-inline' and text()='My Account']")
	WebElement MyAc;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Register']")
	WebElement Reg;

	public void MyAccount() {
		MyAc.click();

	}

	public void Register() {
		Reg.click();
	}

}

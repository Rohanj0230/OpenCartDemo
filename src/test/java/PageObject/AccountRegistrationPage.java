package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends PageBase {

	

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement fsname;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lsname;
	@FindBy(xpath = "//input[@name='email']")
	WebElement eml;
	@FindBy(xpath = "//input[@name='password']")
	WebElement pass;
	@FindBy(xpath = "//input[@type='checkbox' and @name ='agree']")
	WebElement agbtn;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement btn;

	public void FirstName(String Fs) {
		fsname.sendKeys(Fs);
	}

	public void LastName(String Ls) {
		lsname.sendKeys(Ls);
	}

	public void Email(String em) {
		eml.sendKeys(em);
	}

	public void Password(String Ps) {
		pass.sendKeys(Ps);
	}

	public void Agrbtn() {
		agbtn.click();
		
	}

	public void sub() {
		btn.click();
	}
}

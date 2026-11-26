package Testclass;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Setup {

	WebDriver driver;

	@BeforeMethod
	@Parameters("url")
	public void Set_Up(String ur) {

		driver = new ChromeDriver();

		driver.get(ur);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	public String RandomeString() {

		String s1 = RandomStringUtils.randomAlphabetic(5);
		return s1;
	}

	public String RandomNumber() {
		String s2 = RandomStringUtils.randomNumeric(10);
		return s2;
	}

	@AfterMethod
	public void TearDown() {
		// driver.close();
	}

}

package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepo.RediffLoginPage;

public class LoginAplication {
	
	WebDriver driver;
	
	@Before
	public void setupBeforeTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasia&Przemek\\Desktop\\Nauka\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		
	}
	
	@Test
	
	public void fillUsernameAndPasswordAndClickGoAndHome()
	{

		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.Email().sendKeys("hello@wp.pl");
		rd.Password().sendKeys("pass");
		rd.Submit().click();
		rd.Home().click();
	}

	
    @After
    public void teardown() {
        driver.quit();
    }
}

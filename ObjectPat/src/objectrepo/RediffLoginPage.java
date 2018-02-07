package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	String a;
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	WebDriver driver;
	By userName = By.xpath("//*[@id=\'login1\']");
	By password = By.xpath("//*[@id=\'password\']");
	By home = By.linkText("home");
	By go = By.name("proceed");
	

	
	public WebElement Email()
	{
		return driver.findElement(userName);
	}

	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Submit()
	{
		return driver.findElement(go);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}


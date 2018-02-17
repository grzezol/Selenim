package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.RediffHomePagePF;
import objectRepo.RediffLoginPagePF;

public class LoginAp {
	WebDriver driver;
	
	
    @Before
	public void setup()
	{
	
    	System.out.println("przed testem");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kasia&Przemek\\Desktop\\Nauka\\chromedriver.exe");
    	
    	
	}
    
    @Test
    public void loginToPage() throws InterruptedException
    {
    		
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	// jezeli chcemy miec dostep do metod z klasy RediffLoginPage to musimy stworzyc obiekt tej klasy (objest of this class)
    	
    	RediffLoginPagePF rd = new RediffLoginPagePF(driver); // jako argumet przekazujemy driver zeby bylo wiadomo ze korzystamy z chrome i jezeli chcemy to przekazac jako argument to trzeba stworzyc w klasie RediffLoginPage konstruktor dla tego jednego argumentu
    	// do wyzej czyli po uruchomieniu programu  gdy stworzymy ten obiekt to automatycznie konstruktor zostanie wykonany
    rd.Email().sendKeys("pidzipidzi");
    rd.Password().sendKeys("pass");
    //rd.Submit().click();
    rd.Home().click();	
    
    RediffHomePagePF hp = new RediffHomePagePF(driver);
    Thread.sleep(3000);
    hp.searchIconObj().click();
    hp.search().sendKeys("pidzpidzipidzisearch");
    hp.searchButton().click();
    }
	
    @After
    public void teardown() {
        driver.quit();
    }

	
}

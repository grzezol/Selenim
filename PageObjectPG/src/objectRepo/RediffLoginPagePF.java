package objectRepo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	

WebDriver driver;



public RediffLoginPagePF(WebDriver driver) //konstruktor z argumentem driver ktory jest potrzebny do tworzenia obiektu z tescie LoginAp   przekazany z tamtad argumnet driver jest przypisany do tego lokalnego
	{   
	this.driver = driver;    // driver z Testu jest przypisany do lokalnego drivera i dzieki temu zachowuje se jako test case driver //musi wiedziec ze jest uzywany driver chrome
	PageFactory.initElements(driver, this);  // pozwala wszystkim obiektom ponizej mogorwac sie do page objedct factory
	}

//////Page Object Factory///////////////////
@FindBy(xpath="//*[@id=\'login1\']") // znajdz jako xpath //adnotacja FindBy
WebElement userName;  //nadaj imie username

@FindBy(xpath="//*[@id=\'password\']")
WebElement password;

@FindBy(name="proceed")
WebElement go;

@FindBy(linkText="Home")
WebElement home;


public WebElement Email()    // musimy wiedziec jaki tyb zwraca metoda w naszym wypadku jest to WebElement
{
	return userName;
}
public WebElement Password()
{
	return password;
}
public WebElement Submit()
{
	return go;
}
public WebElement Home()
{
	return home;
}
}



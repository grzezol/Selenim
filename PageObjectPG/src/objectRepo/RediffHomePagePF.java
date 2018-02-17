package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.PatternFilenameFilter;

public class RediffHomePagePF {

	WebDriver driver;

	public RediffHomePagePF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(id="srch_show_hide_btn")
	WebElement searchIcon;
	
	@FindBy(id="srchword")
	WebElement searchTextfield;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchButton;
	
	public WebElement searchIconObj() {
		return searchIcon;
	}
		
	public WebElement search() {
		return searchTextfield;
	}

	public WebElement searchButton() {
		return searchButton;
	}
}
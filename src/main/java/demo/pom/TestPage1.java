package demo.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestPage1{
	
	public TestPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "APjFb")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	@FindBy(xpath = "(//ul[@class='G43f7e'])[1]/li")
	private List<WebElement> searchlists;

	public List<WebElement> getSearchlists() {
		return searchlists;
	}
	
	
	
}

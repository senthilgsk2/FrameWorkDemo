package demo.steps;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import demo.pom.TestPage1;
import demo.utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass{
	
	TestPage1 testPage1;
	
	@Given("launch site test")
	public void launch_site_test() throws IOException {
		testPage1 = new TestPage1(driver);
		launchURL(readProperty("url"));
	}
	
	@Given("testing given")
	public void testing_given() {
		testPage1 = new TestPage1(driver);
		testPage1.getSearchBox().sendKeys("test");
	}
	@When("test when")
	public void test_when() {
		List<WebElement> list = testPage1.getSearchlists();
		for (WebElement webElement : list) {
			if(webElement.getText().equalsIgnoreCase("test speed")) {
				webElement.click();
				break;
			}
		}
		System.out.println("when method");
	}
	@Then("test then")
	public void test_then() {
		System.out.println("then method");
	}
	
	@Given("testing given2")
	public void testing_given2() {
	   
	}
	@When("test when2")
	public void test_when2() {
		System.out.println("when method 2");
	}
	@Then("test then2")
	public void test_then2() {
		System.out.println("then method 2");
	}
	
	@Given("testing outline given is {string}")
	public void testing_outline_given_is(String string) {
		//launchURL(readProperty("url"));
		testPage1.getSearchBox().sendKeys(string);
	}
	
	@Then("test outline then")
	public void test_outline_then() {
	    System.out.println("test git pull");
	}
}

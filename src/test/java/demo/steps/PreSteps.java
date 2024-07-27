package demo.steps;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import demo.utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class PreSteps extends BaseClass{
	
	@BeforeAll
	public static void launchSite() {
		//launchURL("https://www.google.com/");
	}
	@After
	public static void faliedScenarios(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot src = (TakesScreenshot) driver;
			byte[] srcFile = src.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcFile, "image/png", scenario.getName());
			String descFile = "src/test/resource/ScreenShots/"+scenario.getName()+".png";
			Files.write(Path.of(descFile), srcFile);
			scenario.log(scenario.getStatus().toString());
		}
		System.out.println(scenario.getStatus());
	}
	
}

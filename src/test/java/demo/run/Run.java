package demo.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/main/resource",
		glue = "demo.steps",
		dryRun = false,
		tags = "@test",
		plugin = {"pretty", "html:src/test/resource/Reports/report.html"},
		monochrome = true
		)


public class Run {

}

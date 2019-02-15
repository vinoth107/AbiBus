package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VINOTH KUMAR\\eclipse-workspace\\Cucumber4\\Abibus_Sreach.feature",
glue = { "StepDefination" }, 
plugin = {"html:target1" },
monochrome= true,
strict = true)

public class Runner {

}

package projectName.runners;

//package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.log4testng.Logger;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/Cucumber-report/cucumber.html" },
        features = { "src/test/resources/projectName" },glue = {"projectName.stepdefs"})
public class Runner {

//    static final Logger LOGGER = Logger.getLogger(Runner.class);

}




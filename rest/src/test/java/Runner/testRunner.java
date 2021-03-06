package Runner;


import org.junit.runner.RunWith;
import org.omg.Messaging.SyncScopeHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/java/features/bitlyapi.feature",
   glue = "stepDefination",
   plugin = { "pretty", "html:target/cucumber-reports" },
	monochrome = true,
	strict = true
   )
public class testRunner {
	 

}

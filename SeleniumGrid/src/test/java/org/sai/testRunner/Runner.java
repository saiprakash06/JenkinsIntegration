package org.sai.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/FeatureFiles/"},
        glue = {"org.sai.glueCode","org.sai.Hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"},
        tags = "@chrome or @edge"
//        dryRun = true
//        monochrome = true

)
public class Runner extends AbstractTestNGCucumberTests {

    
}

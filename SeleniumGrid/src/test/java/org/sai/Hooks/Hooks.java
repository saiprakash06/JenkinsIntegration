package org.sai.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    public static WebDriver driver;


    @Before
    public void setUp(Scenario scenario) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        if (scenario.getSourceTagNames().contains("@chrome")) {
            WebDriverManager.chromedriver().setup();
            dc.setBrowserName("chrome");
//            driver = new RemoteWebDriver(new URL("http://192.168.1.164:4444/wd/hub"), dc);
            driver = new ChromeDriver();

        } else if (scenario.getSourceTagNames().contains("@edge")) {
            WebDriverManager.edgedriver().setup();
            dc.setBrowserName("MicrosoftEdge");
//            driver = new RemoteWebDriver(new URL("http://192.168.1.164:4444/wd/hub"), dc);
            driver = new EdgeDriver();
        }
    }


    @After

    public void terDown() {

        if (driver != null) {
            driver.quit();
        }
    }

}

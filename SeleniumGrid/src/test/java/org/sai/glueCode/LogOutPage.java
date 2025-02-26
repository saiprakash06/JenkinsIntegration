package org.sai.glueCode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sai.Hooks.Hooks;

public class LogOutPage {

    WebDriver driver= Hooks.driver;

    @Given("User is Click on hamberger menu")
    public void user_is_click_on_hamberger_menu() {
        System.out.println("User is Click on hamberger menu!!!!!!");
        driver.get("http://www.google.com");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.google.com/");
//        driver.quit();
    }

    @When("User Select logout option")
    public void user_select_logout_option() {
        System.out.println("User Select logout option!!!!!!!!!!!");
    }

    @Then("User shoud be on login page")
    public void user_shoud_be_on_login_page() {
        System.out.println("User shoud be on login page!!!!!!!!!");
    }

}

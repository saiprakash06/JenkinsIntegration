package org.sai.glueCode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sai.Hooks.Hooks;

public class LoginPage {

    WebDriver driver= Hooks.driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page!!!!!!!!");
        driver.get("http://www.google.com");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.quit();
    }

    @When("User enter correct credentials")
    public void user_enter_correct_credentials() {

        System.out.println("User enter correct credentials!!!!");
    }

    @Then("User should be on dashboard page")
    public void user_should_be_on_dashboard_page() {
        System.out.println("User should be on dashboard page!!!!");
    }

    @Then("User should see all the required details")
    public void user_should_see_all_the_required_details() {
        System.out.println("User should see all the required details!!!!!!!!!");
    }
}

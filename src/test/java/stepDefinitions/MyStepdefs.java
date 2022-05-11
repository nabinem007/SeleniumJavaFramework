package stepDefinitions;

import PageObjects.LoginPage;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {
    public WebDriver driver;
    public LoginPage lp;


    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nabin\\IdeaProjects\\CucumberFramework\\Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);


    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @And("User enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        lp.setUserName(email);
        lp.setPassword(password);


    }

    @And("Click on login")
    public void click_on_login() throws InterruptedException {
        lp.clickLogin();
       Thread.sleep(3000);

    }

    @Then("i reach on home screen")
    public void i_reach_on_home_screen() {
       String title = driver.getTitle();
        System.out.println(title);



    }
    @Then("close the browser")
    public void close_the_browser() {
        driver.close();
    }

}



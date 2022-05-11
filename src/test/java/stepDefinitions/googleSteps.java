package stepDefinitions;

import io.cucumber.java.en.*;
import PageObjects.Google;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSteps {
    static WebDriver driver = null;

    public static void main(String[] args) {
        gogglesteps();

    }

    public static void gogglesteps(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nabin\\IdeaProjects\\CucumberFramework\\Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Google searchpage = new Google(driver);

        driver.get("https://google.com");
        searchpage.SetText("ABCD");

        searchpage.clickSearch();

        driver.close();


    }



}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google {

    WebDriver driver ;

    @FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
    WebElement search ;

    @FindBy(name = "btnK")
    WebElement googleSearch;

    public Google(WebDriver driver){
        this.driver = driver;
    }

    public void SetText(String Text){
        driver.findElement((By) search).sendKeys(Text);
    }

    public void clickSearch(){
        driver.findElement((By) googleSearch).click();


    }

}

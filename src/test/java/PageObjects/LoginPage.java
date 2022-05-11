package PageObjects;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory ;

public class LoginPage {
    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    @CacheLookup
    WebElement txtemail ;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    @CacheLookup
    WebElement txtpassword;

    @FindBy(xpath = "//*[@data-testid = 'royal_login_button']")
    @CacheLookup
    WebElement btnlogin ;

    @FindBy(xpath = "//div/a[@aria-label = 'Home']")
    @CacheLookup
    WebElement home ;

    public void setUserName(String uname){
        txtemail.clear();
        txtemail.sendKeys(uname);

    }

    public void setPassword(String pwd){
        txtpassword.clear();
        txtpassword.sendKeys(pwd);

    }

    public void clickLogin(){

        btnlogin.click();
    }




}

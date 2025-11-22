package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "username")
    WebElement testUsername;
    @FindBy(css = "input[type='password']")
    WebElement testpassword;
    @FindBy(css = "button[type='submit']")
    List<WebElement>submitButton;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);


    }
    public void login(String username, String password) throws InterruptedException {
        testUsername.sendKeys(username);
        Thread.sleep(500);
        testpassword.sendKeys(password);
        submitButton.get(0).click();

    }
}

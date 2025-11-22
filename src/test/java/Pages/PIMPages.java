package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class PIMPages {
    @FindBy(className = "oxd-main-menu-item")
    List<WebElement> pimMenu;
    @FindBy(className = "oxd-button")
    List<WebElement>addButton;
    @FindBy(name = "firstName")
    WebElement inputfirstName;

    @FindBy(name = "middleName")
    WebElement inputMiddleName;

    @FindBy(name = "lastName")
    WebElement inputLastName;

    @FindBy(className = "oxd-switch-input")
    List<WebElement> switchButton;

    @FindBy(className = "oxd-input")
    List<WebElement> inputUserName;

    @FindBy(className = "oxd-input")
    List<WebElement> inputPassword;
    @FindBy(className = "oxd-input")
    List<WebElement> inputConfirmPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submittbutton;



    public PIMPages(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void inputPIMInfo(String firstName, String middleName, String lastName,String userName ,String password, String confirmPassord) throws InterruptedException {
        pimMenu.get(1).click();
        Thread.sleep(2000);
        addButton.get(2).click();
        Thread.sleep(3000);
        inputfirstName.sendKeys(firstName);
        Thread.sleep(2000);
        inputMiddleName.sendKeys(middleName);
        Thread.sleep(2000);
        inputLastName.sendKeys(lastName);
        Thread.sleep(2000);
        switchButton.get(0).click();
        Thread.sleep(2000);
        inputUserName.get(5).sendKeys(userName);
        Thread.sleep(2000);
        inputPassword.get(6).sendKeys(password);
        Thread.sleep(2000);
        inputConfirmPassword.get(7).sendKeys(confirmPassord);
        Thread.sleep(2000);
        submittbutton.click();



    }
}

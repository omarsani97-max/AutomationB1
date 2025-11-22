package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoninTestRunner  extends Setup {
    @Test
    public void doLoginWithValidCred() throws InterruptedException {
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login("Admin","admin123");
        Thread.sleep(4000);

        WebElement MatchText= driver.findElement(By.xpath("//span/h6"));
        String ActualTest=MatchText.getText();
        String TestExpeted="Dashboard";
        Assert.assertEquals(ActualTest.trim(),TestExpeted);
        Thread.sleep(4000);



    }
}

package TestRunner;

import Config.Setup;
import Pages.LoginPage;
import Pages.PIMPages;
import com.github.javafaker.Faker;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTestRunner extends Setup {
    @Test(priority = 1, description = "valid credential")
    public void doLoginWithValidCred() throws InterruptedException {
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login("Admin","admin123");
        Thread.sleep(4000);

//        WebElement MatchText= driver.findElement(By.xpath("//span/h6"));
//        String ActualTest=MatchText.getText();
//        String TestExpeted="Dashboard";
//        Assert.assertEquals(ActualTest.trim(),TestExpeted);
//        Thread.sleep(4000);

    }
@Test(priority = 2, description = "valid credential")
    public void enterPIMInfo() throws InterruptedException {
    PIMPages pimPages= new PIMPages(driver);
    Faker faker= new Faker();
    String firstName= faker.name().firstName();
    String middleName= faker.name().nameWithMiddle();
    String lastName =faker.name().lastName();
    String userName = faker.name().username();
    String password = "a123456@A";
    String confirmPassword="a123456@A";

    pimPages.inputPIMInfo(firstName,middleName,lastName,userName,password,confirmPassword);
    Thread.sleep(3000);

    }
}
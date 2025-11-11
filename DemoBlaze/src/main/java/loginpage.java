import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class loginpage {
    WebDriver driver;
    By homepagelogin_btn= By.id("login2");
    By loginusername=By.id("loginusername");
    By loginpassword=By.id("loginpassword");
    By loginbutton = By.xpath("//button[contains(text(),'Log in')]");
    By welcomemessage = By.id("nameofuser");
    String expectedwelcomemessage = "Welcome joshua1212";
    WebDriverWait wait;



    public loginpage(WebDriver driver){

        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterloginusername(){

     driver.findElement(loginusername).sendKeys("joshua1212");
    }
    public void enterloginpassword(){

        driver.findElement(loginpassword).sendKeys("123456789");
    }
    public void pressonloginbutton(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loginbutton))).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(welcomemessage));

    }

    public void loginwelcomemessage(){

        Assert.assertTrue(driver.findElement(welcomemessage).isDisplayed());
        Assert.assertFalse(false, "Log in");
    }

}

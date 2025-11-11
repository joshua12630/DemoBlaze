import ch.qos.logback.core.pattern.color.BoldYellowCompositeConverter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class signuppage {

    WebDriver driver;
    Alert alert;
    WebDriverWait waiting;

    By Signup = By.id("signin2");
    By usernamearea = By.xpath("//input[@id='sign-username']");
    By passwordarea = By.xpath("//input[@id='sign-password']");
    By Signup_two = By.xpath("//button[@onclick=\"register()\"]");


    public signuppage(WebDriver driver) {
        this.driver = driver;
    }

    public void sign_up(String username, String password) {
        driver.findElement(Signup).click();
        driver.findElement(usernamearea).sendKeys(username);
        driver.findElement(passwordarea).sendKeys(password);
        driver.findElement(Signup_two).click();

    }
}




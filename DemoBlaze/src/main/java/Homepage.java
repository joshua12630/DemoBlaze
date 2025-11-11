import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Homepage {

    WebDriver driver;
     By signupbutton  = By.id("signin2");
    By homepagelogin_btn= By.id("login2");
    By signup = By.xpath("//a[@id=\"signin2\"]");


    public Homepage(WebDriver driver){
        this.driver = driver;
    }
    public void pressonsignupbutton1(){
        driver.findElement(signup).click();

    }

    public loginpage homepageloginbutton(){

        driver.findElement(homepagelogin_btn).click();
        return new loginpage(driver);

    }
    public void pressonsignupbutton(){
        driver.findElement(signupbutton).click();
    }



    public void choosingproduct(){

        driver.findElement(By.id("itemc")).equals(0);


    }

    }



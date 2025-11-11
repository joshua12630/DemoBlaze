import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class basetest {
     WebDriver driver;
    Homepage homepage;
    signuppage Signuppage;
    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.navigate().to(("https://demoblaze.com/"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        homepage= new Homepage(driver);
        Signuppage = new signuppage(driver);

    }


//   @AfterClass
//    public void end() throws InterruptedException {
//       if (driver != null) {
//           Thread.sleep(100000);
//           driver.quit();
//       }
//
//   }
}


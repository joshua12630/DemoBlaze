import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class signuppagetest extends basetest{
    WebDriver driver;
    Homepage homepage;

    @Test
    public void validatesignupisingvalidusernamevalidpasswrd() {
        Signuppage.sign_up("joshua1212", "123456789");

    }

    @Test
    public void invalidatesignupisingvalidusernamevalidpasswrd() {
        Signuppage.sign_up("joshua12##12", "123456789");

    }

    }


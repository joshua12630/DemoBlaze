import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginpagetest extends basetest{
    loginpage loginpage;



    @Test
    public void testingloginpage(){
        loginpage = homepage.homepageloginbutton();
        loginpage.enterloginusername();
        loginpage.enterloginpassword();
        loginpage.pressonloginbutton();
       loginpage.loginwelcomemessage();



    }

    }

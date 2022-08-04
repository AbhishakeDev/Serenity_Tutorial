package apptest;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Steps
    LoginSteps loginSteps;

    @Managed()
    WebDriver browser;

    @Test
    public  void appLogInTest(){
        loginSteps.isOnLoginPage();
        loginSteps.loginAsUser();
        loginSteps.userShouldBeLoggedIn();
    }
}

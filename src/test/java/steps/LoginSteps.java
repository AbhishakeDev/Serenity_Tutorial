package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import uipages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLoggedIn(){
        Assert.assertTrue(loginPage.accountPageVisible().equals("MY ACCOUNT"));
    }
}

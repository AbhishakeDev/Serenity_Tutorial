package apptest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.AccPageSteps;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class AccPageTest {

    @Steps
    LoginSteps loginPageSteps;

    @Steps
    AccPageSteps accPageSteps;

    @Managed
    WebDriver browser;

    @Before
    public void setup() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
    }

    @Test
    public void accPageLogoTest() {
        accPageSteps.validateAppLogo();
    }

    @Test
    public void searchTest() {
        String result = accPageSteps.searchProduct("Dress", "T-shirts > Faded Short Sleeve T-shirts");
        Assert.assertTrue(result.equals("Faded Short Sleeve T-shirts"));
    }

    @Test
    public void accPageTitleTest() {
        Assert.assertTrue(accPageSteps.getAccPageTitle().equals("My account - My Store"));
    }
}
package uipages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {
    public void doLogin(){
        $("#email").sendKeys("dec2020secondbatch@gmail.com");
        $("#passwd").sendKeys("Selenium@12345");
        $("#SubmitLogin").click();
    }
    public String accountPageVisible(){
        return $("div#center_column h1").getText();
    }
}

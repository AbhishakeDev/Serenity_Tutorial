package steps;

import net.thucydides.core.annotations.Step;
import uipages.AccPage;

public class AccPageSteps {

    private AccPage accPage;

    @Step
    public void validateAppLogo(){
        accPage.isLogoExist();
    }

    @Step
    public String searchProduct(String searchKey, String productName){
        return accPage.doSearch(searchKey, productName);
    }

    @Step
    public String getAccPageTitle(){
        return accPage.getAccPageTitle();
    }


}

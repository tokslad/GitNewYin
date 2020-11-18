package stepdefs;

import Utilities.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;

public class HomeStepDefs {
    public WebDriver driver;
    HomePage homePage;

    public HomeStepDefs(Hooks hooks) {
        driver = hooks.getDriver();
        homePage = new HomePage(hooks);
    }

    @Given("^a user navigate to(.*)")
    public void aUserNavigateTo(String url){
        homePage.navigateToUrl(url);
    }

    @And("^a user click on run button$")
    public void aUserClickOnRunButton(){
        homePage.clickOnRunButton();

    }

//    @Then("^the text(.*) is displayed in the Output Window$")
//    public void theTextIsDisplayedInTheOutputWindow(String windowOutput){
//        Assert.assertEquals(windowOutput," Hello World");
//    }
}

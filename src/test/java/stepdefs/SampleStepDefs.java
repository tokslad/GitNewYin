package stepdefs;

import Utilities.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.SamplePage;

public class SampleStepDefs {
    public WebDriver driver;
    SamplePage samplePage;

    public SampleStepDefs(Hooks hooks) {
        this.driver = hooks.getDriver();
        samplePage = new SamplePage(hooks);
    }

    @When("I enter names start with {string}")
    public void iEnterNamesStartWith(String NameHere) {
        samplePage.IEnterNameHere(NameHere);

    }

    @And("I enter {string} in the search box")
    public void iEnterInTheSearchBox(String PackageName) {
        samplePage.IEnterPackageName(PackageName);
    }


    @Then("I should be able to add Nunit package successfully")
    public void iShouldBeAbleToAddNunitPackageSuccessfully() {
    }


    @And("I select Nunit")
    public void iSelectNunit() throws InterruptedException {
        samplePage.ISelectNunit();
    }

    @And("I click on version {string}")
    public void iClickOnVersion(String versionName) throws InterruptedException {
        samplePage.IClickOnVersionName(versionName);
    }

    @Then("the Nunit package added successfully")
    public void theNunitPackageAddedSuccessfully() {
        Assert.assertEquals(samplePage.IsNunitAdded(),"NUnit");
    }
}

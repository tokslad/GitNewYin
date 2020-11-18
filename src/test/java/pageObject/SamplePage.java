package pageObject;

import Utilities.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamplePage {
    public WebDriver driver;


    public SamplePage(Hooks hooks) {
        this.driver = hooks.getDriver();
    }


    By nameHere = By.xpath("//*[@placeholder='Enter name here...']");
    By packageName = By.xpath("//input[@type=\"search\"]");
    By nunit = By.xpath("//*[@id='ui-id-1']");
    By addNunit = By.xpath("//*[@package-id='NUnit']");



    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }


    public void IEnterNameHere(String NameHere){
        driver.findElement(nameHere).click();
        driver.findElement(nameHere).sendKeys(NameHere);
    }

    public void IEnterPackageName(String PackageName){
        driver.findElement(packageName).sendKeys(PackageName);
    }

    public void ISelectNunit() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(nunit).click();
    }

    public void IClickOnVersionName(String verName) throws InterruptedException {
        Thread.sleep(5000);
        By versionName = By.xpath("//*[@package-id='NUnit'][@version-name='" + verName + ".0']");
        driver.findElement(versionName).click();
    }

    public String IsNunitAdded(){
        return driver.findElement(addNunit).getText();
    }
}




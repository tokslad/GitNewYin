package pageObject;

import Utilities.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    public WebDriver driver;

    By runButton = By.xpath("//*[@id=\"run-button\"]");
    By windowOutPut = By.cssSelector("div[id='output']");


    public HomePage(Hooks hooks){
        this.driver = hooks.getDriver();
    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void clickOnRunButton(){
        driver.findElement(runButton).click();
    }

    public boolean isWindowOutputDisplayed(String windowOutput){
        return driver.findElement(windowOutPut).isDisplayed();

    }

//    public String getWindowOutputtext(){
//        driver.findElement(windowOutPut).getText();
//    }









}
